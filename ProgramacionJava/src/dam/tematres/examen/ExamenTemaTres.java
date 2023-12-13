package dam.tematres.examen;

import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 * Solución propuesta al examen del tema 3. Se trata de un programa con un menú de opciones para
 * calcular el coste de un viaje en bus, los números primos entre 1 y un número dado y activar
 * la depuración de código en todas las opciones del menú, incluída la de salir. Cuando el programa
 * finaliza se muestra la opción del menú más elegida y se devuelve el código numérico
 * de la opción del menú más elegida al SO
 * @author rafa
 * @version 1.0
 */
public class ExamenTemaTres {
	private static final int VIAJE_BUS = 1;
	private static final String OPCION_BUS="Viajes en bus";
	private static final int PRIMOS = 2;
	private static final String OPCION_PRIMOS="Números primos";
	private static final int DEPURACION = 3;
	private static final String OPCION_DEPURACION="Depuración";
	private static final int SALIR = 4;
	private static final String OPCION_SALIR="Salir del programa";

	public static void main(String[] args) {
		//trazador de mensajes de depuración
		Logger logger = Logger.getLogger("ExamenTemaTres");
		//se desactiva el manejador de consola por defectode trazador
		logger.setUseParentHandlers(false);
		//se inicializa a null el manejador de fichero, después se le asiganará una nueva instancia
		FileHandler fileHandler=null;
		Scanner sc = new Scanner(System.in);
		//esta variable servirá para controlar la activación o desactivación de la depuración
		boolean depurar = false;
		//la primera variable se usa para recoger la opción de menú seleccionada por el usuario
		//, las tres siguientes para contar las veces que se elige cada opción de menú
		int opcion = 0, contadorOpcionBus=0, contadorOpcionPrimos=0, contadorOpcionDepuracion=0;
		do {
			//se muestra en consola el menú de opciones
			System.out.println("Seleccione una opción:");
			System.out.println("1:Viajar en bus");
			System.out.println("2:Números primos");
			System.out.println("3:" + ((depurar)?"Descativar depuración":"Activar depuración"));
			System.out.println("4:Salir");
			//se recoge la opción elegida por el usuario
			opcion = sc.nextInt();
			switch(opcion) {
			case VIAJE_BUS:
				//constantes para fijar el precio base del billete de bus, la distancia del trayecto 200km
				//y la distancia del trayecto 400km
				final double PRECIO_BASE=20;
				final int TRAYECTO_NORMAL=200;
				final int TRAYECTO_INTERMEDIO=400;
				//la variable distancia se usa para recoger la distancia introducida por el usuario
				//la variable personas para recoger el número de personas que viajan
				int distancia=0, personas=1;
				//la variable descuento para acumular los distintos descuentos que se produzcan
				//la variable precioBillete almacena el precio final del billete
				double descuento=0, precioBillete=PRECIO_BASE;
				System.out.println("¿Cuántas personas viajan?");
				personas = sc.nextInt();
				//si viajan más de 2 personas se acumula un 10% de descuento
				if(personas>2) descuento+=0.1;
				System.out.println("Introduzca distancia del trayecto:");
				distancia = sc.nextInt();
				//si la distancia es mayor que 200km y menor a 400km se calcula el precio del bille
				//con un incremento de 3cts/km 
				if(distancia>TRAYECTO_NORMAL && distancia<TRAYECTO_INTERMEDIO) {
					precioBillete = precioBillete + (distancia-TRAYECTO_NORMAL)*0.03;
				}else if(distancia>=TRAYECTO_INTERMEDIO){
					//si la distancia es superior a los 400km se acumula un descuento de 15%
					descuento+=0.15;
					precioBillete = precioBillete - (precioBillete*descuento);
				}
				System.out.println("El precio de cada billete es " + precioBillete + "€");
				System.out.println("El precio total a pagar es de " + precioBillete*personas + "€");
				System.out.println("Pulse INTRO para continuar");
				sc.nextLine();
				System.out.println();
				//se incrementa el contador de la opción bus
				contadorOpcionBus++;
				//se comprueba si está activa la depuración, en cuyo caso se guarda en el fichero de
				//depuración el mensaje correspondiente
				if(depurar)
					logger.severe(LocalDateTime.now() + "->" + OPCION_BUS + ", elegida " 
							+ contadorOpcionBus + " veces");
				break;
			case PRIMOS:
				//la variable número se usa para recoger el número introducido por el usuario
				//, totalPrimos para contar el número de primos encontrados, divisor es una 
				//variable donde se ira guardando cada divisor candidato y divisores
				//almacena el número de divisores encontrados
				int numero = 0, totalPrimos=0, divisor=1, divisores=0;
				//se comprueba que le número introducido esté entre 1 y 500
				do {
					System.out.println("Introduzca un número entre 1 y 500");
					numero = sc.nextInt();
					sc.nextLine();
				}while(numero<1 || numero>500);
				System.out.println("Los números primos encontrados son:");
				//se calculan los números primos existentes entre 1 y el número indicado por el usuario
				for(int i=1;i<=numero;i++) {
					do {
						//se cuentan los divisores
						if(i%divisor==0) divisores++;
						//se calcula el siguiente divisor candidato
						divisor++;
					}while(divisores<3 && divisor<=i);
					//si el número de divisores es menor a 3, el número es primo
					if(divisores<3)
					{
						//se muestre el número primo
						System.out.print(i + "  ");
						//se incrementa el contador de números primos
						totalPrimos++;
					}
					//se asigna el valor 1 a la variable divisor por ser el primer divisor candidato 
					//de cualquier número
					divisor=1;
					//se pone a 0 el contador de divisores
					divisores=0;
				}
				System.out.println();
				System.out.print("Un total de " + totalPrimos + " números primos. Pulse INTRO para continuar");
				sc.nextLine();
				System.out.println();
				//se incrementa el contador de la opción PRIMOS
				contadorOpcionPrimos++;
				//se comprueba si está activa la depuración, en cuyo caso se guarda en el fichero de
				//depuración el mensaje correspondiente
				if(depurar)
					logger.severe(LocalDateTime.now() + "->" + OPCION_PRIMOS + ", elegida " + contadorOpcionPrimos + " veces");
				break;
			case DEPURACION:
				//se conmuta el valor de la variable depurar para pasar de
				//activado a desactivado, o viceversa
				depurar = !depurar;
				//si la depuración está activa se asigna una nueva instancia del manejador de fichero
				//y se añade al trazador
				if(depurar) {
					//se captura la excepción comprobada lanzada por el constructor de FileHandler
					try {
						fileHandler = new FileHandler("logs.txt",5000,1);
						fileHandler.setLevel(Level.SEVERE);
						logger.addHandler(fileHandler);
					} catch (SecurityException | IOException e) {
						e.printStackTrace();
					}
				}else {
					logger.removeHandler(fileHandler);
				}
				//se incrementa el contador de la opción de activación de depuración
				contadorOpcionDepuracion++;
				//se comprueba si está activa la depuración, en cuyo caso se guarda en el fichero de
				//depuración el mensaje correspondiente
				if(depurar)
					logger.severe(LocalDateTime.now() + "->" + OPCION_DEPURACION + ", elegida " + contadorOpcionDepuracion + " veces");
				break;
			}

		}while(opcion!=SALIR);
		sc.close();
		//se comprueba si está activa la depuración, en cuyo caso se guarda en el fichero de
		//depuración el mensaje correspondiente
		if(depurar)
			logger.severe(LocalDateTime.now() + "->" + OPCION_SALIR);
		
		System.out.println("Resumen de opciones elegidas: " + OPCION_BUS + "=" + contadorOpcionBus +
				"," + OPCION_PRIMOS + "=" + contadorOpcionPrimos + "," + OPCION_DEPURACION + "=" + contadorOpcionDepuracion);
		//se muestra la opción de menú más elegida y se devuelve al SO el código numérico de la opción más elegida
		if(contadorOpcionBus>contadorOpcionPrimos && contadorOpcionBus>contadorOpcionDepuracion) {
			System.out.print("La opción más elegida ha sido " + OPCION_BUS);
			System.exit(VIAJE_BUS);
		}else if(contadorOpcionPrimos>contadorOpcionBus && contadorOpcionPrimos>contadorOpcionDepuracion) {
			System.out.print("La opción más elegida ha sido " + OPCION_PRIMOS);
			System.exit(PRIMOS);
		}else if(contadorOpcionDepuracion>contadorOpcionBus && contadorOpcionDepuracion>contadorOpcionPrimos){
			System.out.print("La opción más elegida ha sido " + OPCION_DEPURACION);
			System.exit(DEPURACION);
		}
		System.exit(0);
	}
}
