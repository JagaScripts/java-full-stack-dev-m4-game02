package controler;

public class comprobar_coincidencia_palabra {

	public static void comprobarletras() {
 
    	      char letra='0';
    	      String letras = "letras";
    	      char letraU='a';
    	      
    	      for (int i = 0; i < letras.length(); i++) {
				letra=letras.charAt(i);
				if (letra==letraU ) {
					System.out.println("letra correcta");
				}
    	      }
	}
}