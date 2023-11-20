package dam.tematres.bucles;

import java.util.Scanner;
/**
 * Solución propuesta para la actividad 3.14
 * Calcula el MCD de dos números dados
 * @author rafa
 * @version 1.0
 */
public class MaximoComunDivisor {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Introduzca el primer número entero positivo distinto de 0:");
		//la variable auxiliar 3 se utilizará para almacenar cálculos
		//intermedios. La auxiliar 1 se usa para preservar el valor inicial del primer
		//número y auxiliar 2 para el segundo
		int num1, num2, aux1,aux2,aux3; 
		num1 = in.nextInt();
		aux1 = num1;
		System.out.println("Introduzca el segundo número entero positivo, "
				+ "distinto de 0:");
		num2 = in.nextInt();
		aux2 = num2;
		if(num1<=0 || num2<=0) {
			System.out.println("Alguno de los números introducidos no es correcto");
			//salida del programa indicando error (valor negativo)
			System.exit(-1);
		}
		//cuando se obtenga un resto 0 por división entera entre el primer y
		//segundo número habremos encontrado el MCD
		while (num2 != 0) {
			//se guarda num2 en la variable auxiliar aux3
			//para no perder su valor
			aux3 = num2;
			//se calcula el resto por división entera
			//entre num1 y num2
			num2 = num1 % num2;
			//se guarda el valor de num2 en num1 para la siguiente iteración
			num1 = aux3;
		}
		System.out.println("El MCD de " + aux1 + " y " + aux2 + " es:"+num1);
	}
}
