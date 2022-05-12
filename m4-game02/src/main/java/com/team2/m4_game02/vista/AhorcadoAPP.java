package com.team2.m4_game02.vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.team2.m4_game02.controler.Partida;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JButton;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;

import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class AhorcadoAPP extends JFrame {

	private JPanel contentPane;
	private final String[] letras = { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "Ñ", "O",
			"P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z" };
	Partida partida ;
	String palabra;
	ArrayList<EtiquetaLetra> listaEtiquetasLetras = new ArrayList<EtiquetaLetra>();
	ArrayList<JButton> listaBotonesPistas = new ArrayList<JButton>();
	Hashtable<String, JButton> tablaDeBotones = new Hashtable<String, JButton>();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AhorcadoAPP frame = new AhorcadoAPP();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public AhorcadoAPP() {
		partida =  new Partida();
		palabra = partida.getPalabra().toUpperCase();
		
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 675, 614);

		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		JMenu mnNewMenu = new JMenu("Archivo");
		menuBar.add(mnNewMenu);

		JMenuItem mntmNewMenuItem = new JMenuItem("Nueva Partida");

		mnNewMenu.add(mntmNewMenuItem);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		// Numero para que vaya cambiando de imagen en la ruta
		int numero = 0;
		JPanel panel = new JPanel();
		panel.setBounds(475, 42, 174, 206);
		contentPane.add(panel);
		JLabel lblNewLabel = new JLabel("");
		panel.add(lblNewLabel);
		lblNewLabel.setVerticalAlignment(SwingConstants.BOTTOM); // Ruta de las imagenes más variable para ir cambiando
		lblNewLabel.setIcon(new ImageIcon(
				AhorcadoAPP.class.getResource("/Imagenes/el-ahorcado-0" + partida.getIntentos() + ".jpg")));

		JLabel lblResultado = new JLabel("");
		lblResultado.setBounds(475, 262, 174, 176);
		contentPane.add(lblResultado);

		JLabel lblNewLabel_1 = new JLabel("Intentos Fallidos:");
		lblNewLabel_1.setBounds(498, 17, 95, 14);
		contentPane.add(lblNewLabel_1);

		JLabel lblIntentos = new JLabel(partida.getIntentos() + "");
		lblIntentos.setForeground(Color.RED);
		lblIntentos.setBounds(603, 17, 46, 14);
		contentPane.add(lblIntentos);
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				resetLetras();
				partida = new Partida();
				palabra = partida.getPalabra().toUpperCase();
				cargarLetras();
				resetPistas();
				resetBotonesLetras();
				lblIntentos.setText(partida.getIntentos() + "");
				lblResultado.setIcon(null);
				lblNewLabel.setIcon(new ImageIcon(
						AhorcadoAPP.class.getResource("/Imagenes/el-ahorcado-0" + partida.getIntentos() + ".jpg")));
			}

		});

		// ComboBox con las palabrass
		JComboBox comboBox = new JComboBox();
		comboBox.addItem("perro");
		comboBox.addItem("gato");
		contentPane.add(comboBox);

		System.out.println(comboBox.getItemCount());
		comboBox.setVisible(false);

		// Metodo para añadir palabras

		// Menu Acerca De
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Acerca de");
		mntmNewMenuItem_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, acercaDe());
			}
		});

		JButton btnTemporal;
		int posicionXBotones = 10;
		int posicionYBotones = 242;

		// Se gennera la lista de botones de letras dinamicamente
		for (int i = 0; i < letras.length; i++) {
			btnTemporal = new JButton(letras[i]);
			btnTemporal.setBounds(posicionXBotones, posicionYBotones, 50, 50);
			if (posicionXBotones < 211) {

				posicionXBotones += 50;

			} else {

				posicionXBotones = 10;
				posicionYBotones += 50;

			}
			btnTemporal.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					char letraPulsada = ((JButton) e.getSource()).getText().charAt(0);
					// Se comprueba la letra si esta en la plabra se cambia
					if (partida.comprobarletras(letraPulsada)) {

						cambiarLetra(letraPulsada);

					} else {

						// Sino se modifica la imagen y el label de intentos
						lblNewLabel.setIcon(new ImageIcon(AhorcadoAPP.class
								.getResource("/Imagenes/el-ahorcado-0" + partida.getIntentos() + ".jpg")));
						lblIntentos.setText(String.valueOf(partida.getIntentos()));

					}
					// Se desactiva el la letra pulsada
					((JButton) e.getSource()).setEnabled(false);
					if (!partida.comprobarPartida()) {

						if (partida.comprobarGanado()) {

							lblResultado.setIcon(new ImageIcon(AhorcadoAPP.class.getResource("/Imagenes/ganador.jpg")));

						} else {

							lblResultado
									.setIcon(new ImageIcon(AhorcadoAPP.class.getResource("/Imagenes/perdedor.jpg")));

						}

						bloquearBotones();

					}

				}
			});
			tablaDeBotones.put(letras[i], btnTemporal);
			contentPane.add(btnTemporal);

		}

		JMenuItem mntmNewMenuItem_3 = new JMenuItem("Añadir Palabra");
		mntmNewMenuItem_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String palabraAñadida = JOptionPane.showInputDialog("Introduce una palabra al diccionarios");
				partida.AñadirPalabra(palabraAñadida);
			}
		});
		mnNewMenu.add(mntmNewMenuItem_3);

		mnNewMenu.add(mntmNewMenuItem_2);

		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Salir");
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				System.exit(0);

			}
		});
		mnNewMenu.add(mntmNewMenuItem_1);

		JButton btnPista = new JButton("");
		btnPista.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				char letra = partida.usarPista();
				cambiarLetra(letra);
				tablaDeBotones.get(String.valueOf(letra)).setEnabled(false);
				((JButton) e.getSource()).setBackground(Color.GREEN);
				((JButton) e.getSource()).setEnabled(false);
				if (!partida.comprobarPartida()) {

					if (partida.comprobarGanado()) {

						lblResultado.setIcon(new ImageIcon(AhorcadoAPP.class.getResource("/Imagenes/ganador.jpg")));

					} else {

						lblResultado.setIcon(new ImageIcon(AhorcadoAPP.class.getResource("/Imagenes/perdedor.jpg")));

					}

					bloquearBotones();

				}

			}
		});
		btnPista.setBackground(Color.RED);
		btnPista.setForeground(Color.BLACK);
		btnPista.setBounds(10, 21, 50, 50);
		listaBotonesPistas.add(btnPista);
		contentPane.add(btnPista);

		JButton btnPista1 = new JButton("");
		btnPista1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				char letra = partida.usarPista();
				cambiarLetra(letra);
				tablaDeBotones.get(String.valueOf(letra)).setEnabled(false);
				((JButton) e.getSource()).setBackground(Color.GREEN);
				((JButton) e.getSource()).setEnabled(false);
				if (!partida.comprobarPartida()) {

					if (partida.comprobarGanado()) {

						lblResultado.setIcon(new ImageIcon(AhorcadoAPP.class.getResource("/Imagenes/ganador.jpg")));

					} else {

						lblResultado.setIcon(new ImageIcon(AhorcadoAPP.class.getResource("/Imagenes/perdedor.jpg")));

					}

					bloquearBotones();

				}

			}
		});
		btnPista1.setBackground(Color.RED);
		btnPista1.setForeground(Color.BLACK);
		btnPista1.setBounds(60, 21, 50, 50);
		listaBotonesPistas.add(btnPista1);
		contentPane.add(btnPista1);

		JButton btnPista2 = new JButton("");
		btnPista2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				char letra = partida.usarPista();
				cambiarLetra(letra);
				tablaDeBotones.get(String.valueOf(letra)).setEnabled(false);
				((JButton) e.getSource()).setBackground(Color.GREEN);
				((JButton) e.getSource()).setEnabled(false);
				if (!partida.comprobarPartida()) {

					if (partida.comprobarGanado()) {

						lblResultado.setIcon(new ImageIcon(AhorcadoAPP.class.getResource("/Imagenes/ganador.jpg")));

					} else {

						lblResultado.setIcon(new ImageIcon(AhorcadoAPP.class.getResource("/Imagenes/perdedor.jpg")));

					}

					bloquearBotones();

				}

			}
		});
		btnPista2.setBackground(Color.RED);
		btnPista2.setForeground(Color.BLACK);
		btnPista2.setBounds(110, 21, 50, 50);
		listaBotonesPistas.add(btnPista2);
		contentPane.add(btnPista2);

		JButton btnPista3 = new JButton("");
		btnPista3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				char letra = partida.usarPista();
				cambiarLetra(letra);
				tablaDeBotones.get(String.valueOf(letra)).setEnabled(false);
				((JButton) e.getSource()).setBackground(Color.GREEN);
				((JButton) e.getSource()).setEnabled(false);
				if (!partida.comprobarPartida()) {

					if (partida.comprobarGanado()) {

						lblResultado.setIcon(new ImageIcon(AhorcadoAPP.class.getResource("/Imagenes/ganador.jpg")));

					} else {

						lblResultado.setIcon(new ImageIcon(AhorcadoAPP.class.getResource("/Imagenes/perdedor.jpg")));

					}

					bloquearBotones();

				}

			}
		});
		btnPista3.setBackground(Color.RED);
		btnPista3.setForeground(Color.BLACK);
		btnPista3.setBounds(160, 21, 50, 50);
		listaBotonesPistas.add(btnPista3);
		contentPane.add(btnPista3);

		JButton btnPista4 = new JButton("");
		btnPista4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				char letra = partida.usarPista();
				cambiarLetra(letra);
				tablaDeBotones.get(String.valueOf(letra)).setEnabled(false);
				((JButton) e.getSource()).setBackground(Color.GREEN);
				((JButton) e.getSource()).setEnabled(false);
				if (!partida.comprobarPartida()) {

					if (partida.comprobarGanado()) {

						lblResultado.setIcon(new ImageIcon(AhorcadoAPP.class.getResource("/Imagenes/ganador.jpg")));

					} else {

						lblResultado.setIcon(new ImageIcon(AhorcadoAPP.class.getResource("/Imagenes/perdedor.jpg")));

					}

					bloquearBotones();

				}

			}
		});
		btnPista4.setBackground(Color.RED);
		btnPista4.setForeground(Color.BLACK);
		btnPista4.setBounds(210, 21, 50, 50);
		listaBotonesPistas.add(btnPista4);
		contentPane.add(btnPista4);

		JLabel lblNewLabel_2 = new JLabel("PISTAS");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 23));
		lblNewLabel_2.setBounds(10, 82, 86, 28);
		contentPane.add(lblNewLabel_2);

		cargarLetras();

		/*
		 * EtiquetaLetra etiquetaLetra = (EtiquetaLetra) iteratorLetras.next();
		 * contentPane.add(etiquetaLetra);
		 */

	}

	private void cargarLetras() {

		int xLetra = 10;

		for (int i = 0; i < this.palabra.length(); i++) {

			listaEtiquetasLetras.add(new EtiquetaLetra(xLetra, 180));
			xLetra += 50;
			contentPane.add(listaEtiquetasLetras.get(i));
		}
		System.out.println(palabra);

	}

	private void cambiarLetra(char letra) {

		// System.out.println(letra);
		for (int i = 0; i < palabra.length(); i++) {

			if (palabra.charAt(i) == letra) {

				listaEtiquetasLetras.get(i).setText(String.valueOf(letra));

			}

		}

	}

	private void resetPistas() {

		Iterator<JButton> iteradorPistas = listaBotonesPistas.iterator();
		while (iteradorPistas.hasNext()) {
			JButton jButton = (JButton) iteradorPistas.next();
			jButton.setBackground(Color.RED);
			jButton.setEnabled(true);

		}
	}

	private String acercaDe() {
		String informacion;

		informacion = "Juego del Ahorcado \n" + "Creado por: \n"
				+ " -Daniel Fernandez \n -Joan Hurtado \n -Jose A. Gonzàlez";

		return informacion;
	}

	private void bloquearBotones() {

		Iterator<JButton> iteradorPistas = listaBotonesPistas.iterator();
		while (iteradorPistas.hasNext()) {
			JButton jButton = (JButton) iteradorPistas.next();
			jButton.setEnabled(false);
		}
		for (int i = 0; i < letras.length; i++) {

			JButton jButton = (JButton) tablaDeBotones.get(letras[i]);
			jButton.setEnabled(false);

		}
	}

	private void resetBotonesLetras() {

		for (int i = 0; i < letras.length; i++) {

			JButton jButton = (JButton) tablaDeBotones.get(letras[i]);
			jButton.setEnabled(true);

		}
	}

	private void resetLetras() {

		for (int i = listaEtiquetasLetras.size() - 1; listaEtiquetasLetras.size() != 0; i--) {

			contentPane.remove(listaEtiquetasLetras.remove(i));

		}

	}
}
