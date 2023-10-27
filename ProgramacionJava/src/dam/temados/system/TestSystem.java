package dam.temados.system;

/**
 * Ejemplo de uso de la clase System para obtener la versión de java
 * y el símbolo separador de directorios
 * @author rafa
 * @version 1.0
 */
public class TestSystem {

	public static void main(String[] args) {
		//se obtiene y muestra la versión de Java
		System.out.println(System.getProperty("java.version"));
		//se obtiene y muestra el símbolo separador de carpetas
		System.out.println(System.getProperty("file.separator"));
		//se obtiene y muestra el instante actual en milisegundos
		System.out.println(System.nanoTime());
		//se obtienen y muestran todas las propiedades del sistema
		System.out.println(System.getProperties());		
	}

}
