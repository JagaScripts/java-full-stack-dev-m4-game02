package com.team2.m4_game02.controler;

import java.util.Scanner;

public class comprobar_coincidencia_palabra {

	public static void main(String args[]) {
 
	Scanner sc = new Scanner(System.in); 
    	      //Creando variables 

    	      int intentos=5,TL=0; 
    	      boolean Acierto=true,w=true; 
    	      int rep=0; 

    	      System.out.println("Ingrese palabra"); 
    	     String palabra=sc.nextLine(); 
    	     System.out.println("\n"); 

    	      String letra[]=new String[5]; 

    	      String [] letras =palabra.split(""); 
    	      String intento[] = new String[letras.length]; 
    	      String ingresadas[] = new String[letras.length]; 



    	      TL=letras.length-1; 
    	      for(int i=0;i<=10;i++){
    	    	  System.out.println("");
    	      } 
    	      	
    	      for(int i=1;i<letras.length;i++){ 
    	      		intento[i]="_ ";

    	      while(intentos>0) {   
    	        System.out.println("Ingrese letra"); 
    	        for(int z=0;i<letras.length;i++) {    

    	        	System.out.print(intento[i]); 
    	        } 
    	        
    	        System.out.println(""); 
    	        letra[0]=sc.nextLine();rep=0;boolean aviso=true; 
    	        for(int z=0;i<letras.length;i++) {
    	             w=true; 

    	            if(letras[i].equals(letra[0])) { 

    	               if(!intento[i].equals(letra[0])){ 

    	                  intento[i]=letra[0]; 
    	                  Acierto=false; 
    	                  rep++; ingresadas[i]=letras[0];  
    	                  }else{aviso=false;Acierto=false;} 
    	            } 
    	         }  

    	             if(aviso==false) {
    	            	 System.out.println(" Aviso: Ya ingresaste esa letra ");

    	             } 
    	             aviso=true;        
    	             if(Acierto==true) {

    	               intentos--; 
    	             } 
    	             else{TL=TL-rep;} 

    	System.out.println(" \nQuedan: "+intentos+" Intentos"); 
    	System.out.println(intentos); 
    		
    	if(intentos==0) {
    	System.out.println("\nLastima Perdiste\nLa palabra es: "+palabra);
    	} 
    	if(TL<=0){
    	System.out.println(palabra+"\nFelicidades ganaste, Bien echo.");intentos=0;} 
    	             Acierto=true;rep=0;
    	      }
    	   }
    	}
}
