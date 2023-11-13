package dam.tematres.bucles;

import java.util.Scanner;

/**
 * Se solicita un número por consola y se muestra su tabla
 * Solución propuesta a la actividad 3.10
 * de multiplicar
 * @author rafa
 * @version 1.0
 */
public class TablaMultiplicar {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final int NUMERO;
		System.out.println("Introduzca un número entero:");
		NUMERO = sc.nextInt();
		//se utiliza un bucle for porque se sabe el número de veces
		//que se van a repetir las operaciones dentro del bucle
		for(int i=1;i<11;i++)
			System.out.println(i*NUMERO);
	}

}
