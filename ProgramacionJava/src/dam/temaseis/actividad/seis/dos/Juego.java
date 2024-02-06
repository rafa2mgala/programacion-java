package dam.temaseis.actividad.seis.dos;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
/**
 * Solución propuesta a la actividad 6.2
 * @author Rafa
 * @version 1.0
 */
public class Juego {
	private final int CREAR_FLOTA_MAN=1;
	private final int CREAR_FLOTA_AUT=2;
	private final int SELEC_TAM_OCEANO=3;
	private final int CONFIGURAR_JUEGO=4;
	private final int MOSTRAR_BARCOS=5;
	private final int JUGAR=6;
	private final int SALIR=7;
	private Oceano oceano;
	private Flota flota;
	private Barco[] barcos;
	private Configuracion config;
	private Scanner sc;
	public static void main(String[] args) {
		Juego juego = new Juego();
		//los valores 100, OCEANO_MED y 3 de la llamada al método iniciarJuego
		//podrían pedirse por consola, se corresponden con el número
		//máximo de disparos, el tamaño del oceano y el número máximo de barcos. 
		juego.config = Configuracion.getInstance(100, Configuracion.OCEANO_MED, 3);
		juego.oceano = Oceano.getInstance(Configuracion.OCEANO_MED, juego.config);
		juego.sc = new Scanner(System.in);
		juego.menuJuego();
	}
	public void jugar() {
		Arrays.sort(this.flota.getBarcos());

		this.menuDisparos();
	}
	private void menuJuego() {
		int opcion = 0;
		System.out.println("Comienza el juego!!");
		System.out.println("El tamaño del océano por defecto es 4x4");
		while(opcion!=SALIR) {
			System.out.println("1. Crear la flota de barcos manualmente");
			System.out.println("2. Crear la flota de barcos automáticamente***");
			System.out.println("3. Seleccionar el tamaño del océano");
			System.out.println("4. Configurar el juego***");
			System.out.println("5. Mostrar barcos");
			System.out.println("6. Jugar");
			System.out.println("7. Salir");
			opcion = sc.nextInt();
			switch(opcion) {
			case CREAR_FLOTA_MAN:
				this.menuCrearBarcos();
				break;
			case CREAR_FLOTA_AUT:
				System.out.println("Disponible en la versión de pago, pulse 0!");
				sc.next();
				break;
			case SELEC_TAM_OCEANO:
				this.menuOceano();
				break;
			case CONFIGURAR_JUEGO:
				System.out.println("Disponible en la versión de pago, pulse 0!");
				sc.next();
				break;
			case MOSTRAR_BARCOS:
				if(this.flota!=null && this.flota.getEstadoFlota()==Flota.FLOTA_INTACTA)
					this.mostrarBarcos();
				else
					System.out.println("La flota no está definida");
				break;
			case JUGAR:
				if(this.flota!=null && this.flota.getEstadoFlota()==Flota.FLOTA_VACIA) {
					System.out.println("No hay barcos en la flota, pulse 0");
					sc.next();
					continue;
				}
				this.jugar();
				break;
			case SALIR:
				this.sc.close();
				break;
			}
			try {
				Runtime.getRuntime().exec("clear");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	private void menuCrearBarcos() {
		int i = 0, j=0, t = 0,coorX=0, coorY=0, tamBarco=0, numCoordenada=0, numCoordenadas=0;
		//coordenadas predeterminadas
		Coordenada[] coordenadas;
		Coordenada coordenada;

		//habrá que tener tantas coordenadas como barcos se puedan crear
		numCoordenadas = this.config.getNumBarcosMax()*
				this.config.getTamBarcoMax() + 
				this.config.getNumBarcosMed()*
				this.config.getTamBarcoMed() +
				this.config.getNumBarcosMin()*
				this.config.getTamBarcoMin();
		coordenadas = new Coordenada[numCoordenadas];
		for(int k=0;k<numCoordenadas;k++) {
			coordenadas[k] = new Coordenada(-1,-1);
		}
		System.out.println("Introduzca las coordenadas de los " +
				this.config.getNumBarcos() + " barcos");
		barcos = new Barco[this.config.getNumBarcos()];

		int[] tamBarcos = new int[3];
		while(i<this.config.getNumBarcos()) {
			j=0;
			System.out.println("Tamaño del barco: " + 
					this.config.getTamBarcoMin() + ", " + this.config.getTamBarcoMed()
					+ ", " + this.config.getTamBarcoMax());
			tamBarco = sc.nextInt();
			if(tamBarco<this.config.getTamBarcoMin() || tamBarco>this.config.getTamBarcoMax()) {
				System.out.println("El tamaño indicado no es correcto");
				continue;
			}
			if(Arrays.binarySearch(tamBarcos, tamBarco)>-1) {
				System.out.println("El tamaño indicado ya ha sido definido");
				continue;
			}

			//por fin se puede crear el barco
			barcos[i] = new Barco(tamBarco,this.config);
			while(j<tamBarco) {
				System.out.println("Introduzca las coordenadas " + (j+1) +
						" del barco " + (i+1));
				System.out.print("X"+(j+1)+"=");
				coorX = sc.nextInt();
				System.out.print("Y"+(j+1)+"=");
				coorY = sc.nextInt();
				if(coorX<0 || coorY<0 || 
						coorX>(this.oceano.getTamOceano()-tamBarco) || 
						coorY>(this.oceano.getTamOceano()-tamBarco)) {
					System.out.println("Coordenadas incorrectas, vuelva a intentarlo");
					continue;
				}
				coordenada = new Coordenada(coorX,coorY);
				if(Arrays.binarySearch(coordenadas, coordenada)>-1) {
					System.out.println("Las coordenadas ya han sido introducidas");
					continue;
				}
				barcos[i].setCoordenadas(coordenada);
				coordenadas[numCoordenada++] = coordenada;
				System.out.println();
				j++;
			}
			System.out.println("Barco " + (i+1) + " creado correctamente");
			System.out.println((i+1) + " " + this.barcos[i]);
			System.out.println("Pulse 0 para continuar");
			this.sc.next();
			Arrays.sort(coordenadas);
			i++;
		}
		this.flota = Flota.getInstance(this.oceano,this.barcos, this.config);
		try {
			Runtime.getRuntime().exec("clear");
		} catch (IOException e) {			
			e.printStackTrace();
		}
	}
	private void menuOceano() {
		boolean noDefinido = true;
		int opcion = 0;
		while(noDefinido) {
			System.out.println("Seleccione el tamaño del océano");
			System.out.println("1. " + this.config.getTamOceanoMin() + 
					" X " + this.config.getTamOceanoMin());
			System.out.println("2. " + this.config.getTamOceanoMed() + 
					" X " + this.config.getTamOceanoMed());
			System.out.println("3. " + this.config.getTamOceanoMax() + 
					" X " + this.config.getTamOceanoMax());
			opcion = sc.nextInt();
			switch(opcion) {
			case Configuracion.OCEANO_MIN:
				this.oceano = Oceano.getInstance(this.config.getTamOceanoMin(), 
						this.config);
				noDefinido=false;
				break;
			case Configuracion.OCEANO_MED:
				this.oceano = Oceano.getInstance(this.config.getTamOceanoMed(), 
						this.config);
				noDefinido=false;
				break;
			case Configuracion.OCEANO_MAX:
				this.oceano = Oceano.getInstance(this.config.getTamOceanoMax(), 
						this.config);
				noDefinido=false;
				break;
			default:
				System.out.println("El tamaño seleccionado no es correcto!, pulse 0");
				sc.next();
				break;
			}
		}
	}
	private void menuDisparos() {
		Disparo disparoBarco;
		Coordenada[] coordenadas;
		int i=0, disparos=0, coorX=0, coorY=0;
		
		while(this.flota.getEstadoFlota()!=Flota.FLOTA_HUNDIDA
				&& disparos<this.config.getNumMaxDisparos()) {
			System.out.println("Introduce las coordenadas del disparo " +
					(disparos+1));
			System.out.print("X" + disparos+1 + ":");
			coorX = sc.nextInt();
			System.out.print("Y" + disparos+1 + ":");
			coorY = sc.nextInt();
			
			while(i<this.flota.getBarcos().length) {
				disparoBarco = new Disparo(new Coordenada(coorX,coorY));

				this.flota.getBarcos()[i].nuevoDisparo(disparoBarco);

				this.flota.getBarcos()[i].getEstado().disparo(disparoBarco);

				//se muestra el resultado del disparo
				if(this.flota.getBarcos()[i].getEstado() instanceof EstadoTocado &&
						disparoBarco.hayAcierto()) {
					System.out.println("El barco con tamaño " + 
							this.flota.getBarcos()[i].getTamBarco() + " ha sido tocado!!!");
					System.out.println("Pulse 0 para continuar");
					break;
				}else if(this.flota.getBarcos()[i].getEstado() instanceof EstadoHundido &&
						disparoBarco.hayAcierto()) {
					System.out.println("Bien!!! El barco con tamaño " + 
							this.flota.getBarcos()[i].getTamBarco() + " ha sido hundido!!!");
					System.out.println("Sus coordenadas eran:");
					coordenadas = this.flota.getBarcos()[i].getCoordenadas();
					for(int j=0;j<coordenadas.length;j++) {
						System.out.println(coordenadas[j]);
					}
					System.out.println("Pulse 0 para continuar");
					break;
				}
				i++;	
			}
			i=0;
			disparos++;
			if(i==this.flota.getBarcos().length)
				System.out.println("Aguaaa!!! Pulse 0 para continuar");
			sc.next();
			try {
				Runtime.getRuntime().exec("clear");
			} catch (IOException e) {			
				e.printStackTrace();
			}
		}
	}
	private void mostrarBarcos() {
		Coordenada coordenada;
		int barco;
		System.out.println("Los barcos actualmente en la flota son:");
		for(int i=0;i<this.oceano.getTamOceano();i++) {
			for(int j=0;j<this.oceano.getTamOceano();j++) {
				coordenada = new Coordenada(j,i);
				barco = this.flota.hayBarco(coordenada);
				if(barco>0) {
					System.out.print("b" + barco + "\t");
				}else {
					System.out.print("~\t");
				}
			}
			System.out.println();
		}
		System.out.println("Pulse 0 para continuar");
		this.sc.next();
	}
}
