package dam.temaseis.arrays;
/**
 * Ejemplo de generación de números aleatorios con Math.random
 * @author rafa
 * @version 1.0
 */
public class TestAleatorio {
	public static void main(String[] args) {
		int min,max;
		min=1;
		max=4;
		int aleatorio = (int)(Math.random()*(max+(min==0?1:0)))+min;
		System.out.println(aleatorio);
	}
}
