package com.team2.m4_game02.controler;

import java.util.Random;

import javax.swing.JComboBox;

public class Partida {

	private String palabra;
	private String palabraModificada;
	private StringBuilder modificadorPalabra;
	private int intentosFallidos;
	private int pistas;
	private boolean estadoPartida;
	private boolean resultadoPartida;
	private int vidas;
	private JComboBox comboBox;

	public Partida() {

		this.comboBox = new JComboBox();
		this.palabra = this.GenerarPalabra().toUpperCase();
		this.palabraModificada = this.palabra;
		this.modificadorPalabra = new StringBuilder(this.palabra);
		this.intentosFallidos = 0;
		this.vidas = 10;
		this.pistas = 5;
		this.estadoPartida = true;
		this.resultadoPartida = false;
	}
	
	public Partida(int vidas) {
		this.comboBox = new JComboBox();
		this.palabra = this.GenerarPalabra().toUpperCase();
		this.palabraModificada = this.palabra;
		this.modificadorPalabra = new StringBuilder(this.palabra);
		this.intentosFallidos = 0;
		this.pistas = 4;
		this.vidas = vidas;
		this.estadoPartida = true;
		this.resultadoPartida = false;
	}
	
	

	public String GenerarPalabra() {


		comboBox.setBounds(426, 520, 145, 22);
		comboBox.addItem("perro");
		comboBox.addItem("gato");
		comboBox.addItem("hola");
		comboBox.addItem("bien");
		comboBox.addItem("programar");
		comboBox.addItem("palabra");
		comboBox.addItem("azar");
		comboBox.addItem("otra");
		comboBox.addItem("casa");
		comboBox.addItem("frio");
		comboBox.addItem("luffy");

		comboBox.setVisible(false);

		Random rand = new Random();

		int n = rand.nextInt(comboBox.getItemCount());
		String z = comboBox.getItemAt(n).toString();
		System.out.println(z);
		return z;

	}
	
	public void AñadirPalabra(String palabra) {
			
		comboBox.addItem(palabra);
		for (int i = 0; i < comboBox.getItemCount(); i++) {
			System.out.println(comboBox.getItemAt(i).toString());
		}
	
	}
	

	public void sumarIntentos() { // Si comprobarLetras es false se resta un intento
		this.intentosFallidos++;

	}


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

	/**
	 * @return the intentos
	 */
	public int getIntentos() {
		return intentosFallidos;
	}

	/**
	 * @param intentos the intentos to set
	 */
	public void setIntentos(int intentos) {
		this.intentosFallidos = intentos;
	}

	/**
	 * 
	 * @param letraU
	 * @return si no se extrae letra se suma un intento y devuelve false sino
	 *         decuelve true
	 */
	public boolean comprobarletras(char letraU) {// Se le pasa la letra introducida

		if (!extraerLetras(letraU)) {

			this.sumarIntentos();
			return false;

		}

		return true;

	}

	/**
	 * @return the pistas
	 */
	public int getPistas() {
		return pistas;
	}

	/**
	 * @param pistas the pistas to set
	 */
	public void setPistas(int pistas) {
		this.pistas = pistas;
	}

	/**
	 * hay partida mientras a la palabra le quedan letras o no ha superado los
	 * intentos fallidos
	 * 
	 * @return devuelve el estado de la partida
	 */
	public boolean comprobarPartida() {

		if (this.modificadorPalabra.isEmpty() || this.intentosFallidos == this.vidas) {

			setEstadoPartida(false);

		}

		/*
		 * if (palabraModificada.isEmpty() || this.intentosFallidos == 6) {
		 * 
		 * setEstadoPartida(false);
		 * 
		 * }
		 */

		return estadoPartida;
	}

	/**
	 * @return the estadoPartida
	 */
	public boolean isEstadoPartida() {
		return estadoPartida;
	}

	/**
	 * @param estadoPartida the estadoPartida to set
	 */
	public void setEstadoPartida(boolean estadoPartida) {
		this.estadoPartida = estadoPartida;
	}

	/**
	 * @return the resultadoPartida
	 */
	public boolean isResultadoPartida() {
		return resultadoPartida;
	}

	/**
	 * @param resultadoPartida the resultadoPartida to set
	 */
	public void setResultadoPartida(boolean resultadoPartida) {
		this.resultadoPartida = resultadoPartida;
	}

	/**
	 * Comprueba si el jugador ha ganado la partida y cambia el resultado de la
	 * partida
	 * 
	 * @return devuelve true si el jugador es ganador y false si ha perdido
	 */
	public boolean comprobarGanado() {

		if (palabraModificada.isEmpty()) {

			setResultadoPartida(true);

		} else if (this.intentosFallidos == this.vidas) {

			setResultadoPartida(false);

		}

		return resultadoPartida;
	}

	/**
	 * 
	 * @return devuelve una letra para dar pista
	 */
	public char usarPista() {

		char letraPista = 0;
		pistas--;

		Random rand = new Random();
		int indiceLetra = rand.nextInt(palabraModificada.length());

		letraPista = palabraModificada.charAt(indiceLetra);

		extraerLetras(letraPista);

		return letraPista;

	}

	/**
	 * Este método extrae las coincidencias del caracter pasado pora metro
	 * 
	 * @param letra a extraer si existe
	 * @return false si no ha encontrado ninguna letra y true si ha encontrado
	 *         alguna
	 */
	private boolean extraerLetras(char letra) {

		boolean cuentaLetras = false;

		int i = 0;

		while (!this.modificadorPalabra.isEmpty() && i < modificadorPalabra.length()) {
			
			if (letra == this.modificadorPalabra.charAt(i)) {

				modificadorPalabra.deleteCharAt(i);
				this.palabraModificada = modificadorPalabra.toString();
				cuentaLetras = true;
				
					i--; //Restamos 1 porque se mueve todo el index 1 a la izquierda		
			}
			i++;

		}

		return cuentaLetras;
	}

}
