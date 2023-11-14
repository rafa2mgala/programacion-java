package dam.tematres.bucles;
/**
 * Actividad de clase. Trabajo con bucle
 * for para inicializar los elementos de un
 * array enteros con valores pares
 */
public class Pares {
	public static void main(String[] args) {
		int n=100;
		int[] pares = new int[n];
		//utilizo un bucle for porque conozco el número
		//de iteraciones a realizar, serán n iteraciones
		//empezando en 0 y terminando en n-1
		for(int i=0;i<n;i++) {
			pares[i]=i*2;
			//se muestra el valor par generado y asignado
			//al array en posición i
			System.out.println(pares[i]);
		}
	}
}
