package com.team2.m4_game02.vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import PalabrasAleatorias.EtiquetaLetra;
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
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AhorcadoAPP extends JFrame {

	private JPanel contentPane;

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
		lblNewLabel.setIcon(new ImageIcon(AhorcadoAPP.class.getResource("/Imagenes/el-ahorcado-0"+numero+".jpg")));
		
		
		
		JLabel lblNewLabel_1 = new JLabel("Intentos Fallidos:");
		lblNewLabel_1.setBounds(422, 14, 95, 14);
		contentPane.add(lblNewLabel_1);
		
		int intentosFallidos = 0;
		JLabel lblNewLabel_2 = new JLabel(intentosFallidos + "");
		lblNewLabel_2.setForeground(Color.RED);
		lblNewLabel_2.setBounds(525, 14, 46, 14);
		contentPane.add(lblNewLabel_2);
		
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
		

		mnNewMenu.add(mntmNewMenuItem_2);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Salir");
		mnNewMenu.add(mntmNewMenuItem_1);
		
		JButton btnY = new JButton("Y");
		btnY.setBounds(10, 492, 50, 50);
		contentPane.add(btnY);
		
		JButton btnZ = new JButton("Z");
		btnZ.setBounds(60, 492, 50, 50);
		contentPane.add(btnZ);
		
		JButton btnT = new JButton("T");
		btnT.setBounds(10, 442, 50, 50);
		contentPane.add(btnT);
		
		JButton btnU = new JButton("U");
		btnU.setBounds(60, 442, 50, 50);
		contentPane.add(btnU);
		
		JButton btnO = new JButton("O");
		btnO.setBounds(10, 392, 50, 50);
		contentPane.add(btnO);
		
		JButton btnP = new JButton("P");
		btnP.setBounds(60, 392, 50, 50);
		contentPane.add(btnP);
		
		JButton btnQ = new JButton("Q");
		btnQ.setBounds(110, 392, 50, 50);
		contentPane.add(btnQ);
		
		JButton btnV = new JButton("V");
		btnV.setBounds(110, 442, 50, 50);
		contentPane.add(btnV);
		
		JButton btnR = new JButton("R");
		btnR.setBounds(160, 392, 50, 50);
		contentPane.add(btnR);
		
		JButton btnW = new JButton("W");
		btnW.setBounds(160, 442, 50, 50);
		contentPane.add(btnW);
		
		JButton btnX = new JButton("X");
		btnX.setBounds(210, 442, 50, 50);
		contentPane.add(btnX);
		
		JButton btnS = new JButton("S");
		btnS.setBounds(210, 392, 50, 50);
		contentPane.add(btnS);
		
		JButton btnK = new JButton("K");
		btnK.setBounds(10, 342, 50, 50);
		contentPane.add(btnK);
		
		JButton btnL = new JButton("L");
		btnL.setBounds(60, 342, 50, 50);
		contentPane.add(btnL);
		
		JButton btnF = new JButton("F");
		btnF.setBounds(10, 292, 50, 50);
		contentPane.add(btnF);
		
		JButton btnA = new JButton("A");
		btnA.setBounds(10, 242, 50, 50);
		contentPane.add(btnA);
		
		JButton btnM = new JButton("M");
		btnM.setBounds(110, 342, 50, 50);
		contentPane.add(btnM);
		
		JButton btnN = new JButton("N");
		btnN.setBounds(160, 342, 50, 50);
		contentPane.add(btnN);
		
		JButton btnNY = new JButton("Ñ");
		btnNY.setBounds(210, 342, 50, 50);
		contentPane.add(btnNY);
		
		JButton btnG = new JButton("G");
		btnG.setBounds(60, 292, 50, 50);
		contentPane.add(btnG);
		
		JButton btnH = new JButton("H");
		btnH.setBounds(110, 292, 50, 50);
		contentPane.add(btnH);
		
		JButton btnI = new JButton("I");
		btnI.setBounds(160, 292, 50, 50);
		contentPane.add(btnI);
		
		JButton btnJ = new JButton("J");
		btnJ.setBounds(210, 292, 50, 50);
		contentPane.add(btnJ);
		
		JButton btnB = new JButton("B");
		btnB.setBounds(60, 242, 50, 50);
		contentPane.add(btnB);
		
		JButton btnC = new JButton("C");
		btnC.setBounds(110, 242, 50, 50);
		contentPane.add(btnC);
		
		JButton btnD = new JButton("D");
		btnD.setBounds(160, 242, 50, 50);
		contentPane.add(btnD);
		
		JButton btnE = new JButton("E");
		btnE.setBounds(210, 242, 50, 50);
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
		btnPista3.setBackground(Color.RED);
		btnPista3.setForeground(Color.BLACK);
		btnPista3.setBounds(160, 21, 50, 50);
		contentPane.add(btnPista3);

			
		

		ArrayList<EtiquetaLetra> listaEtiquetasLetras = new ArrayList<EtiquetaLetra>();
		String palabra = new String("Ahorcado");
		int xLetra = 10;
		for (int i = 0; i < palabra.length(); i++) {
			
			listaEtiquetasLetras.add(new EtiquetaLetra(xLetra, 180));
			xLetra += 50;
			contentPane.add(listaEtiquetasLetras.get(i));
		}
		
			/*EtiquetaLetra etiquetaLetra = (EtiquetaLetra) iteratorLetras.next();
			contentPane.add(etiquetaLetra);*/

	}
	
	private String acercaDe() {
		String informacion;

		
		informacion = "Juego del Ahorcado \n" +
					"Creado por: \n" + 
				" -Daniel Fernandez \n -Joan Hurtado \n -Jose A. Gonzàlez";
		
		return informacion;
	}
}
