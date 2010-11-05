//
// Universidad de Almer�a
// Ingenier�a T�cnica de Inform�tica de Sistemas
// Fuente Java seg�n Plantilla
//
// PROYECTO : Practica 4 juego
// ASIGNATURA : Programacion Orientada a Objetos
//
package opoo.practica4.juego.veintiuno;

import opoo.practica4.juego.base.BarajaFrancesaMostrable;
import opoo.practica4.juego.base.Juego;
import opoo.practica4.juego.base.Jugador;
import opoo.practica4.juego.base.Limites;

/**
 * Clase que representa el juego del 21 visual
 * 
 * @author Jose Angel Garcia Fernandez
 * @version 1.0 24.09.2010
 */
public class VeintiunoVisual extends Juego {

	/**
	 * Constructor que inicializa el Veintinuno viusla
	 * 
	 * @param Jugadores
	 *            los jugadores de la partida
	 */
	public VeintiunoVisual(Jugador[] jugadores) {
		super("Veintiuno", jugadores, Limites.VEINTIUNO,
				new BarajaFrancesaMostrable());
	}
}
