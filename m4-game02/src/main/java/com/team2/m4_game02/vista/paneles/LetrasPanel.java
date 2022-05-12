package com.team2.m4_game02.vista.paneles;

import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

import com.team2.m4_game02.vista.paneles.componentes.EtiquetaLetra;

import javax.swing.border.EtchedBorder;
import java.awt.Color;
import java.awt.FlowLayout;

public class LetrasPanel extends JPanel {

	private String palabra;
	/**
	 * Create the panel.
	 */
	public LetrasPanel(String palabra) {
		setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Palabra secreta", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		this.palabra = palabra;
		this.cargarLetras();
		
	}

	public void cargarLetras() {

		int xLetra = 10;

		for (int i = 0; i < this.palabra.length(); i++) {

			EtiquetaLetra lblLetra = new EtiquetaLetra(xLetra, 180);
			lblLetra.setLetra(this.getPalabra().charAt(i));
			xLetra += 50;
			this.add(lblLetra);
		}
		System.out.println(palabra);

	}
	
	public void cambiarLetra(char letra) {

		
		for (int i = 0; i < palabra.length(); i++) {

			if (palabra.charAt(i) == letra) {
				
				((EtiquetaLetra) this.getComponent(i)).setText(String.valueOf(letra));;
				
			}
			
		}

	}
	
	public void resetLetras() {

		this.removeAll();

	}
	
	/*public void activarTextFields(JPanel j)
	{
	Component[] componentes =j.getComponents();
	for(int i=0; i<componentes.length;i++)
	{
	if(componentes[i] instanceof JTextField)
	{
	((JTextField)componentes[i]).setEnabled(true);
	}
	}
	}*/

	/**
	 * @return the palabra
	 */
	public String getPalabra() {
		return palabra;
	}

	/**
	 * @param palabra the palabra to set
	 */
	public void setPalabra(String palabra) {
		this.palabra = palabra;
	}

	
	
	
	
}
