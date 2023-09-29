package dam.temauno.io;

import java.util.Scanner;
/**
 * Ejemplo de uso la entrada/salida estándar
 * @author Rafa
 * @version 1.0
 */
public class TestIo {

	public static void main(String[] args) {		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce tu nombre:");
		String nombre = sc.next();
		System.out.println("Hola, tu nombre es: " + nombre);
		
		System.out.println("Qué edad tienes?");
		int edad = sc.nextInt();
		System.out.println("Tu edad es: " + edad);
		
		int opcionMenu = 3;
		System.out.println("********************************************");
		System.out.println("1. Alta de usuarios");
		System.out.println("2. Baja de usuarios");
		System.out.println("3. Salir");
		System.out.println("********************************************");
		opcionMenu = sc.nextInt();
		System.out.println("Has elegido la opción " + opcionMenu);
		sc.close();
	}
}
