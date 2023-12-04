package dam.tematres.juego.dados;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Random;
import java.util.Scanner;
import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 * Solución propuesta a la actividad 3.26
 * Esta clase incluye pruebas de excepcioines propias, trazadores y manejadores. 
 * El manejador de fichero registra los datos correspondientes a cada tirada, el 
 * manejador de consolo muestra en consola un mensaje cuando los jugadores empatan
 * o cuando uno gana.
 * @see EmpateException Excepción propia para ser lanzada en caso de que los jugadores empaten a puntos
 * @author rafa
 * @version 1.0
 */
public class JuegoDados {
	public static final int MAXIMA_PUNTUACION=6;
	public static final int MINIMA_PUNTUACION=1;
	public static final long MIN_RETARDO_TIRADA=2000000;
	public static final long MAX_RETARDO_TIRADA=4000001;
	
	public static void main(String[] args) {
		//se inicializa el trazador
		Logger logger = Logger.getLogger(JuegoDados.class.getName());
		ConsoleHandler consoleHandler = new ConsoleHandler();
		FileHandler fileHandler;
		Random rnd = new Random();
		Scanner sc = new Scanner (System.in);
		int ganador,perdedor;
		LocalDateTime instanteJugadaUno, instanteJugadaDos;
		int[] puntuacionJugador = new int[2];
		String mensajeGanador;
		String[] nombresJugadores = new String[2];
		
		try {
			//se inicializan los manejadores, de fichero y de consola, y se añaden al trazador
			fileHandler = new FileHandler("juego-dado.log",5000,1);
			//se inactiva el manejador de consola por defecto
			logger.setUseParentHandlers(false);
			//se configura el nivel SEVERO para el manejador de consola
			consoleHandler.setLevel(Level.SEVERE);
			//se configura el nivel INFO para el manejador de fichero
			fileHandler.setLevel(Level.INFO);
			//se añaden los manejadores al trazador
			logger.addHandler(fileHandler);
			logger.addHandler(consoleHandler);
		} catch (SecurityException | IOException e) {
			e.printStackTrace();
		}
		//comienza el juego
		System.out.println("Introduce el nombre del primer jugador:");
		nombresJugadores[0]= sc.next();
		System.out.println("Introduce el nombre del segundo jugador:");
		nombresJugadores[1] = sc.next();
		do {
			try {
				//se registra el instante de inicio de la tirada del primer jugador
				instanteJugadaUno = LocalDateTime.now();
				System.out.println("Tira los dados el jugador (1): " + nombresJugadores[0]);
				//se simula un retraso aleatorio para la tirada entre 2 y 4 segundos
				while((LocalDateTime.now().getNano()-instanteJugadaUno.getNano())<rnd.nextLong(MIN_RETARDO_TIRADA, MAX_RETARDO_TIRADA));
				//se genera y guarda la puntuación obtenida
				puntuacionJugador[0] = rnd.nextInt(MINIMA_PUNTUACION, MAXIMA_PUNTUACION);
				//se registra en el fichero los datos de la tirada
				logger.warning("Jugador: " + nombresJugadores[0] + 
						", instante: " + instanteJugadaUno.toString() + 
						", puntuación: " + puntuacionJugador[0] + 
						", duración jugada: " + ChronoUnit.MILLIS.between(instanteJugadaUno, LocalDateTime.now()) +
						" milisegundos");
				System.out.println("El jugador (1) obtiene " + puntuacionJugador[0]);
				
				//se registra el instante de inicio de la tirada del segundo jugador
				instanteJugadaDos = LocalDateTime.now();
				System.out.println("Tira los dados el jugador (2): " + nombresJugadores[1]);
				//se simula un retraso aleatorio para la tirada entre 2 y 4 segundos
				while((LocalDateTime.now().getNano()-instanteJugadaDos.getNano())<rnd.nextLong(MIN_RETARDO_TIRADA, MAX_RETARDO_TIRADA));
				//se genera y guarda la puntuación obtenida
				puntuacionJugador[1] = rnd.nextInt(MINIMA_PUNTUACION, MAXIMA_PUNTUACION);
				logger.warning("Jugador: " + nombresJugadores[1] + 
						", instante: " + instanteJugadaUno.toString() + 
						", puntuación: " + puntuacionJugador[1] + 
						", duración jugada: " + ChronoUnit.MILLIS.between(instanteJugadaUno, LocalDateTime.now()) + 
						" milisegundos");
				System.out.println("El jugador (2) obtiene " + puntuacionJugador[1]);
				
				//se comprueba el empate para lanzar la excepción
				if(puntuacionJugador[0]==puntuacionJugador[1])
					throw new EmpateException("Se ha producido un empate, ambos jugadores han obtenido" +
							puntuacionJugador[0] + " puntos");
			}catch(EmpateException e) {
				logger.severe(e.getLocalizedMessage());
			}

		}while(puntuacionJugador[0]==puntuacionJugador[1]);
		
		//se evalua quíen ha sido el ganador
		ganador = puntuacionJugador[0]>puntuacionJugador[1]?0:1;
		perdedor = Math.abs(ganador-1);
		//se prepara el mensaje que se mostrará en consola sobre información del ganador
		mensajeGanador = "Ha ganado " + nombresJugadores[ganador] + " ha obtenido " + puntuacionJugador[ganador] +
				" puntos, el jugador " + nombresJugadores[perdedor] + " ha perdido, ha obtenido " + puntuacionJugador[perdedor] + " puntos";
		//se envía al manejador de consola el mensaje del ganador
		logger.severe(mensajeGanador);

		sc.close();
	}
}
