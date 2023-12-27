package dam.temacuatro.parametros;
/**
 * Clase de tipo envoltorio. Envuelve un valor de tipo numérico o cadena
 * @author rafa
 * @version 1.0
 */
public class Resultado {
	private Object resultado;
	private final int ERROR_TIPO=-1;
	/**
	 * Constructor especializado en inicializar el valor envuelto
	 * de la propiedad resultado
	 * @param resultado Resultado de una operación, contiene el tipo concreto de la
	 * variable envuelta y su valor
	 */
	public Resultado(Object resultado) {
		this.resultado = resultado;
	}
	/**
	 * Devuelve el valor resultado desenvuelto en un entero
	 * @return Entero correspondiente al valor envuelto
	 */
	public int resultadoToInteger() {
		if(this.esResultadoTipoNumerico())
			return Integer.valueOf(resultado.toString()).intValue();
		return ERROR_TIPO;
	}
	/**
	 * Devuelve el valor resultado desenvuelto en un double
	 * @return double correspondiente al valor envuelto
	 */
	public double resultadoToDouble() {
		if(this.esResultadoTipoNumerico())
			return Double.valueOf(resultado.toString()).doubleValue();
		return ERROR_TIPO;
	}
	/**
	 * Devuelve el valor resultado desenvuelto en un float
	 * @return Float correspondiente al valor envuelto
	 */
	public float resultadoToFloat() {
		if(this.esResultadoTipoNumerico())
			return Float.valueOf(resultado.toString()).floatValue();
		return ERROR_TIPO;
	}
	/**
	 * Devuelve el valor resultado desenvuelto en una cadena
	 * @return String correspondiente al valor envuelto
	 */
	public String resultadoToString() {
		return this.resultado.toString();
	}
	/**
	 * Comprueba si el valor envuelto en el resultado es de tipo numérico
	 * @return True si es de tipo numérico el valor envuelto
	 */
	private boolean esResultadoTipoNumerico() {
		if(resultado instanceof Integer
				|| resultado instanceof Double
				|| resultado instanceof Float) {
			return true;
		}
		return false;
	}
	public void setResultado(Object resultado) {
		this.resultado = resultado;
	}
	@Override
	public String toString() {
		return  resultado.toString();
	}
}
