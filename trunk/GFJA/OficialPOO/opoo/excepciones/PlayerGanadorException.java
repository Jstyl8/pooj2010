//
// Universidad de Almer�a
// Ingenier�a T�cnica de Inform�tica de Sistemas
// Fuente Java seg�n Plantilla
//
// PRACTICA : Practica X, Documentacion de ejercicio Y
// ASIGNATURA : Programacion Orientada a Objetos
//
package opoo.excepciones;

import opoo.practica5.juego.JugadorM;

/**
 * Excepcion cuando se produzca un ganador
 * 
 * @author Jos� �ngel Garc�a Fern�ndez
 * @version 1.0 03/12/2010
 */
public class PlayerGanadorException extends Exception {

	private JugadorM ganador;

	/**
	 * Genera un objeto de tipo PlayerGanadorException
	 * 
	 * @param message
	 */
	public PlayerGanadorException(String message, JugadorM ganador) {
		super(message);
		this.ganador = ganador;
		// TODO Auto-generated constructor stub
	}

	public JugadorM getGanador() {
		return ganador;
	}

}
