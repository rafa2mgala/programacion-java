package dam.tematres.bucles;

import java.util.Scanner;
/**
 * Solución propuesta para l actividad 3.11
 * @author rafa
 * @version 1.0
 *
 */
public class Perfecto {
	public static void main(String[] args) {
		//declaro una variable de tipo entero para almacenar la suma
		//de los divisores
		int sumaDivisores=0;		
		//pedir un número por consola, natural > 0
		Scanner in = new Scanner(System.in);
		System.out.println("Introduzca un número natural mayor que 0:");
		//almaceno el número en una variable
		int numero = in.nextInt();
		if(numero<0) {
			System.out.println("El número introducido no es válido");
			System.exit(-1);
		}		
		//tengo que calcular los divisores del número sin incluir el
		//número, hasta llegar al 1. El cálculo de los divisores se 
		//repite n-1 veces, siendo n el número introducido
		for(int i=numero-1;i>0;i--) {
			//para calcular si un número es divisor de otro, utilizo
			//el operador %
			if(numero%i==0) {
				//si el resto del cálculo del divisor es 0, sumo el divisor
				//a una variable que sirve de sumador de divisores.
				sumaDivisores +=i; //sumaDivisores = sumaDivisores + i;
			}
			//Si no es
			//divisor, no hago nada
		}
		//Una vez he obtenido todos los divisores, y por tanto la suma
		//de los mismos, comparo dicha suma con el número introducido. Si
		//son iguales, el número es perfecto y no es perfecto en caso contrario
		if(sumaDivisores==numero)
			System.out.println("El número " + numero + " es perfecto!");
		else
			System.out.println("El número " + numero + " NO es perfecto!");
	}
}
