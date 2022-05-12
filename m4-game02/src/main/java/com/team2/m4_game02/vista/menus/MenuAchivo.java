/**
 * 
 */
package com.team2.m4_game02.vista.menus;


import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

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
	private JMenuItem mnNuevaPartida;
	
	
	public MenuAchivo() {
		super();
		mnArchivo = new JMenu("Archivo");
		this.add(mnArchivo);
		this.mnNuevaPartida = new JMenuItem("Nueva Partida");
		this.mnArchivo.add(mnNuevaPartida);
		
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
	public JMenuItem getMnNuevaPartida() {
		return mnNuevaPartida;
	}


	/**
	 * @param mnNuevaPartida the mnNuevaPartida to set
	 */
	public void setMnNuevaPartida(JMenuItem mnNuevaPartida) {
		this.mnNuevaPartida = mnNuevaPartida;
	}

	
	
}
