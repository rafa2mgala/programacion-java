package dam.temaseis.arrays;
/**
 * Ejemplo de inicializaciones de arrays
 * con 2 y 3 dimensiones
 * @author Rafa
 * @version 1.0
 */
public class InicializaArrays {
	public static void main(String[] args) {
		//array bidimensional
		int[][] tablero = new int[8][8];
		//control de filas
		for(int i=0;i<8;i++) {
			//control de columnas
			for(int j=0;j<8;j++) {
				tablero[j][i]=1;
			}
		}
		//array tridimensional, inicialización
		Object[][] dimensionUno = new Object[3][3];
		for(int i=0;i<3;i++) {			
			for(int j=0;j<3;j++) {
				dimensionUno[i][j]=new Object[] {1,2,3};
			}
		}
		//se muestra el contenido del array tridimensional
		for(int i=0;i<3;i++) {	
			for(int j=0;j<3;j++) {
				System.out.println("X,Y -> " + i + "," + j);
				Object[] terceraDimension = (Object[]) dimensionUno[i][j];
				for(int k=0;k<3;k++) {
					System.out.println("Z -> " + k + ",valor = " +terceraDimension[k]);
				}
				System.out.println();
			}
		}
	}

}
