/**
 * 
 */
package com.team2.m4_game02.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JMenuItem;

import com.team2.m4_game02.modelo.Partida;
import com.team2.m4_game02.vista.AhorcadoAPP;
import com.team2.m4_game02.vista.menus.MenuAchivo;
import com.team2.m4_game02.vista.paneles.BotonesLetrasPanel;
import com.team2.m4_game02.vista.paneles.ImagenesPanel;
import com.team2.m4_game02.vista.paneles.LetrasPalabraSecreataPanel;
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
public class NuevaPartidaListener implements ActionListener{
	
	private LetrasPalabraSecreataPanel panelLetras;
	private Partida partida;
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
	 * @param mnArchivo
	 */
	public NuevaPartidaListener(LetrasPalabraSecreataPanel panelLetras, Partida partida, String palabra, PistasPanel panelPistas,
			BotonesLetrasPanel panelBotonesLetras, ImagenesPanel panelImagnes) {
		super();
		this.panelLetras = panelLetras;
		this.partida = partida;
		this.panelPistas = panelPistas;
		this.panelBotonesLetras = panelBotonesLetras;
		this.panelImagnes = panelImagnes;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		panelLetras.resetLetras();
		partida = new Partida();
		panelLetras.cargarLetras();
		panelPistas.resetPistas();
		panelBotonesLetras.resetBotonesLetras(); 
		panelImagnes.getLblNumeroIntentos().setText(partida.getIntentos() + ""); 
		panelImagnes.getLblImgAhorrcado().setIcon(new ImageIcon(AhorcadoAPP.class.getResource("/Imagenes/el-ahorcado-0" + partida.getIntentos() + ".jpg")));
		panelImagnes.getLblResultado().setIcon(null);
		
	}


	
	
	

}
