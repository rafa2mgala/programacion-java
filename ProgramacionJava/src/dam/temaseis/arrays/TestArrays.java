package dam.temaseis.arrays;
/**
 * Arrays regulares en Java, inicialización, indexación y acceso
 * @author rafa
 * @version 1.0
 */
public class TestArrays {
	public static void main(String[] args) {
		//inicialización, los elementos del array no están inicializados explícitamente,
		//su valor lo toman del tipo
		int[] edades = new int[5];
		//inicialización, se define el número de elementos del array y se inicializan
		//a los valores indicados
		int[] salarios = {2,2,3,4};
			
		for(int i=0;i<edades.length;i++)
			System.out.println(edades[i]);
		
		for(int i=0;i<salarios.length;i++)
			System.out.println(salarios[i]);
		
		int[][] tablero = new int[4][];
		//cada vez que cambio de fila, el número de columnas
		//se incrementa en una unidad	
		for(int i=0;i<tablero.length;i++) {
			tablero[i] = new int[i+1];
			tablero[i][0]=2*i+1;
			//muestro el primer elemento de cada fila
			System.out.print(tablero[i][0]+ "\t");
			for(int j=1;j<tablero[i].length;j++) {
				tablero[i][j]=(2*i+1)*(j+i);
				//se muestran los siguientes elementos, al primero, de cada fila
				System.out.print(tablero[i][j]+ "\t");
			}
			System.out.println();
		}		
	}
}
