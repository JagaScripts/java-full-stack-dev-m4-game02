/**
 * 
 */
package com.team2.m4_game02.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import com.team2.m4_game02.modelo.Partida;
import com.team2.m4_game02.vista.AhorcadoAPP;
import com.team2.m4_game02.vista.paneles.BotonesLetrasPanel;
import com.team2.m4_game02.vista.paneles.ImagenesPanel;
import com.team2.m4_game02.vista.paneles.LetrasPanel;
import com.team2.m4_game02.vista.paneles.PistasPanel;

/**
 * m4-game02 - com.team2.m4_game02.controler - PartidaControler
 *
 * @author Daniel Fernández Cacho
 * @author Joan Hurtado García
 * @author Jose Antonio González Alcántara
 * 
 * Fecha de creación 12/05/2022
 */
public class NuevaPartidaControler implements ActionListener{
	
	private LetrasPanel panelLetras;
	private Partida partida;
	private String palabra;
	private PistasPanel panelPistas;
	private BotonesLetrasPanel panelBotonesLetras;
	private ImagenesPanel panelImagnes;
	
	

	/**
	 * 
	 */
	public NuevaPartidaControler() {
		super();
		this.partida = new Partida();
		this.palabra = partida.getPalabra().toUpperCase();
		this.panelLetras = new LetrasPanel(palabra);
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		panelLetras.resetLetras();
		partida = new Partida();
		palabra = partida.getPalabra().toUpperCase();
		panelLetras.cargarLetras();
		panelPistas.resetPistas();
		panelBotonesLetras.resetBotonesLetras(); 
		panelImagnes.getLblIntentos().setText(partida.getIntentos() + ""); 
		panelImagnes.getLblNewLabel().setIcon(new ImageIcon(AhorcadoAPP.class.getResource("/Imagenes/el-ahorcado-0" + partida.getIntentos() + ".jpg")));
		panelImagnes.getLblResultado().setIcon(null);
		
	}


	
	
	

}
