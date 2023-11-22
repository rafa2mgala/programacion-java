package dam.tematres.logger;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Ejemplo de pruebas de depuración con Logger
 * @author rafa
 * @version 1.0
 */
public class TestLogger {

	public static void main(String[] args) {
		//se inicializa el trazador
		Logger logger = Logger.getLogger(TestLogger.class.getName());
	
		Persona persona1 = new Persona("Antonio",
				(byte)20,"calle el suspiro verde s/n");
		
		Persona persona2 = new Persona("María",
				(byte)2,"calle el suspiro rojo s/n");
		//array de personas
		Persona personas[] = new Persona[2];
		personas[0] = persona1;
		personas[1] = persona2;
		
		logger.info("Trazando la información de estado de un objeto"
				+ " de personas: 1º) {0} \n 2º {1}");
		
		//trazado con nivel INFO usando la información de estadod de los objetos del array de personas
		logger.log(Level.INFO, "Trazando la información de estado de un objeto"
				+ " de personas: 1º) {0} \n 2º {1}",personas);
	}
}
