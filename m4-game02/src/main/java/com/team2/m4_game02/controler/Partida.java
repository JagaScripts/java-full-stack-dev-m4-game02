package com.team2.m4_game02.controler;

public class Partida {

	private PalabrasAleatioras palabraObjeto;
	private String palabra;
	private String palabraSinLetras;
	private StringBuilder modificadorPalabra ;
	private int intentosFallidos;
	private int pistas;

	public Partida() {
		this.palabraObjeto = new PalabrasAleatioras();
		this.palabra = palabraObjeto.GenerarPalabra().toUpperCase();
		this.modificadorPalabra = new StringBuilder(this.palabra);
		this.intentosFallidos = 0;
		this.pistas = 4;
		
	}

	private boolean intentosDisponibles() {

		// Si tiene más intentos es true
		if (this.intentosFallidos <= 7) {
			return true;
		} else { // Si no es false y finalizaria la partida
			return false;
		}
	}

	public void sumarIntentos() { //Si comprobarLetras es false se resta un intento
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
	

	public boolean comprobarletras(char letraU) {//Se le pasa la letra introducida

		char letra;
		int cuentaLetras = 0;
		

		for (int i = 0; i < this.palabra.length(); i++) {
			
			letra = this.palabra.charAt(i);
			
			if (letra == letraU) {
				
				modificadorPalabra.deleteCharAt(i);
				cuentaLetras++;

			}
		}
		
		if (cuentaLetras != 0) {
			
			this.palabraSinLetras = modificadorPalabra.toString();
			
			return true;
			
		} else {
			
			return false;

		}
		
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
	
	//public darPista

}
