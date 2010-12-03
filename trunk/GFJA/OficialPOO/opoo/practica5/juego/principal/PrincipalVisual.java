//
// Universidad de Almer�a
// Ingenier�a T�cnica de Inform�tica de Sistemas
// Fuente Java seg�n Plantilla
//
// PROYECTO : Practica 5 Juego
// ASIGNATURA : Programacion Orientada a Objetos
//
package opoo.practica5.juego.principal;

import opoo.practica5.juego.visual.VentanaJuegos;


/**
 * Clase de ejecucion para VentanaJuegos
 * 
 * @author Jos� �ngel Garc�a Fern�ndez
 * @version 1.0 03/12/2010
 */
public class PrincipalVisual {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		VentanaJuegos ventana = new VentanaJuegos();
		ventana.setLocationRelativeTo(null);
		ventana.setVisible(true);
	}

}
