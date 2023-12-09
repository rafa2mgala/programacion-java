package dam.tematres.excepciones;

import java.io.IOException;
import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 * Ejemplo de manejo de excepciones comprobadas y no comprobadas
 * ,se incluye un trazador para mensajes en consola y en fichero
 * Los mensajes de depuración se envían a fichero a partir del nivel
 * WARNING. Los mensajes de depuración en consola sólo se muestran 
 * si su nivel es SEVER.
 * @author rafa
 * @version
 * @see FileHandler FileHandler <br>https://docs.oracle.com/javase/8/docs/api/java/util/logging/FileHandler.html<br>
 * @see ConsoleHandler <br>ConsoleHandler <br>https://docs.oracle.com/javase/8/docs/api/java/util/logging/ConsoleHandler.html<br>
 * @see NullPointerException <br>NullPointerException <br>https://docs.oracle.com/javase/8/docs/api/java/lang/NullPointerException.html<br>
 */
public class TestExcepcionNoComprobada {
	static Logger logger = Logger.getLogger("TestExcepcionNoComprobada");
	public static void main(String[] args) {
		String cadena=null;
		//se desactiva el manejador de consola predetermnado
		logger.setUseParentHandlers(false);
		ConsoleHandler consoleHandler=new ConsoleHandler();
		FileHandler fileHandler;
		//se añade el manejador de consola propio
		logger.addHandler(consoleHandler);
		//se capturan las excepciones comprobadas provocadas
		//por el constructor de FileHandler
		try {
			//se inicializa un manejador de fichero
			fileHandler = new FileHandler("log.txt",5000,1);
			//se añade al  trazador el manejador de fichero
			logger.addHandler(fileHandler);
			//se fija el nivel SEVERE al manejador de consola
			consoleHandler.setLevel(Level.SEVERE);
			//se fija el nivel WARNING al manejador de fichero
			fileHandler.setLevel(Level.WARNING);
			//se captura la excepción no comprobada por el valor
			//nulo de la variable cadena
			try {
				//se muestra por consola un mensaje de depuración
				logger.severe("Se va a intentar usar la cadena"
						+ " con un valor nulo");
				//se intenta usar la variable cadena con valor nulo
				System.out.println(cadena.toUpperCase());
			}catch(NullPointerException e) {
				//se captura la excepción, el programa sigue
				//y se envía a fichero el mensaje de la excepción
				//capturada
				logger.warning("La cadena tiene valor nulo." +
						e.getLocalizedMessage());
			}
		} catch (SecurityException | IOException e) {
			//se captura la excepción comprobada provocada por el 
			//constructor de FileHandler
			logger.warning(e.getMessage());
		}
	}
}
