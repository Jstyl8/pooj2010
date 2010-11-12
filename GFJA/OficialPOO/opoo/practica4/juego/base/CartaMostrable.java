//
// Universidad de Almer�a
// Ingenier�a T�cnica de Inform�tica de Sistemas
// Fuente Java seg�n Plantilla
//
// PROYECTO : Practica 4 Juego
// ASIGNATURA : Programacion Orientada a Objetos
//
package opoo.practica4.juego.base;

import javax.swing.ImageIcon;

/**
 * Interfaz de una CartaMostrable
 * 
 * @author Jos� �ngel Garc�a Fern�ndez
 * @version 1.0 12/11/2010
 */
public interface CartaMostrable {

	/**
	 * Metodo que obtiene la imagen de la carta
	 * 
	 * @return la imagen de la carta
	 */
	ImageIcon getImgCarta();

	/**
	 * Metodo que modifica la imagen de la carta
	 * 
	 * @param img
	 *            la imagen a poner
	 */
	void setImgCarta(ImageIcon img);

}
