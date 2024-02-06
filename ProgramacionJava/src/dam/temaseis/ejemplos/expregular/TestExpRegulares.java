package dam.temaseis.ejemplos.expregular;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 * Ejemplos de expresiones regulares. Se utilizan los métodos más coumnes de las clases Pattern y Matcher
 * @author rafa
 * @version 1.0
 */
public class TestExpRegulares {

	public static void main(String[] args) {
		String cadena="";
		Scanner sc = new Scanner(System.in);
		//1. Comprobar si el String cadena contiene exactamente el patrón (matches) “abc”
		System.out.println("Introduzca una cadena de caracteres:");
		cadena = sc.next();
		Pattern pat = Pattern.compile("abc");
		Matcher mat = pat.matcher(cadena);
		if (mat.matches()) {
			System.out.println("La cadena es abc");
		} else {
			System.out.println("La cadena no es abc");
		}
		//2. Comprobar si el String cadena contiene “abc”
		pat = Pattern.compile(".*abc.*");
		mat = pat.matcher(cadena);
		if (mat.matches()) {
			System.out.println("la cadena contiene abc");
		} else {
			System.out.println("la cadena no contiene abc");
		}

		//3. Comprobar si el String cadena empieza por “abc”

		pat = Pattern.compile("^abc.*");
		mat = pat.matcher(cadena);
		if (mat.matches()) {
			System.out.println("La cadena empieza por abc");
		} else {
			System.out.println("La cadena no empieza por abc");
		}

		//4. Comprobar si el String cadena empieza por “abc” ó “Abc”

		pat = Pattern.compile("^[aA]bc.*");
		mat = pat.matcher(cadena);
		if (mat.matches()) {
			System.out.println("La cadena empieza por abc o por Abc");
		} else {
			System.out.println("La cadena no empieza por abc, ni por Abc");
		}

		//5. Comprobar si el String cadena está formado por un mínimo de 5 letras mayúsculas 
		//o minúsculas y un máximo de 10.

		pat = Pattern.compile("[a-zA-Z]{5,10}");
		mat = pat.matcher(cadena);
		if (mat.matches()) {
			System.out.println("La cadena está formada por al menos 5 letras y menos de 10");
		} else {
			System.out.println("La cadena tiene menos 5 letras o más de 10");
		}

		//6. Comprobar si el String cadena no empieza por un dígito

		pat = Pattern.compile("^[^\\d].*");
		mat = pat.matcher(cadena);
		if (mat.matches()) {
			System.out.println("La cadena no empieza por dígito");
		} else {
			System.out.println("La cadena empieza por dígito");
		}
		//7. Comprobar si el String cadena no acaba con un dígito

		pat = Pattern.compile(".*[^\\d]$");
		mat = pat.matcher(cadena);
		if (mat.matches()) {
			System.out.println("La cadena no acaba en dígito");
		} else {
			System.out.println("La cadena acaba en dígito");
		}

		//8. Comprobar si el String cadena solo contienen los caracteres a ó b

		pat = Pattern.compile("(a|b)+");
		mat = pat.matcher(cadena);
		if (mat.matches()) {
			System.out.println("La cadena está formada por el carácter a o b");
		} else {
			System.out.println("La cadena tiene caracteres distintos a los caracteres a o b");
		}

		//9. Comprobar si el String cadena contiene un 1 y ese 1 no está seguido por un 2

		pat = Pattern.compile(".*1(?!2).*");
		mat = pat.matcher(cadena);
		if (mat.matches()) {
			System.out.println("La cadena contiene un 1 y no está seguido de un 2");
		} else {
			System.out.println("La cadena no contiene un 1 seguido de un 2");
		}				
	}
}
