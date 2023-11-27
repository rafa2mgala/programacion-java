package dam.tematres.bucles;

import java.util.Scanner;
/**
 * Solución propuesta para la actividad 3.16
 * Cálculo del factorial de un número dado
 * @author rafa
 *
 */
public class Factorial {

	public static void main(String[] args) {
		int numero,factorial=1;
		Scanner in = new Scanner(System.in);
		//se asume que el número es introducido correctamente
		//, no hay que comprobar nada
		System.out.println("Introduzca un número entero positivo:");
		numero = in.nextInt();

		if(numero==0) 
			System.out.println("Por convenio el factorial de 0 es " +
					factorial);
		else {
			for(int i=numero;i>1;i--) 
				factorial *=i;
			
		    System.out.println("El factorial de " + numero + " es " + factorial);
		}
	}
}
