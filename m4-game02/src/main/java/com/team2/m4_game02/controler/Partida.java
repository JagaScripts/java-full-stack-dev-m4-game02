package com.team2.m4_game02.controler;

public class Partida {

	private PalabrasAleatioras palabraObjeto;
	private String palabra;
	private int intentos;

	public Partida() {
		this.palabraObjeto = new PalabrasAleatioras();
		this.palabra = palabraObjeto.GenerarPalabra().toUpperCase();
		this.intentos = 7;
	}

	private boolean intentosDisponibles() {

		// Si tiene más intentos es true
		if (this.intentos > 0) {
			return true;
		} else { // Si no es false y finalizaria la partida
			return false;
		}
	}

	public void restarIntentos() { //Si comprobarLetras es false se resta un intento
		this.intentos--;
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
		return intentos;
	}

	/**
	 * @param intentos the intentos to set
	 */
	public void setIntentos(int intentos) {
		this.intentos = intentos;
	}
	

	public boolean comprobarletras(char letraU) {//Se le pasa la letra introducida

		char letra;

		for (int i = 0; i < this.palabra.length(); i++) {
			letra = this.palabra.charAt(i);
			if (letra == letraU) {
				return true;
			}
		}
		return false;
	}
	
	public int numeroIntentosFallidos() {
		
		int num = 7;//Se empieza con el numero de intentos
		
		num = num - this.intentos; // 7 - 7 = 0, primera imagen es 0, intentos-- --> 7-6 = 1, segunda imagen
		
		return num;
	}

	

}
