package dam.tematres.juego.dados;
/**
 * Clase de excepción propia para personalizar el mensaje del juego
 * de dados en caso de que los jugadores empaten a puntos
 * @see JuegoDados Programa principal que usa la excepción
 * @author rafa
 * @version 1.0
 */
public class EmpateException extends Exception{
	public EmpateException(String msg) {
		super(msg);
	}
}
