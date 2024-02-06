package dam.temaseis.actividad.seis.dos;
/**
 * Solución propuesta a la actividad 6.2
 * @author Rafa
 * @version 1.0
 */
public class Configuracion {
	public static final int OCEANO_MIN=1;
	public static final int OCEANO_MED=2;
	public static final int OCEANO_MAX=3;
	private static Configuracion config;
	private int numMaxDisparos=1000;
	private int nivelJuego=OCEANO_MIN;
	private int numBarcosMin= 1;
	private int numBarcosMed= 1;
	private int numBarcosMax= 1;
	//las siguientes propiedades tienen un valor predeterminado según
	//las especificaciones del juego. En una futura revisión
	//se podrían incluir métodos para modificar dichos valores
	//y permiter al usuario configuar líbremente el tamaño de los
	//distintos océanos y barcos.
	private int tamOceanoMin=4;
	private int tamOceanoMed=6;
	private int tamOceanoMax=8;
	private int tamBarcoMin=2;
	private int tamBarcoMed=3;
	private int tamBarcoMax=4;
	public static Configuracion getInstance(int numMaxDisparos,
			int nivelJuego, int numBarcos) {
		if(Configuracion.config==null) {
			Configuracion.config = new Configuracion();
			Configuracion.config.nivelJuego = nivelJuego;
			Configuracion.config.nivelJuego = nivelJuego;
		}
		return config;
	}
	public int getNivelJuego() {return this.nivelJuego;}
	public int getNumMaxDisparos() {return this.numMaxDisparos;}
	public int getTamBarcoMin() {return this.tamBarcoMin;}
	public int getTamBarcoMed() {return this.tamBarcoMed;}
	public int getTamBarcoMax() {return this.tamBarcoMax;}
	public int getTamOceanoMin() {return this.tamOceanoMin;}
	public int getTamOceanoMed() {return this.tamOceanoMed;}
	public int getTamOceanoMax() {return this.tamOceanoMax;}
	public int getNumBarcosMin() {return this.numBarcosMin;}
	public int getNumBarcosMed() {return this.numBarcosMed;}
	public int getNumBarcosMax() {return this.numBarcosMax;}
	public int getNumBarcos() {return this.numBarcosMin + 
			this.numBarcosMax + this.numBarcosMed;}
}
