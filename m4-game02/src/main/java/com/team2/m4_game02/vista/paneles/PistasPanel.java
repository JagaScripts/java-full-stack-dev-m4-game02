package com.team2.m4_game02.vista.paneles;


import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

import com.team2.m4_game02.controlador.BotonPistaListener;
import com.team2.m4_game02.vista.AhorcadoAPP;

public class PistasPanel extends JPanel {
	/**
	 * Create the panel.
	 */
	public PistasPanel(BotonPistaListener botonesListener) {
		JButton btnPista = new JButton("");
		btnPista.addActionListener(botonesListener);
		btnPista.setBackground(Color.RED);
		btnPista.setForeground(Color.BLACK);
		btnPista.setBounds(10, 21, 50, 50);
		this.add(btnPista);
		
	}

	public void resetPistas() {
		
		for (Component pistas : this.getComponents()) {

			pistas.setBackground(Color.RED);
			pistas.setEnabled(true);

		}
		
	}
	
	public void bloquearBotones() {

		for (Component pistas : this.getComponents()) {

			pistas.setEnabled(false);

		}
	}

}
