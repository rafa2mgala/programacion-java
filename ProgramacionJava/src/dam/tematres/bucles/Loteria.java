package dam.tematres.bucles;

import java.util.Scanner;
/**
 * Solución propuesta para la actividad 3.17. El programa
 * pide cifras del 0 al 9 y genera con las mismas
 * un número de 5 cifras que se entiende que será el 
 * número de lotería de Navidad
 * @author rafa
 * @version 1.0
 */
public class Loteria {

	public static void main(String[] args) {
		//una variable para contar números de las cifras
		//correctos
		int numCorrectos=0;
		int cifra=0;
		String numLoteria="";
		Scanner sc = new Scanner(System.in);
		while(numCorrectos<5) {
			//se pide por consola el número
			System.out.println("Introduzca un número entre 0 y 9:");
			cifra = sc.nextInt();
			//se comprueba si la cifra introducida es correcta			
			if(cifra>-1 && cifra<10) {
				//se añade la cifra al número de lotería
				numLoteria+=cifra;
				//se cuenta la cifra correcta
				numCorrectos++;
			}							
		}
		//se cierra el flujo de entrada
		sc.close();
		//se muestra el número de lotería
		System.out.println("El número de lotería es:" + numLoteria);
	}
}
