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
 * Excepcion que indica que todos los jugadores se han plantado
 * 
 * @author Jose Angel Garcia Fernandez
 * @version 1.1 24.09.2010
 */
public class AllPlayersPlantadosException extends Exception {

	private static final long serialVersionUID = 1L;

	/**
	 * Constructor para la excepcion.
	 * 
	 * @param error
	 *            inicializa con mensaje de la excepcion
	 */
	public AllPlayersPlantadosException(String message) {
		super(message);
	}

}
