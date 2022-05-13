/**
 * 
 */
package com.team2.m4_game02.vista.menus;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import com.team2.m4_game02.controlador.NuevaPartidaListener;

/**
 * m4-game02 - com.team2.m4_game02.vista.menus - MenuAchivo
 *
 * @author Daniel Fernández Cacho
 * @author Joan Hurtado García
 * @author Jose Antonio González Alcántara
 * 
 * Fecha de creación 13/05/2022
 */
public class MenuAchivo extends JMenuBar {

	private JMenu mnArchivo;
	private JMenuItem mniNuevaPartida;
	private JMenuItem mniAcercaDe;
	private JMenuItem mniSalir;
	
	public MenuAchivo(NuevaPartidaListener nuevaPartida) {
		super();
		mnArchivo = new JMenu("Archivo");
		this.add(mnArchivo);
		this.mniNuevaPartida = new JMenuItem("Nueva Partida");
		this.mniNuevaPartida.addActionListener(nuevaPartida);
		this.mnArchivo.add(mniNuevaPartida);
		this.mniAcercaDe =  new JMenuItem("Acerca de");
		this.mniAcercaDe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null,acercaDe());
			}
		});
		this.mnArchivo.add(mniAcercaDe);
		this.mniSalir = new JMenuItem("Salir");
		this.mniSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				System.exit(0);
				
			}
		});
		this.mnArchivo.add(mniSalir);
	}


	/**
	 * @return the mnArchivo
	 */
	public JMenu getMnArchivo() {
		return mnArchivo;
	}


	/**
	 * @param mnArchivo the mnArchivo to set
	 */
	public void setMnArchivo(JMenu mnArchivo) {
		this.mnArchivo = mnArchivo;
	}


	/**
	 * @return the mnNuevaPartida
	 */
	public JMenuItem getMniNuevaPartida() {
		return mniNuevaPartida;
	}


	/**
	 * @param mnNuevaPartida the mnNuevaPartida to set
	 */
	public void setMniNuevaPartida(JMenuItem mnNuevaPartida) {
		this.mniNuevaPartida = mnNuevaPartida;
	}


	/**
	 * @return the mniAcercaDe
	 */
	public JMenuItem getMniAcercaDe() {
		return mniAcercaDe;
	}


	/**
	 * @param mniAcercaDe the mniAcercaDe to set
	 */
	public void setMniAcercaDe(JMenuItem mniAcercaDe) {
		this.mniAcercaDe = mniAcercaDe;
	}

	
	private String acercaDe() {
		String informacion;

		
		informacion = "Juego del Ahorcado \n" +
					"Creado por: \n" + 
				" -Daniel Fernandez \n -Joan Hurtado \n -Jose A. Gonzàlez";
		
		return informacion;
	}
	
	
	
	
}
