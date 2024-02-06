package dam.temaseis.actividad.seis.dos;
/**
 * Solución propuesta a la actividad 6.2
 * @author Rafa
 * @version 1.0
 */
public class Oceano {
	private int tamanio;
	private static Oceano oceano;
	private Configuracion config;
	private Oceano(int tamanio, Configuracion config) {
		this.tamanio = tamanio;
		this.config = config;
	}
	public static Oceano getInstance(int tamanio, Configuracion config) {
		if(tamanio<Configuracion.OCEANO_MIN || tamanio>Configuracion.OCEANO_MAX) return null;
		
		Oceano.oceano = new Oceano(tamanio, config);
		
		return Oceano.oceano;
	}
	public int getTamOceano() {return this.tamanio;}
	public void destruir() {Oceano.oceano = null;}
}
