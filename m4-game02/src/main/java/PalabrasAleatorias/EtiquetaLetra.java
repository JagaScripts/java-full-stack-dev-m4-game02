/**
 * 
 */
package PalabrasAleatorias;

import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.SwingConstants;

/**
 * m4-game02 - PalabrasAleatorias - EtiquetaLetra
 *
 * @author Jose Antonio González Alcántara
 * 
 * Fecha de creación 06/05/2022
 */
public class EtiquetaLetra extends JLabel{

	
	
	public EtiquetaLetra(int x, int y) {
		super();
		this.setText("_");
		this.setHorizontalAlignment(SwingConstants.CENTER);
		this.setFont(new Font("Tahoma", Font.PLAIN, 11));
		this.setBounds(x, y, 50, 50);
	}
}
