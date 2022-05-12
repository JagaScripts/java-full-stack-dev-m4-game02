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

import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ButtonGroup;

public class AhorcadoAPP extends JFrame {

	private JPanel contentPane;
	//private final String[] letras = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","Ñ","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
	Partida partida = new Partida();
	String palabra = partida.getPalabra().toUpperCase();
	ArrayList<EtiquetaLetra> listaEtiquetasLetras = new ArrayList<EtiquetaLetra>();
	private final ButtonGroup grupoBotonesLetras = new ButtonGroup();

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
		
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 597, 614);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("Menú");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Nueva Partida");
		mnNewMenu.add(mntmNewMenuItem);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		//Numero para que vaya cambiando de imagen en la ruta
		int numero = 0;
		JPanel panel = new JPanel();
		panel.setBounds(397, 39, 174, 206);
		contentPane.add(panel);
		JLabel lblNewLabel = new JLabel("");
		panel.add(lblNewLabel);
		lblNewLabel.setVerticalAlignment(SwingConstants.BOTTOM);		//Ruta de las imagenes más variable para ir cambiando
		lblNewLabel.setIcon(new ImageIcon(AhorcadoAPP.class.getResource("/Imagenes/el-ahorcado-0"+partida.getIntentos()+".jpg")));
		
		
		
		JLabel lblNewLabel_1 = new JLabel("Intentos Fallidos:");
		lblNewLabel_1.setBounds(422, 14, 95, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblIntentos = new JLabel(partida.getIntentos() + "");
		lblIntentos.setForeground(Color.RED);
		lblIntentos.setBounds(525, 14, 46, 14);
		contentPane.add(lblIntentos);
		
		//Metodo para sumar intentos fallidos
		
		
		//ComboBox con las palabrass
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(426, 520, 145, 22);
		comboBox.addItem("perro");
		comboBox.addItem("gato");
		contentPane.add(comboBox);
		comboBox.setVisible(false);
		
		//Metodo para añadir palabras
		
		//Menu Acerca De
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Acerca de");
		mntmNewMenuItem_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null,acercaDe());
			}
		});
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*Jose */
		Hashtable<String, JButton> tablaDeBotones = new Hashtable<String, JButton>();
		JButton btnTemporal;
	
		mnNewMenu.add(mntmNewMenuItem_2);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Salir");
		mnNewMenu.add(mntmNewMenuItem_1);
		
		
		JButton btnY = new JButton("Y");
		grupoBotonesLetras.add(btnY);
		btnY.setBounds(10, 492, 50, 50);
		tablaDeBotones.put("Y", btnY);
		contentPane.add(btnY);
		
		JButton btnZ = new JButton("Z");
		grupoBotonesLetras.add(btnZ);
		btnZ.setBounds(60, 492, 50, 50);
		tablaDeBotones.put("Z", btnZ);
		contentPane.add(btnZ);
		
		JButton btnT = new JButton("T");
		grupoBotonesLetras.add(btnT);
		btnT.setBounds(10, 442, 50, 50);
		tablaDeBotones.put("T", btnT);
		contentPane.add(btnT);
		
		JButton btnU = new JButton("U");
		grupoBotonesLetras.add(btnU);
		btnU.setBounds(60, 442, 50, 50);
		tablaDeBotones.put("U", btnU);
		contentPane.add(btnU);
		
		JButton btnO = new JButton("O");
		grupoBotonesLetras.add(btnO);
		btnO.setBounds(10, 392, 50, 50);
		tablaDeBotones.put("O", btnO);
		contentPane.add(btnO);
		
		JButton btnP = new JButton("P");
		grupoBotonesLetras.add(btnP);
		btnP.setBounds(60, 392, 50, 50);
		tablaDeBotones.put("P", btnP);
		contentPane.add(btnP);
		
		JButton btnQ = new JButton("Q");
		grupoBotonesLetras.add(btnQ);
		btnQ.setBounds(110, 392, 50, 50);
		tablaDeBotones.put("Q", btnQ);
		contentPane.add(btnQ);
		
		JButton btnV = new JButton("V");
		grupoBotonesLetras.add(btnV);
		btnV.setBounds(110, 442, 50, 50);
		tablaDeBotones.put("V", btnV);
		contentPane.add(btnV);
		
		JButton btnR = new JButton("R");
		grupoBotonesLetras.add(btnR);
		btnR.setBounds(160, 392, 50, 50);
		tablaDeBotones.put("R", btnR);
		contentPane.add(btnR);
		
		JButton btnW = new JButton("W");
		grupoBotonesLetras.add(btnW);
		btnW.setBounds(160, 442, 50, 50);
		tablaDeBotones.put("W", btnW);
		contentPane.add(btnW);
		
		JButton btnX = new JButton("X");
		grupoBotonesLetras.add(btnX);
		btnX.setBounds(210, 442, 50, 50);
		tablaDeBotones.put("X", btnX);
		contentPane.add(btnX);
		
		JButton btnS = new JButton("S");
		grupoBotonesLetras.add(btnS);
		btnS.setBounds(210, 392, 50, 50);
		tablaDeBotones.put("S", btnS);
		contentPane.add(btnS);
		
		JButton btnK = new JButton("K");
		grupoBotonesLetras.add(btnK);
		btnK.setBounds(10, 342, 50, 50);
		tablaDeBotones.put("K", btnK);
		contentPane.add(btnK);
		
		JButton btnL = new JButton("L");
		grupoBotonesLetras.add(btnL);
		btnL.setBounds(60, 342, 50, 50);
		tablaDeBotones.put("L", btnL);
		contentPane.add(btnL);
		
		JButton btnF = new JButton("F");
		grupoBotonesLetras.add(btnF);
		btnF.setBounds(10, 292, 50, 50);
		tablaDeBotones.put("F", btnF);
		contentPane.add(btnF);
		
		JButton btnA = new JButton("A");
		grupoBotonesLetras.add(btnA);
		btnA.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				char letraPulsada = btnA.getText().charAt(0);
				if (partida.comprobarletras(letraPulsada)) {
					
					cambiarLetra(letraPulsada);
					
				}else {
					
					lblIntentos.setText(String.valueOf(partida.getIntentos()));
					
				}
				btnA.setEnabled(false);
				if (partida.comprobarPartida()) {
					
				}
			
			}
		});
		btnA.setBounds(10, 242, 50, 50);
		tablaDeBotones.put("A", btnA);
		contentPane.add(btnA);
		
		JButton btnM = new JButton("M");
		grupoBotonesLetras.add(btnM);
		btnM.setBounds(110, 342, 50, 50);
		tablaDeBotones.put("M", btnM);
		contentPane.add(btnM);
		
		JButton btnN = new JButton("N");
		grupoBotonesLetras.add(btnN);
		btnN.setBounds(160, 342, 50, 50);
		tablaDeBotones.put("N", btnN);
		contentPane.add(btnN);
		
		JButton btnNY = new JButton("Ñ");
		grupoBotonesLetras.add(btnNY);
		btnNY.setBounds(210, 342, 50, 50);
		tablaDeBotones.put("Ñ", btnNY);
		contentPane.add(btnNY);
		
		JButton btnG = new JButton("G");
		grupoBotonesLetras.add(btnG);
		btnG.setBounds(60, 292, 50, 50);
		tablaDeBotones.put("G", btnG);
		contentPane.add(btnG);
		
		JButton btnH = new JButton("H");
		grupoBotonesLetras.add(btnH);
		btnH.setBounds(110, 292, 50, 50);
		tablaDeBotones.put("H", btnH);
		contentPane.add(btnH);
		
		JButton btnI = new JButton("I");
		grupoBotonesLetras.add(btnI);
		btnI.setBounds(160, 292, 50, 50);
		tablaDeBotones.put("I", btnI);
		contentPane.add(btnI);
		
		JButton btnJ = new JButton("J");
		grupoBotonesLetras.add(btnJ);
		btnJ.setBounds(210, 292, 50, 50);
		tablaDeBotones.put("J", btnJ);
		contentPane.add(btnJ);
		
		JButton btnB = new JButton("B");
		grupoBotonesLetras.add(btnB);
		btnB.setBounds(60, 242, 50, 50);
		tablaDeBotones.put("B", btnB);
		contentPane.add(btnB);
		
		JButton btnC = new JButton("C");
		grupoBotonesLetras.add(btnC);
		btnC.setBounds(110, 242, 50, 50);
		tablaDeBotones.put("C", btnC);
		contentPane.add(btnC);
		
		JButton btnD = new JButton("D");
		grupoBotonesLetras.add(btnD);
		btnD.setBounds(160, 242, 50, 50);
		tablaDeBotones.put("D", btnD);
		contentPane.add(btnD);
		
		JButton btnE = new JButton("E");
		grupoBotonesLetras.add(btnE);
		btnE.setBounds(210, 242, 50, 50);
		tablaDeBotones.put("E", btnE);
		contentPane.add(btnE);
		

		JButton btnPista = new JButton("");
		btnPista.setBackground(Color.RED);
		btnPista.setForeground(Color.BLACK);
		btnPista.setBounds(10, 21, 50, 50);
		contentPane.add(btnPista);
		
		JButton btnPista1 = new JButton("");
		btnPista1.setBackground(Color.RED);
		btnPista1.setForeground(Color.BLACK);
		btnPista1.setBounds(60, 21, 50, 50);
		contentPane.add(btnPista1);
		
		JButton btnPista2 = new JButton("");
		btnPista2.setBackground(Color.RED);
		btnPista2.setForeground(Color.BLACK);
		btnPista2.setBounds(110, 21, 50, 50);
		contentPane.add(btnPista2);
		
		JButton btnPista3 = new JButton("");
		btnPista3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				char letra = partida.usarPista();
				cambiarLetra(letra);
				tablaDeBotones.get(String.valueOf(letra)).setEnabled(false);
				
				
			}
		});
		btnPista3.setBackground(Color.RED);
		btnPista3.setForeground(Color.BLACK);
		btnPista3.setBounds(160, 21, 50, 50);
		contentPane.add(btnPista3);

		cargarLetras();
		
	/*	if(grupoBotonesLetras.getSelection().isPressed()) {
			System.out.println(grupoBotonesLetras.getSelection().isPressed());
		}
	*/
		
		
			/*EtiquetaLetra etiquetaLetra = (EtiquetaLetra) iteratorLetras.next();
			contentPane.add(etiquetaLetra);*/

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

		System.out.println(letra);
		for (int i = 0; i < palabra.length(); i++) {

			if (palabra.charAt(i) == letra) {
				
				listaEtiquetasLetras.get(i).setText(String.valueOf(letra));
				
			}
			
		}

	}
	
	private void resetLetras() {
		
		for (int i = 0; i < palabra.length(); i++) {
			
			listaEtiquetasLetras.get(i).setText("_");
			
		}
		
	}
	
	private String acercaDe() {
		String informacion;

		
		informacion = "Juego del Ahorcado \n" +
					"Creado por: \n" + 
				" -Daniel Fernandez \n -Joan Hurtado \n -Jose A. Gonzàlez";
		
		return informacion;
	}
}
