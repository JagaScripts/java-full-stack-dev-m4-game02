package com.team2.m4_game02.controler;

public class Partida {

	private PalabrasAleatioras palabraObjeto;
	private String palabra;
	private int intentosFallidos;

	public Partida() {
		this.palabraObjeto = new PalabrasAleatioras();
		this.palabra = palabraObjeto.GenerarPalabra();
		this.intentosFallidos = 0;
	}

	private boolean intentosDisponibles() {

		// Si tiene más intentos es true
		if (this.intentosFallidos <= 7) {
			return true;
		} else { // Si no es false y finalizaria la partida
			return false;
		}
	}

	private void sumarIntentos() { //Si comprobarLetras es false se resta un intento
		this.intentosFallidos++;
	}


	/**
	 * @return the palabraObjeto
	 */
	public PalabrasAleatioras getPalabraObjeto() {
		return palabraObjeto;
	}

	/**
	 * @param palabraObjeto the palabraObjeto to set
	 */
	public void setPalabraObjeto(PalabrasAleatioras palabraObjeto) {
		this.palabraObjeto = palabraObjeto;
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
	

	private boolean comprobarletras(char letraU) {//Se le pasa la letra introducida

		char letra;

		for (int i = 0; i < this.palabra.length(); i++) {
			letra = this.palabra.charAt(i);
			if (letra == letraU) {
				return true;
			}
		}
		return false;
	}
	

}
