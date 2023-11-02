package dam.temados.poo.cadenas.actividaddostres;

import java.util.Scanner;

public class Caracter {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	
		
		System.out.println("Introduce un número entre 0 y 255:");
		int numero = sc.nextInt();
		
		
		System.out.println(String.format("Caracter: %c", numero));		
		sc.close();
	}
}
