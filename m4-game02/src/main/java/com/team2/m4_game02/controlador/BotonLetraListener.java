/**
 * 
 */
package com.team2.m4_game02.controlador;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;

import javax.swing.AbstractButton;
import javax.swing.ImageIcon;
import javax.swing.JButton;

import com.team2.m4_game02.modelo.Partida;
import com.team2.m4_game02.vista.AhorcadoAPP;
import com.team2.m4_game02.vista.menus.MenuAchivo;
import com.team2.m4_game02.vista.paneles.BotonesLetrasPanel;
import com.team2.m4_game02.vista.paneles.ImagenesPanel;
import com.team2.m4_game02.vista.paneles.LetrasPalabraSecreataPanel;
import com.team2.m4_game02.vista.paneles.PistasPanel;

/**
 * m4-game02 - com.team2.m4_game02.controlador - BotonLetraListener
 *
 * @author Daniel Fernández Cacho
 * @author Joan Hurtado García
 * @author Jose Antonio González Alcántara
 * 
 * Fecha de creación 13/05/2022
 */
public class BotonLetraListener implements ActionListener {
	
	private LetrasPalabraSecreataPanel panelLetras;
	private Partida partida;
	private String palabra;
	private PistasPanel panelPistas;
	private BotonesLetrasPanel panelBotonesLetras;
	private ImagenesPanel panelImagnes;


	/**
	 * @param panelLetras
	 * @param partida
	 * @param palabra
	 * @param panelPistas
	 * @param panelBotonesLetras
	 * @param panelImagnes
	 */
	public BotonLetraListener(LetrasPalabraSecreataPanel panelLetras, Partida partida, String palabra, PistasPanel panelPistas,
			BotonesLetrasPanel panelBotonesLetras, ImagenesPanel panelImagnes) {
		super();
		this.panelLetras = panelLetras;
		this.partida = partida;
		this.palabra = palabra;
		this.panelPistas = panelPistas;
		this.panelBotonesLetras = panelBotonesLetras;
		this.panelImagnes = panelImagnes;
	}



	@Override
	public void actionPerformed(ActionEvent e) {
		char letraPulsada = ((JButton) e.getSource()).getText().charAt(0);
		//Se comprueba la letra si esta en la plabra se cambia
		if (partida.comprobarletras(letraPulsada)) {
			
			panelLetras.cambiarLetra(letraPulsada);
			
		}else {
			
			//Sino se modifica la imagen y el label de intentos
			panelImagnes.getLblImgAhorrcado().setIcon(new ImageIcon(AhorcadoAPP.class.getResource("/Imagenes/el-ahorcado-0"+partida.getIntentos()+".jpg")));
			panelImagnes.getLblNumeroIntentos().setText(String.valueOf(partida.getIntentos()));
			
		}
		//Se desactiva el la letra pulsada
		((JButton) e.getSource()).setEnabled(false);
		if (!partida.comprobarPartida()) {
			
			if (partida.comprobarGanado()) {
				
				panelImagnes.getLblResultado().setIcon(new ImageIcon(AhorcadoAPP.class.getResource("/Imagenes/ganador.jpg")));
				
			}else {
				
				panelImagnes.getLblResultado().setIcon(new ImageIcon(AhorcadoAPP.class.getResource("/Imagenes/perdedor.jpg")));
				
			}
			
			panelBotonesLetras.bloquearBotones();
			panelPistas.bloquearBotones();
			
		}
		
	}

}
