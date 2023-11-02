package dam.temados.poo.cadenas;

/**
 * Solución propuesta para el apartado b) de la actividad 2.3
 * @author rafa
 *
 */
public class LongitudCadena {

	public static void main(String[] args) {
		String frase=
				new String(" Aprende a programar en Java desde cero ");
		
		//se muestra la longitud de la cadena
		System.out.println("La longitud, en nº de caracteres, de la frase"
				+" es:" + frase.length());
		
		
		System.out.println("La frase sin espacios, al inicio y final, es:" +
				frase.trim());
		
		System.out.println("El número de espacios en blanco que hay " +
				" antes y después de la frase es:" + (frase.length() -
				frase.trim().length()));
	}
}
