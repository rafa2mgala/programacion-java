package dam.temaseis.actividad.seis.dos;

import java.util.Comparator;
import org.eclipse.jdt.annotation.NonNull;
/**
 * Solución propuesta a la actividad 6.2
 * @author Rafa
 * @version 1.0
 */
public class Disparo implements Comparator<Disparo>, Comparable<Disparo>{
	private double distancia;
	private boolean acierto;
	private Coordenada coordenada;
	public Disparo(@NonNull Coordenada coordenada) {
		this.coordenada = coordenada;
	}
	/**
	 * Calcula la distancia de un disparo desde las coordenadas 0,0
	 * esquina superior izquierda del océano
	 */
	private void calcularDistancia() {
		this.distancia = Math.sqrt((Math.pow(this.coordenada.getCoorX(), 2))
				+ Math.pow(this.coordenada.getCoorY(), 2));
	}
	public Coordenada getCoordenada() {return this.coordenada;}
	public double getDistancia() {return this.distancia;}
	public boolean hayAcierto() {return this.acierto;}
	public void setAcierto() {this.acierto = true;}
	@Override
	public int compare(Disparo arg0, Disparo arg1) {
		return arg0.getCoordenada().compareTo(arg1.getCoordenada());
	}
	@Override
	public int compareTo(Disparo arg0) {
		return compare(this,arg0);
	}
}
