package dam.temados.poo.cadenas;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;
/**
 * Solución propuesta para el apartado e) de la actividad 2.3
 * @author rafa
 * @version 1.0
 *
 */
public class NumeroDecimal {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String numero;
		int posDecimal, posMiles;
		System.out.println("Introduce un número con el siguiente formato: "
				+ "d.ddd,dd");
		numero = in.nextLine();
		
		
		
		//se obtiene el símbolo separador decimal según la configuración del sistema
		char simboloDecimal = ((DecimalFormat)DecimalFormat.
				getInstance(Locale.getDefault())).
				getDecimalFormatSymbols().
				getDecimalSeparator();
		
		//se obtiene el símbolo separador de miles según la configuración del sistema
		char simboloMil = ((DecimalFormat)DecimalFormat.getInstance(Locale.getDefault())).
				getDecimalFormatSymbols().getGroupingSeparator();
		//se calcula la posición del separador de miles
		posMiles = numero.indexOf(simboloMil);
		//se calcula la posición del símbolo decimal
		posDecimal = numero.indexOf(simboloDecimal);
		System.out.println((posMiles<0 || posDecimal<0)?
				"Has introducido el número en un formato"
				+ " incorrecto":"La posición del separador de miles es " 
				+ (posMiles+1) + " y la posición"
				+ " del separador decimal es " + (posDecimal+1));
		
		
		
		
		
		
		
	}

}
