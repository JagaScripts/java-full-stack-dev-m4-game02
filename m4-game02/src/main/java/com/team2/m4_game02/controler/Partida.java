package com.team2.m4_game02.controler;

public class Partida {
	
	private PalabrasAleatioras palabraObjeto;
	private String palabra;
	private int intentos;

	public Partida() {
		this.palabraObjeto = new PalabrasAleatioras();
		this.palabra = palabraObjeto.GenerarPalabra();
		this.intentos = 10;
	}
	
	private boolean intentosDisponibles() {
		
		//Si tiene más intentos es true
		if(this.intentos > 0) {
			return true;
		}else { //Si no es false y finalizaria la partida
			return false;
		}
	}
	
	private void restarIntentos() {
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
	
	

}
