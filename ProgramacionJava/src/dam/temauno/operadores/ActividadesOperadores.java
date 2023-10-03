package dam.temauno.operadores;
//se importa la clase Scanner para poder referenciarla
import java.util.Scanner;
/**
 * Solución propuesta para la actividad 1.8
 * @author rafa
 *
 */
public class ActividadesOperadores {
	public static void main(String[] args) {
		//Actividad 1.8
		//--------------------------------------------------------------------
		//declaración de dos variables de tipo entero
		int numero1, numero2;
		//inicialización de una variable de tipo booleano
		boolean multiplo=false;
		//inicialización de una variable de tipo Scanner, que se usará
		//para obtener información del usuario a través del teclado
		Scanner sc = new Scanner(System.in);
		//se pide un número por consola
		System.out.println("Introduce un número entero: ");
		//se lee el número introducido y se asigna a la variable numero1
		numero1 = sc.nextInt();
		//se pide un segundo número por consola
		System.out.println("Introduce un número entero: ");
		//se lee el segundo número y se asigna a la variable numero2
		numero2 = sc.nextInt();
		//se utiliza el operador ? para asignar el valor a la variable
		//multiplo. Si esta variable toma el valor true el numero1 es 
		//múltiplo de numero2 o viceversa. Para comprobar si un número
		//es múltiplo de otro se toma el resto de la división entera del 
		//número mayor entre el número menor. Si el resto es  0 el número
		//mayor es múltiplo del menor.
		multiplo = numero1>=numero2?numero1%numero2==0:numero2%numero1==0;
		//se muestra un mensaje indicando la multiplicidad
		System.out.println(multiplo?"El número " + numero1 + 
		" es múltiplo de " + numero2:"El número " + numero2 + 
		" es múltiplo de " + numero1);
		//se cierra el flujo de teclado
		sc.close();
	}

}
