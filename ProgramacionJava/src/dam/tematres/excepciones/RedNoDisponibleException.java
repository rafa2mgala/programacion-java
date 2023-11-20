package dam.tematres.excepciones;
/**
 * Ejemplo de excepción comprobada
 * @author Rafa
 * @version 1.0
 */
public class RedNoDisponibleException extends Exception {	
	/**
	 * Constructor especializado en pasar el mensaje de error personalizado
	 * a la clase Exception
	 * @param msg Mensaje peresonalizado y asociado con el error
	 */
	public RedNoDisponibleException(String msg) {
		super(msg);
	}
}
