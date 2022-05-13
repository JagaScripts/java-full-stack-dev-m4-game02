/**
 * 
 */
package com.team2.m4_game02.vista.paneles;

import java.awt.Component;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

/**
 * m4-game02 - com.team2.m4_game02.vista.paneles - BotonesLetrasPanel
 *
 * @author Daniel Fernández Cacho
 * @author Joan Hurtado García
 * @author Jose Antonio González Alcántara
 * 
 * Fecha de creación 12/05/2022
 */
public class BotonesLetrasPanel extends JPanel{

	private final String[] LETRAS = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","Ñ","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
	
	public BotonesLetrasPanel(ActionListener botonLetraListener) {
		
		JButton btnTemporal;
		int posicionXBotones = 10;
		int posicionYBotones = 242;
		
		//Se gennera la lista de botones de letras dinamicamente
		for (int i = 0; i < LETRAS.length; i++) {
			btnTemporal = new JButton(LETRAS[i]);
			btnTemporal.setBounds(posicionXBotones,posicionYBotones,50,50);
			if(posicionXBotones < 211) {
				
				posicionXBotones += 50;
				
			} else {
				
				posicionXBotones = 10;
				posicionYBotones += 50;
				
			}
			btnTemporal.addActionListener(botonLetraListener);
			this.add(LETRAS[i], btnTemporal);
		}
		
	}

	public void resetBotonesLetras() {
		
		for (Component botonLetra : this.getComponents()) {
			
			botonLetra.setEnabled(true);
			
		}
		
		
	}
	
	public void bloquearBotones() {
		
		
		for (Component botonLetra : this.getComponents()) {
			
			botonLetra.setEnabled(false);
		}
		
	}
	
	public JButton getComponentLetra(char letra) {

		for (Component botonLetra : this.getComponents()) {
			
			if (botonLetra.getName() == String.valueOf(letra)) {
			
				return (JButton) botonLetra;
				
			}
		}
		
		return null;

	}
		
}
