package dam.temauno.operadores;
//se importa la clase Scanner para poder referenciarla
import java.util.Scanner;
/**
 * Solución propuesta para la actividad 1.9. Se comenta el código y se
 * modifica para comprobar cuál de los dos números introducidos es el 
 * mayor
 * @author rafa
 *
 */
public class NumeroMayor {
	public static void main(String[] args) {
		//declaración de dos variables de tipo entero, numero1 se usará
		//para almacenar el primer número introducido, y numero2 para el
		//segundo
		int numero1, numero2;
		//se inicializa una variable de tipo Scanner a partir del flujo
		//de entrada estándar, el teclado
		Scanner sc = new Scanner(System.in);
		//se solicita un primer número por consola
		System.out.println("Introduce un número entero: ");
		//se lee el primer número y se asigna a la variable numero1
		numero1 = sc.nextInt();
		//se solicita un segundo número
		System.out.println("Introduce un número entero: ");
		//se lee el segundo número y se asigna a la variable numero2
		numero2 = sc.nextInt();
		//se comprueba cuál de los dos números es mayor y se prepara
		//el mensaje correspondiente
		String mensaje = numero1>=numero2?"El número " + numero1 +
				" es mayor o igual que " + numero2:"El número " + numero2 +
				" es mayor que " + numero1;
		//se muestra en consola cuál es el número mayor
		System.out.println(mensaje);	
	}
}
