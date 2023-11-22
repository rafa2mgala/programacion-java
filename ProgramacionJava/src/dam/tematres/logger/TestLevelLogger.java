package dam.tematres.logger;

import java.util.logging.ConsoleHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Ejemplo de ajuste del nivel de trazado en manejador y trazador
 * @author rafa
 * @version 1.0
 */
public class TestLevelLogger {
	private Logger logger;
	public static void main(String[] args) {
		TestLevelLogger tll = new TestLevelLogger();
		tll.logger = Logger.getLogger(TestLevelLogger.class.getName());
		
		//creo una instancia de manejador de consola
		ConsoleHandler consoleHandler = new ConsoleHandler();
		consoleHandler.setLevel(Level.WARNING);
		
		tll.logger.addHandler(consoleHandler);
		//se establece el nivel del logger, prevalece el nivel de trazado
		//del logger sobre los niveles de trazado de los manejadores
		//El nivel del trazador debe ser menor o igual que el nivel más
		//bajo de los manejadores.
		tll.logger.setLevel(Level.FINER);

		//registro un mensaje con nivel inferior a config
		tll.logger.finer("Prueba de mensaje con nivel inferior a config");

		//registro un mensaje con nivel igual a config
		tll.logger.config("Prueba de mensaje con nivel igual a config");

		//registro otro mensaje de un nivel superior al config
		tll.logger.warning("Prueba de mensaje con nivel superior a config");
	}
}
