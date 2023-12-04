package dam.tematres.bucles;
/**
 * Solución propuesta para la actividad 2.24
 * Inicializa una matriz de 3x3 con valores enteros aleatorios
 * entre 1 y 10. Después calcula la matriz traspuesta y la
 * muestra por consola
 * @author rafa
 * @version 1.0
 */
public class MatrizTraspuesta {
	public static void main(String[] args) {
		//se inicializa la matriz de enteros 3x3
		int[][] matriz = new int [3][3];
		//se asignan los valores aleatorios en cada 
		//posición de la matriz. Se fija la fila
		//y se varía en columnas
		for (int i=0;i<matriz.length;i++) {
			for (int j=0;j<matriz[i].length;j++) {
				matriz[i][j]= (int) (Math.random()*10+1);
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("Traspuesta");
		//se muestra la matriz traspuesta, solo
		//es necesario trasponer los índices de fila
		//y columna
		for (int i=0;i<matriz.length;i++) {
			for (int j=0;j<matriz[i].length;j++) {
				System.out.print(matriz[j][i] + " ");
			}
			System.out.println();
		}
	}

}
