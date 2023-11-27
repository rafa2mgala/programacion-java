package dam.tematres.bucles;

import java.util.Scanner;
/**
 * Solución propuesta para la actividad 3.12
 * Programa para mostrar un triángulo equilátero de lado indicado por el usuario
 * @author Rafa
 * @version 1.0
 * @since 1.0
 */
public class EquilateroDolar {
	public static void main(String[] args) {
		int lado,medio;
		Scanner entrada = new Scanner(System.in);
		//Pide por consola el la longitud del lado del triangulo a mostrar
		System.out.println("Introduce la longitud del lado del triangulo a dibujar: ");
		lado = entrada.nextInt();
		//se obtiene la columna central del triángulo
		medio = lado-1;
		for (int fila=0; fila<lado;fila++) {
			for (int columna=0; columna<lado*2-1; columna++) {	
				//se imprimen $ si la columna está comprendida entre valores
				//que van desde la posición del punto medio más menos la fila actual
				if(columna>=medio-fila && columna<=medio+fila)
					System.out.print("$");
				//en caso contrario se imprime un espacio
				else
					System.out.print(" ");

			}
			System.out.print("\n");
		}
		entrada.close();
	}
}