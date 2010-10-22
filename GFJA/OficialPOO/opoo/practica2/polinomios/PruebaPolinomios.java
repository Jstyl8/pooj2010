//
// Universidad de Almer�a
// Ingenier�a T�cnica de Inform�tica de Sistemas
// Fuente Java seg�n Plantilla
//
// PRACTICA : Practica 2, Documentacion de ejercicio 1
// ASIGNATURA : Programacion Orientada a Objetos
//
package opoo.practica2.polinomios;

/**
 * Clase para usar Polinomio
 * 
 * @author Jos� �ngel Garc�a Fern�ndez
 * @version 1.0 22/10/2010
 */
public class PruebaPolinomios {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Double[] coefi = { 1.0, 2.0 };
		Polinomio p1 = new Polinomio(coefi);
		System.out.println(p1);

		Polinomio pEsc = p1.multEsc(2);
		//System.out.println(pEsc);
		System.out.println(p1+"*"+p1);
		Polinomio p2 = p1.mult(p1);
		System.out.println(p2);
	}

}
