package dam.tematres.condicionales;

import java.util.Scanner;

/**
 * Clase para mostrar el mayor de tres números introducidos
 * @author Rafa
 * @version 1.0
 * @since 1.0
 */
public class NumeroMayor {
	public static void main(String[] args) {
		int numero1, numero2, numero3;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un número entero: ");
		numero1 = sc.nextInt();
		System.out.println("Introduce un número entero: ");
		numero2 = sc.nextInt();
		System.out.println("Introduce un número entero: ");
		numero3 = sc.nextInt();
		// Cierra el flujo de entrada
		sc.close();
		//comprueba y muestra el número mayor
		if(numero1>=numero2 && numero1>=numero3)
			System.out.println("El número " + numero1 + " es el mayor");
		else if(numero2>=numero3)
			System.out.println("El número " + numero2 + " es el mayor");
		else
			System.out.println("El número " + numero3 + " es el mayor");

	}
}