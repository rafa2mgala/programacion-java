package dam.tematres.logger;

import java.io.IOException;
import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 * Manejador de tipo fichero. Sólo establece el nivel y el nombre
 * del fichero. Con este manejador sólo se pueden enviar a fichero
 * los mensajes de trazado de nivel WARNING hacia arriba.
 * @author rafa
 * @version 1.0
 */
public class FileHandlerLogger {
	public static void main(String[] args) {
		//se inicializa el trazador
		Logger logger = 
				Logger.getLogger(FileHandlerLogger.class.getName());
		//se deshabilita el manejador de consola predeterminado
		logger.setUseParentHandlers(false);
		//se declara una variable para el manejador de 
		//tipo fichero 
		FileHandler fileHandler;
		ConsoleHandler consoleHandler;

		try {
			//se instancia el manejador de registrador de 
			//tipo fichero
			fileHandler = new FileHandler("logs.txt", 5000, 1);	
			//se asigna una nueva instancia de manejador de consola
			consoleHandler =new ConsoleHandler();
			//se aplica el nivel SEVERE al manejador de consola
			consoleHandler.setLevel(Level.SEVERE);
			//se añade el nuevo manejador de consola
			logger.addHandler(consoleHandler);
			//se establece el nivel del manejador de fichero a
			//WARNING
			fileHandler.setLevel(Level.WARNING);
			//se añade el nuevo manejador de fichero
			logger.addHandler(fileHandler); 
		} catch (SecurityException | IOException e) {
			e.printStackTrace();
		}
				
		//se asigna el nivel CONFIG al registrador
		//logger.setLevel(Level.CONFIG); 
		//se envía un mensaje de trazado de nivel info
		//no aparecerá ni en consola, ni en el fichero
		logger.info("Mensaje informativo");
		
		//se envía un mensaje de trazado de nivel config
		//no aparecerá en cosola y tampoco en el fichero
		logger.config("Set CONFIG=true");
		//se envía un mensaje de trazado de nivel warning
		//aparecerá en el fichero y en consola
		logger.log(Level.WARNING,"Error no crítico");
		//el mensaje de nivel SEVERE debería aparecer en consola
		//y en el fichero log.txt
		logger.log(Level.SEVERE,"Mensaje {0}", "Algo");
						
		logger.fine("Mensaje con mucho detalle");
	}
}
