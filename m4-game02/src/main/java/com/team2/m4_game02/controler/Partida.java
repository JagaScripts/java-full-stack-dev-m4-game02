package com.team2.m4_game02.controler;

public class Partida {

	private PalabrasAleatioras palabraObjeto;
	private String palabra;
	private int intentos;

	public Partida() {
		this.palabraObjeto = new PalabrasAleatioras();
		this.palabra = palabraObjeto.GenerarPalabra();
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

	private void restarIntentos() { //Si comprobarLetras es false se resta un intento
		this.intentos--;
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
	
	private int numeroImagenAhorcado() {
		
		int num = 7;//Se empieza con el numero de intentos
		
		num = num - this.intentos; // 7 - 7 = 0, primera imagen es 0, intentos-- --> 7-6 = 1, segunda imagen
		
		return num;
	}
	

}
