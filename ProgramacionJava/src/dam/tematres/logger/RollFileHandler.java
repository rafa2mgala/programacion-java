package dam.tematres.logger;

import java.io.IOException;
import java.time.LocalDateTime;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
/**
 * Ejemplo de trazador con manejador de fichero rotativo
 * Crea un nuevo fichero a partir del tamaño máximo establecido (aproximado)
 * Máximo 10 ficheros
 * @author rafa
 * @version 1.0
 * @see <a href="https://docs.oracle.com/javase/8/docs/api/java/util/logging/FileHandler.html">FileHandler</a>
 */
public class RollFileHandler {

	public static void main(String[] args) {
		//se inicializa el trazador
		Logger logger = 
				Logger.getLogger(RollFileHandler.class.getName());
		//se deshabilita el manejador de consola predeterminado
		logger.setUseParentHandlers(false);
		//se declara una variable para el manejador de 
		//tipo fichero 
		FileHandler fileHandler;

		try {
			//se instancia el manejador del trazador de 
			//tipo fichero
			fileHandler = new FileHandler("%hlogs%g.log", 300, 10);	
			//se cambia el formato del fichero, de XML a texto
			fileHandler.setFormatter(new SimpleFormatter());
			//se establece el nivel del manejador de fichero a
			//INFO 
			fileHandler.setLevel(Level.INFO);
			//se añade el nuevo manejador de fichero
			logger.addHandler(fileHandler); 
			for(int i=0;i<10;i++) {
				if(i%2==0)
					logger.warning(LocalDateTime.now() + " Mensaje par " + i);
				else
					logger.log(Level.INFO,LocalDateTime.now() + " Mensaje impar " + i);
			}
			//se cierra el flujo de fichero del manejador
			fileHandler.close();
		} catch (SecurityException | IOException e) {
			e.printStackTrace();
		}
	}

}
