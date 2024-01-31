package dam.temaseis;

import java.util.logging.LogManager;
import java.util.logging.Logger;
/**
 * Clase de utilidad para construir un logger a partir
 * del nombre de la clase que lo requiere
 * @author rafa
 * @version 1.0
 */
public class MyLogger {
	public static Logger getLogger(String clase) {
		return LogManager.getLogManager().getLogger(clase);
	}
}
