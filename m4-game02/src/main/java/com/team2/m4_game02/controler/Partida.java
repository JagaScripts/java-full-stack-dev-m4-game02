package com.team2.m4_game02.controler;

import java.util.Random;

public class Partida {

	private PalabrasAleatioras palabraObjeto;
	private String palabra;
	private String palabraModificada;
	private StringBuilder modificadorPalabra ;
	private int intentosFallidos;
	private int pistas;
	private boolean estadoPartida;
	private boolean resultadoPartida;

	public Partida() {
		this.palabraObjeto = new PalabrasAleatioras();
		this.palabra = palabraObjeto.GenerarPalabra().toUpperCase();
		this.palabraModificada = this.palabra;
		this.modificadorPalabra = new StringBuilder(this.palabra);
		this.intentosFallidos = 0;
		this.pistas = 4;
		this.estadoPartida = true;
		this.resultadoPartida = false;
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
		boolean cuentaLetras = false;
		
		for (int i = 0; i < this.palabraModificada.length(); i++) {
			
			letra = this.palabraModificada.charAt(i);
			
			if (letra == letraU) {
				
				modificadorPalabra.deleteCharAt(i);
				cuentaLetras = true;

			}
		}
		
		if (cuentaLetras) {
			
			this.palabraModificada = modificadorPalabra.toString();
			
		} else {
			
			this.sumarIntentos();
			
		}
			
		return cuentaLetras;
		
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
	
	public boolean comprobarPartida() {
		
		if (palabraModificada.isEmpty() || this.intentosFallidos == 6) {
			
			setEstadoPartida(false);
			
		}
		
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
	
	public boolean comprobarGanado() {
		
		if (palabraModificada.isEmpty()) {
			
			setResultadoPartida(true);
			
		}else if (this.intentosFallidos == 6) {
			
			setResultadoPartida(false);
			
		}
		
		return resultadoPartida;
	}
	
	public char usarPista() {
		
		char letraPista = 0;
		pistas--;
		
	    Random rand = new Random();
	    int indiceLetra=rand.nextInt(palabraModificada.length());
	   
	    letraPista=palabraModificada.charAt(indiceLetra);
		
	    
	    return letraPista;
		
	}
	


}
