package dam.temauno.operadores;

import java.util.Scanner;
/**
 * Solución propuesta para la actividad 1.10
 * @author Rafa
 * @version 1.0
 */
public class LetraMayuscula {
	public static void main(String[] args) {
		//inicializo el flujo de entrada estándar
		Scanner sc = new Scanner(System.in);
		
		//Solución 1: con String
		/*String letra;
		System.out.println("Introduzca una letra:");
		//recojo la letra desde la entrada estándar
		letra = sc.next();
		//comprueba si la letra introducida es mayúscula
		//y muestro el resultado
		System.out.println(letra.toUpperCase()==letra?"La letra introducida" +
				" es mayúscula":"La letra introducida es minúscula");*/
		
		//Solución 2: con wrapper
		/*Character letra;
		
		System.out.println("Introduzca una letra:");
		
		letra = sc.next().charAt(0);//se lee una cadena de caracteres y se obtiene
									//el carácter en primera posición;
		
		System.out.println(Character.isUpperCase(letra)?"Mayúscula":"Minúscula");
		*/
		
		//Solución 3: con char
		/*char letra; 
		
		//para comprobar si es mayúscula vale con verificar
		//que el valor decimal correspondiente al carácter
		//está comprendido entre 65 y 90
		
		System.out.println("Introduzca una letra:");
		letra = sc.next().charAt(0);
		
		System.out.println(((int)letra)>=65 && ((int)letra)<=90?
				"Mayúscula":"Minúscula");
		
		System.out.println(((int)letra)>=65?((int)letra)<=90?"Mayúscula":
			"No es un carácter":"No es un carácter");
		*/
		
		//Solución 4: con int
		int letra;
		System.out.println("Introduzca una letra:");
		letra = sc.next().charAt(0);
		
		System.out.println(letra>='A' && letra<='Z'?"Mayúsculas":"Minúsculas");
	}
}
