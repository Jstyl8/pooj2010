package opoo.practica3.numeros;

public class Racional extends Real {

	private long numerador;
	private long denominador;

	// CONSTRUCTOR
	public Racional(long num, long den) {
		super((double) num / den);
		numerador = num;
		denominador = den;
	}

	public String toString() {
		return (numerador + "/" + denominador);
	}

	// ACCESORES

	public long getNumerador() {
		return numerador;
	}

	public long getDenominador() {
		return denominador;
	}

	// OPERACIONES

	/**
	 * Devuelve el resultado de sumar este n�mero y el que se pasa como
	 * par�metro. No modifica ninguno de los objetos (ni este n�mero ni el
	 * par�metro)
	 */
	public Racional suma(Racional op) {
		long num = numerador * op.getDenominador() + denominador
				* op.getNumerador();
		long den = denominador * op.getDenominador();
		return (new Racional(num, den));
	}

	/**
	 * Devuelve el resultado de restar a este n�mero el que se pasa como
	 * par�metro. No modifica ninguno de los objetos (ni este n�mero ni el
	 * par�metro)
	 */
	public Racional resta(Racional op) {
		long num = numerador * op.getDenominador() - denominador
				* op.getNumerador();
		long den = denominador * op.getDenominador();
		return (new Racional(num, den));
	}

	/**
	 * Devuelve el resultado de multiplicar este n�mero y el que se pasa como
	 * par�metro. No modifica ninguno de los objetos (ni este n�mero ni el
	 * par�metro)
	 */
	public Racional multiplica(Racional op) {
		return (new Racional(numerador * op.getNumerador(), denominador
				* op.getDenominador()));
	}

	/**
	 * Devuelve el resultado de dividir este n�mero por el que se pasa como
	 * par�metro. No modifica ninguno de los objetos (ni este n�mero ni el
	 * par�metro)
	 */
	public Racional divide(Racional op) {
		return (new Racional(numerador * op.getDenominador(), denominador
				* op.getNumerador()));
	}

}
