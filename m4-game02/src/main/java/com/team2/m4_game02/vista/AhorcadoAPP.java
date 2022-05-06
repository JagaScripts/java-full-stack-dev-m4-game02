package com.team2.m4_game02.vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JButton;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Color;

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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
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
		
		JPanel panel = new JPanel();
		panel.setBounds(250, 33, 174, 206);
		contentPane.add(panel);
		
		//Numero para que vaya cambiando de imagen en la ruta
		int numero = 0;
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setVerticalAlignment(SwingConstants.BOTTOM);		//Ruta de las imagenes más variable para ir cambiando
		lblNewLabel.setIcon(new ImageIcon(AhorcadoAPP.class.getResource("/Imagenes/el-ahorcado-0"+numero+".jpg")));
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Intentos Fallidos:");
		lblNewLabel_1.setBounds(252, 8, 95, 14);
		contentPane.add(lblNewLabel_1);
		
		int intentosFallidos = 0;
		JLabel lblNewLabel_2 = new JLabel(intentosFallidos + "");
		lblNewLabel_2.setForeground(Color.RED);
		lblNewLabel_2.setBounds(355, 8, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		//Metodo para sumar intentos fallidos
				
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*Jose */
		
		
		
		
		
		
		
		
		
	}
}
