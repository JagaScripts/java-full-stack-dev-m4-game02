/**
 * 
 */
package com.team2.m4_game02.vista.paneles.componentes;

import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.SwingConstants;

/**
 * m4-game02 - PalabrasAleatorias - EtiquetaLetra
 *
 * @author Jose Antonio González Alcántara
 * 
 * Fecha de creación 06/05/2022
 */
public class EtiquetaLetra extends JLabel{

	private char letra;
	
	public EtiquetaLetra(int x, int y) {
		super();
		this.setText("_");
		this.setHorizontalAlignment(SwingConstants.CENTER);
		this.setFont(new Font("Tahoma", Font.PLAIN, 11));
		this.setBounds(x, y, 50, 50);
	}

	/**
	 * @return the letra
	 */
	public char getLetra() {
		return letra;
	}

	/**
	 * @param letra the letra to set
	 */
	public void setLetra(char letra) {
		this.letra = letra;
	}
	
	
}
