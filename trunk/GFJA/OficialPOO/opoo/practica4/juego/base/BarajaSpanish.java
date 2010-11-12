//
// Universidad de Almer�a
// Ingenier�a T�cnica de Inform�tica de Sistemas
// Fuente Java seg�n Plantilla
//
// PROYECTO : Practica 4 Juego
// ASIGNATURA : Programacion Orientada a Objetos
//
package opoo.practica4.juego.base;

/**
 * Clase que representa una baraja espa�ola
 * 
 * @author Jos� �ngel Garc�a Fern�ndez
 * @version 1.1 12/11/2010
 */
public class BarajaSpanish extends Baraja {

	public BarajaSpanish() {
		super(tipoBaraja.SPANISH);
	}

	protected void creaBaraja() {
		this.tipo = tipoBaraja.SPANISH;
		this.nombreBaraja = "Baraja Espa�ola";
		cartas = new Carta[40];
		Carta carta;
		int j = 0;
		for (int k = 0; k < palos.length; k++) {
			for (int i = 1; i < 8; i++) {
				carta = new CartaSpanish(palos[k], i, i);
				cartas[j] = carta;
				j++;
			}
			for (int i = 10; i < 13; i++) {
				carta = new CartaSpanish(palos[k], i, 0.5f);
				cartas[j] = carta;
				j++;
			}
		}
	}

	@Override
	protected void creaPalos() {
		palos = new String[4];
		palos[0] = "O";
		palos[1] = "C";
		palos[2] = "E";
		palos[3] = "B";

	}

}
