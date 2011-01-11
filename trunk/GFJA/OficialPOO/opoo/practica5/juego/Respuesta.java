//
// Universidad de Almer�a
// Ingenier�a T�cnica de Inform�tica de Sistemas
// Fuente Java seg�n Plantilla
//
// PRACTICA : Practica 5, Juego
// ASIGNATURA : Programacion Orientada a Objetos
//
package opoo.practica5.juego;

/**
 * Interfaz que representa una respuesta
 * 
 * @author Jos� �ngel Garc�a Fern�ndez
 * @version 1.1 06/12/2010
 */
public interface Respuesta {

	/**
	 * Obtiene una respuesta aleatoria
	 * 
	 * @param nJugadores
	 *            el numero de jugadores activo
	 * @return la respuesta
	 */
	public Respuesta rand(int nJugadores);
}
