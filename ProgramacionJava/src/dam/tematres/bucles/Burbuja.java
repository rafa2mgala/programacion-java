package dam.tematres.bucles;

import java.util.Random;
import java.util.Scanner;
/**
 * Solución propuesta para la actividad 3.25.
 * Ordenación de un array de enteros mediante el método
 * de la burbuja
 * @author rafa
 * @version 1.0
 */
public class Burbuja {

	public static void main(String[] args) {
		Random random = new Random();
		Scanner sc = new Scanner(System.in);
		int tamanio=6; //almacena el tamaño del array a ordenar
		int[] numeros = new int[tamanio]; //array de enteros con números aleatorios
		int aux;//almacena el valor de la posición del array que
				//se va a modificar para que no se pierda
		
		System.out.println("Introduzca el tamaño del array a ordenar:");
		tamanio = sc.nextInt();
		System.out.println("Array desordenado");
		//se inicializa el array de enteros con números
		//aleatorios entre 1 y 100 inclusives
		for(int i=0;i<numeros.length;i++) {
			numeros[i] = random.nextInt(1, 101);
			System.out.print(numeros[i] + " ");
		}
		System.out.println("Array ordenado");
		System.out.println();
		//el bucle externo fija el número de pasadas
		//que se realizarán para ordenar el bucle
		for (int i = 0; i < numeros.length - 1; i++) {
			//el bucle interno fija los índices de los elementos
			//del array que se van a comparar y ordenar
			//si corresponde
			for (int j = 0; j < numeros.length - i - 1; j++) {
				//el número más a la derecha debe ser menor que el número
				//más a la izquierda, si es mayor o igual no se hace
				//nada
				if (numeros[j + 1] < numeros[j]) {
					//se guarda el número más a la derecha para no perderlo
					aux = numeros[j + 1];
					//se pone el número más a la izquierda (que es mayor)
					//en la posición del número más a la derecha
					numeros[j + 1] = numeros[j];
					//se recupera el valor del número más a la derecha
					//y se pone en la posición más a la izquierda
					//ya que era menor
					numeros[j] = aux;
				}
			}			
		}
		System.out.println();
		//se muestra el array ordenado
		for(int i=0;i<numeros.length;i++) {			
			System.out.print(numeros[i] + " ");
		}
		sc.close();
	}
}