/**
 * 
 */
package com.team2.m4_game02.controlador;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;

import com.team2.m4_game02.modelo.Partida;
import com.team2.m4_game02.vista.AhorcadoAPP;
import com.team2.m4_game02.vista.paneles.BotonesLetrasPanel;
import com.team2.m4_game02.vista.paneles.ImagenesPanel;
import com.team2.m4_game02.vista.paneles.LetrasPalabraSecreataPanel;
import com.team2.m4_game02.vista.paneles.PistasPanel;

/**
 * m4-game02 - com.team2.m4_game02.controlador - BotonPistaListener
 *
 * @author Daniel Fernández Cacho
 * @author Joan Hurtado García
 * @author Jose Antonio González Alcántara
 * 
 * Fecha de creación 13/05/2022
 */
public class BotonPistaListener implements ActionListener {
	
	private Partida partida;
	private LetrasPalabraSecreataPanel panelLetras;
	private BotonesLetrasPanel panelBotonelLetras;
	private ImagenesPanel panelImagnes;
	private PistasPanel panelPistas;

	/**
	 * 
	 */
	public BotonPistaListener() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		char letra = partida.usarPista();
		panelLetras.cambiarLetra(letra);
		panelBotonelLetras.getComponentLetra(letra).setEnabled(false);
		((JButton) e.getSource()).setBackground(Color.GREEN);
		((JButton) e.getSource()).setEnabled(false);
		if (!partida.comprobarPartida()) {
			
			if (partida.comprobarGanado()) {
				
				panelImagnes.getLblResultado().setIcon(new ImageIcon(AhorcadoAPP.class.getResource("/Imagenes/ganador.jpg")));
				
			}else {
				
				panelImagnes.getLblResultado().setIcon(new ImageIcon(AhorcadoAPP.class.getResource("/Imagenes/perdedor.jpg")));
				
			}
			
			panelBotonelLetras.bloquearBotones();
			panelPistas.bloquearBotones();
			
		}
		
	}

}
