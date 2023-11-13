package dam.tematres.condicionales;

import java.util.Scanner;
/**
 * Ejemplo de ordenación de mayor a menor de tres números enteros
 * @author rafa
 * @version 1.0
 */
public class OrdenMayorMenor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Pedimos tres números enteros por consola y los almacenamos en las variables
		//numero1, numero2 y numero3
		System.out.println("Introduce un número entero:");
		int numero1 = sc.nextInt();
		System.out.println("Introduce otro número entero:");
		int numero2 = sc.nextInt();
		System.out.println("Introduce otro número entero:");
		int numero3 = sc.nextInt();
		//se comparan para determinar el orden y se muestran
		//ordenados
		if(numero1>=numero2 && numero2>=numero3) {
			System.out.println("Ordenados de mayor a menor: " 
					+ numero1 + ", " + numero2 + ", " + numero3);
		}
		else if(numero2>=numero1 && numero1>=numero3) {
			System.out.println("Ordenados de mayor a menor: " 
					+ numero2 + ", " + numero1 + ", " + numero3);
		}
		else if(numero3>=numero2 && numero2>=numero1) {
			System.out.println("Ordenados de mayor a menor: " 
					+ numero3 + ", " + numero2 + ", " + numero1);
		}
		else if(numero1>=numero3 && numero3>=numero2) {
			System.out.println("Ordenados de mayor a menor: " 
					+ numero1 + ", " + numero3 + ", " + numero2);
		}
		else if(numero2>=numero3 && numero3>=numero1) {
			System.out.println("Ordenados de mayor a menor: " 
					+ numero2 + ", " + numero3 + ", " + numero1);
		}
		else if(numero3>=numero1 && numero1>=numero2) {
			System.out.println("Ordenados de mayor a menor: " 
					+ numero3 + ", " + numero1 + ", " + numero2);			
		}
	}

}
