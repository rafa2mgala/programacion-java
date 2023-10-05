package dam.temauno.expresiones;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
/**
 * Solución propuesta a la actividad 1.14.
 * Expresiones, operadores, conversiones, variables y constantes
 * @author Rafa
 * @version 1.0
 */
public class ActividadUnoCatorce {

	public static void main(String[] args) {
		final int A_MAY=65;
		final int A_MIN=97;
		final int Z_MAY=90;
		final int Z_MIN=122;
		
//		10. Comprobar si la primera cifra de un número entero N de 3 cifras es impar
		int numero = 123;
		System.out.println((123/100)%2==0?"Primera cifra par": "Primera cifra impar");

		//11. Comprobar si la primera cifra de un número entero N de 4 cifras es par
		numero = 4321;
		System.out.println(((int)numero/1000)%2==0?"Primera cifra par": "Primera cifra impar");

		//12. Comprobar si una variable A de tipo carácter contiene 
		//una letra mayúscula
		char caracterA = 'e';
		System.out.println((!Character.isDigit(caracterA) 
				&& Character.valueOf(caracterA).toString().toUpperCase().
				equals(Character.valueOf(caracterA).toString()))?
						"Mayúscula":"O minúscula o no es un carácter");
	}

}
