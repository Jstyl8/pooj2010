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
 * Enumeracion con los tipos de respuesta posible
 * 
 * @author Jos� �ngel Garc�a Fern�ndez
 * @version 1.0 03/12/2010
 */
public enum tipoRespuesta {
	PIEDRA("Piedra"), PAPEL("Papel"), TIJERA("Tijera"), PARES("Pares"), NONES(
			"Nones"), CERO("0"), UNA("1"), DOS("2"), TRES("3");

	private String respuesta;

	tipoRespuesta(String resp) {
		this.respuesta = resp;
	}

	public String getResp() {
		return respuesta;
	}
	
	public static tipoRespuesta getInt(int a){
		return values()[a];
	}
}
