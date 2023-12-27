package dam.temacuatro.parametros;
/**
 * Ejemplo de parámetros de entrada-salida
 * @author Rafa
 * @version 1.0
 */
public class TestParamEntradaSalida {
	public static void main(String[] args) {
		TestParamEntradaSalida test = 
				new TestParamEntradaSalida();
		int sum1 = 10;
		int sum2 = 20;

		Resultado resultado= new Resultado(5);
		
		System.out.println("Valores de las variables de los parámetros (sum1,sum2)"
				+ " pasado por valor=" + sum1 + "," + sum2 + ". Antes de llamar al método sumar()");
		System.out.println("Valor de la variable del parámetro (suma)"
				+ " pasado por referencia=" + resultado + ". Antes de llamar al método sumar()");
		//sum1, sum2 y suma son parámetros actuales
		//suma se pasa por referencia
		test.sumar(sum1, sum2, resultado);		
		System.out.println("Valores de las variables de los parámetros (sum1,sum2)"
				+ " pasado por valor después de llamar al método sumar(). sum1=" + sum1
				+ ",sum2=" + sum2);
		System.out.println("Valor de la variable del parámetro (suma)"
				+ "pasado por referencia después de llamar al método sumar(). resultado=" 
				+ resultado);
	}
	/**
	 * Calcula la suma de dos números enteros y pone el resultado
	 * en el tercer parámetro. Este último parámetro
	 * actúa como parámetro de salida
	 * @param sum1 Parámetro de entrada, se pasa por valor
	 * @param sum2 Parámetro de entrada, se pasa por valor
	 * @param resultado Parámetro de entrada-salida, se pasa por referencia
	 * Es un parámetro sólo de salida porque no se usa su valor
	 * dentro del método.
	 */
	public void sumar(int sum1, int sum2, Resultado resultado) {		
		resultado.setResultado(sum1+sum2+resultado.resultadoToInteger());
		
		sum1=sum2=0; //se cambia el valor de las variables de los
		//parámetros pasados por valor
		System.out.println("Se han modificado las variables sum1 y sum2 "
				+ " dentro del método sumar(), sum1=" + sum1 + ",sum2=" + sum2);
	}
	/**
	 * Calcula la suma un numéro entero al resultado
	 * de la suma y pone el resultado
	 * en el tercer parámetro. Este último parámetro
	 * actúa como parámetro de entrada y salida
	 * @param sum1 Parámetro de entrada, se pasa por valor
	 * @param sum2 Parámetro de entrada, se pasa por valor
	 * @param resultado Parámetro de salida, se pasa por referencia
	 * Es un parámetro es de entrada y salida porque 
	 * se usa su valor dentro del método.
	 */
	public void sumar(int sum, Resultado resultado) {
		resultado.setResultado(resultado.resultadoToInteger()+sum);
		
		sum=0; //se cambia el valor de la variable del parámetro
		//pasado por valor
		System.out.println("Se ha modificado la variable sum dentro del "
				+ " método sumar(), sum=" + sum);
	}
}
