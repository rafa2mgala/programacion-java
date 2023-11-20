package dam.tematres.excepciones;
/**
 * Ejemplo de manejo de excepciones con try, catch
 * throws y throw
 * @author Rafa
 * @version 1.0
 */
public class PruebaExcepcion {
	public static void main(String[] args) {
		PruebaExcepcion pe = new PruebaExcepcion();	
		//El try permite captura excepciones del tipo comprobadas y evitar que un programa
		//deje de funcionar.
		try {
			pe.leerLinea(null);
		} catch (RedNoDisponibleException e) {
			//se muestra el estado de la pila tras la excepción
			//aquí se podría poner más código, el código que queremos
			//que se ejecute tras la excepción. 
			e.printStackTrace();
		}finally {

		}
				
	}
	/**
	 * Método que recibe una cadena de caracteres como parámetro, comprueba
	 * si tiene valor nulo, en cuyo caso lanza una excepción. En caso contrario
	 * devuelve la cadena recibida
	 * @param buffer Cadena de entrada
	 * @return Cadena de entrada
	 * @throws RedNoDisponibleException Excepción simulada y creada para el ejemplo
	 * realmente no hay error de red
	 */
	public String leerLinea(String buffer) throws RedNoDisponibleException{
		/*comprobación deprecondición*/
		if(buffer==null) {
			throw new RedNoDisponibleException("Has pasado un nulo como parámetro"); 			 
		}
		return buffer;
	}
	
}
