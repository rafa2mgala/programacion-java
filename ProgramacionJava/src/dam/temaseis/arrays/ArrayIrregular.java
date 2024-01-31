package dam.temaseis.arrays;
/**
 * Ejemplo de array bidimensional irregular
 * @author Rafa
 * @version 1.0
 */
public class ArrayIrregular {
	public static void main(String[] args) {
		//inicialización de un array bidimensional
		//la primera dimensión (filas) tiene un tamaño
		//fijo, la segunda dimensión no (columnas
		int[][] tablero = new int[5][];
		for(int i=0;i<tablero.length;i++) {
			//en cada iteración se inicializa la segunda
			//dimensión de manera dinámica
			tablero[i] = new int[i+1];			
		}
		//se recorren los elementos del array bidimensional
		//y se muestran por consola
		for(int i=0;i<tablero.length;i++) {
			for(int j=0;j<tablero[i].length;j++) {
				System.out.print(tablero[i][j]);
			}
			System.out.println();
		}
	}
}
