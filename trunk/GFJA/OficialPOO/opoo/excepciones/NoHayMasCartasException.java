//
// Universidad de Almer�a
// Ingenier�a T�cnica de Inform�tica de Sistemas
// Fuente Java seg�n Plantilla
//
// PROYECTO : Juego del Siete y medio
// ASIGNATURA : Programacion Orientada a Objetos
//
package opoo.excepciones;

/**
 * Excepcion que indica que no hay mas cartas sin usar
 * 
 * @author Jose Angel Garcia Fernandez
 * @version 1.1 24.09.2010
 */
public class NoHayMasCartasException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Constructor para la excepcion.
	 * 
	 * @param error
	 *            inicializa con mensaje de la excepcion
	 */
	public NoHayMasCartasException(String error) {
		super(error);
	}

}
