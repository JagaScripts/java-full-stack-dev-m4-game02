package com.team2.m4_game02.controler;

import java.util.Random;

public class PalabrasAleatioras {

	public String GenerarPalabra () {
		 String[] x = {"perro", "gato", "hola", "bien", "programar", "palabra", "azar","otra","casa","frio"};
	        Random rand = new Random();

	        int n = rand.nextInt(10);
	        String z = x [n];
	        
	        return z;
	        
	}
}
