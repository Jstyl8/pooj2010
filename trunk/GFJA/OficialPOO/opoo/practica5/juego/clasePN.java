//
// Universidad de Almer�a
// Ingenier�a T�cnica de Inform�tica de Sistemas
// Fuente Java seg�n Plantilla
//
// PRACTICA : Practica 5, Juego
// ASIGNATURA : Programacion Orientada a Objetos
//
package opoo.practica5.juego;

import java.util.Random;

/**
 * Clase que recubre a la enumeracion de pares nones
 * 
 * @author Jos� �ngel Garc�a Fern�ndez
 * @version 1.1 06/12/2010
 */
public class clasePN implements Respuesta {

	private int nDedos;

	private enumPN pn;

	public clasePN(int nDedos, enumPN tce) {
		this.nDedos = nDedos;
		pn = tce;
	}

	public clasePN(enumPN tce) {
		this(0, tce);
	}

	@Override
	public String toString() {
		return pn + " n�Dedos:" + nDedos;
	}

	@Override
	public boolean equals(Object o) {
		if (!(o instanceof clasePN))
			return false;
		clasePN cpn = (clasePN) o;
		if (cpn.pn == this.pn)
			return true;
		else
			return false;
	}

	public Respuesta getEnum(int a) {
		return new clasePN(this.nDedos, enumPN.values()[a]);
	}

	public int length() {
		return enumPN.values().length;
	}

	@Override
	public Respuesta rand() {
		Random r = new Random();
		clasePN aux = new clasePN(r.nextInt(11), enumPN.values()[r
				.nextInt(length())]);
		return aux;
	}

	public int ordinal() {
		return pn.ordinal();
	}

	public int getNDedos() {
		return nDedos;
	}

	public void setNDedos(int dedos) {
		nDedos = dedos;
	}

	public enumPN getPn() {
		return pn;
	}
}