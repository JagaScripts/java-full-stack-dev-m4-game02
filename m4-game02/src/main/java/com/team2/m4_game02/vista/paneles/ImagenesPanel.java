/**
 * 
 */
package com.team2.m4_game02.vista.paneles;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.team2.m4_game02.modelo.Partida;
import com.team2.m4_game02.vista.AhorcadoAPP;

/**
 * m4-game02 - com.team2.m4_game02.vista.paneles - ImagenesPanel
 *
 * @author Daniel Fernández Cacho
 * @author Joan Hurtado García
 * @author Jose Antonio González Alcántara
 * 
 * Fecha de creación 12/05/2022
 */
public class ImagenesPanel extends JPanel{

	private JLabel lblNumeroIntentos;
	private JLabel lblImgAhorcado;
	private JLabel lblImgResultado;
	private JLabel lblLetrasIntentos;
	
	/**
	 */
	public ImagenesPanel(Partida partida) {
		super();
		this.lblImgAhorcado = new JLabel("");
		this.lblImgAhorcado.setBounds(475, 42, 174, 206);;		
		this.lblImgAhorcado.setIcon(new ImageIcon(AhorcadoAPP.class.getResource("/Imagenes/el-ahorcado-0" + partida.getIntentos() + ".jpg")));
		this.add(lblImgAhorcado);
		this.lblNumeroIntentos= new JLabel(partida.getIntentos() + "");
		this.lblNumeroIntentos.setForeground(Color.RED);
		this.lblNumeroIntentos.setBounds(603, 17, 46, 14);
		this.add(lblNumeroIntentos);
		this.lblImgResultado = new JLabel("");
		this.lblImgResultado.setBounds(475, 262, 174, 176);
		this.add(lblImgResultado);
		this.lblLetrasIntentos = new JLabel("Intentos Fallidos:");
		this.lblLetrasIntentos.setBounds(498, 17, 95, 14);
		this.add(lblLetrasIntentos);
	}

	/**
	 * @return the lblIntentos
	 */
	public JLabel getLblNumeroIntentos() {
		return lblNumeroIntentos;
	}

	/**
	 * @param lblIntentos the lblIntentos to set
	 */
	public void setLblNumeroIntentos(JLabel lblIntentos) {
		this.lblNumeroIntentos = lblIntentos;
	}

	/**
	 * @return the lblNewLabel
	 */
	public JLabel getLblImgAhorrcado() {
		return lblImgAhorcado;
	}

	/**
	 * @param lblNewLabel the lblNewLabel to set
	 */
	public void setLblImgAhorrcado(JLabel lblImgAhorcado) {
		this.lblImgAhorcado = lblImgAhorcado;
	}

	/**
	 * @return the lblResultado
	 */
	public JLabel getLblResultado() {
		return lblImgResultado;
	}

	/**
	 * @param lblResultado the lblResultado to set
	 */
	public void setLblResultado(JLabel lblResultado) {
		this.lblImgResultado = lblResultado;
	}

	/**
	 * @return the lblImgAhorcado
	 */
	public JLabel getLblImgAhorcado() {
		return lblImgAhorcado;
	}

	/**
	 * @param lblImgAhorcado the lblImgAhorcado to set
	 */
	public void setLblImgAhorcado(JLabel lblImgAhorcado) {
		this.lblImgAhorcado = lblImgAhorcado;
	}

	/**
	 * @return the lblImgResultado
	 */
	public JLabel getLblImgResultado() {
		return lblImgResultado;
	}

	/**
	 * @param lblImgResultado the lblImgResultado to set
	 */
	public void setLblImgResultado(JLabel lblImgResultado) {
		this.lblImgResultado = lblImgResultado;
	}

	/**
	 * @return the lblLetrasIntentos
	 */
	public JLabel getLblLetrasIntentos() {
		return lblLetrasIntentos;
	}

	/**
	 * @param lblLetrasIntentos the lblLetrasIntentos to set
	 */
	public void setLblLetrasIntentos(JLabel lblLetrasIntentos) {
		this.lblLetrasIntentos = lblLetrasIntentos;
	}
	
	

}
