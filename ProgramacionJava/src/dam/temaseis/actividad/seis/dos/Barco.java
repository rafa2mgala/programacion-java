package dam.temaseis.actividad.seis.dos;

import java.util.Arrays;
import java.util.Comparator;
/**
 * Solución propuesta a la actividad 6.2
 * @author Rafa
 * @version 1.0
 */
public class Barco implements Comparator<Barco>, Comparable<Barco>{
	public static final int BARCO_TOCADO=2;
	public static final int BARCO_NO_TOCADO=1;
	public static final int BARCO_HUNDIDO=3;
	private Disparo[] disparos;
	private Coordenada[] coordenadas;
	private EstadoBarco estado;
	private int numeroDisparo;
	private int tamanio;
	private int ultimaCoordenada;
	private boolean barcoIncompleto;
	private Configuracion config;
	public Barco(int tamanio, Configuracion config) {
		this.coordenadas = new Coordenada[tamanio];
		this.estado = new EstadoNoTocado(this);
		this.tamanio = tamanio;
		this.config = config;
		this.disparos = new Disparo[this.config.getNumMaxDisparos()];
		for(int i=0;i<this.config.getNumMaxDisparos();i++) {
			this.disparos[i] = new Disparo(new Coordenada(-1,-1));
		}
	}
	public boolean setCoordenadas(Coordenada coordenada) {
		boolean coordenadaErronea = false;
		if(this.coordenadas[this.ultimaCoordenada]==null) {
			this.coordenadas[this.ultimaCoordenada++]=coordenada;
		}else if(this.coordenadas[this.ultimaCoordenada]!=null) {
			coordenadaErronea = true;
		}
		this.barcoIncompleto = this.ultimaCoordenada<this.tamanio-1;
		return coordenadaErronea;
	}
	public EstadoBarco getEstado() {
		return this.estado;
	}
	public void setEstado(EstadoBarco estadoBarco) {
		this.estado = estadoBarco;
	}
	public Coordenada[] getCoordenadas() {
		return this.coordenadas;
	}
	public Disparo[] getDisparos() {
		return this.disparos;
	}
	public void nuevoDisparo(Disparo disparo) {		
		Arrays.sort(this.disparos);
		if(Arrays.binarySearch(this.disparos, disparo)<0)
			this.disparos[numeroDisparo++] = disparo;
	}
	public boolean estaIncompleto() {return this.barcoIncompleto;}
	public int getNumeroDisparo() {return this.numeroDisparo;}
	public int getTamBarco() {return this.tamanio;}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Barco other = (Barco) obj;
		return Arrays.equals(coordenadas, other.coordenadas);
	}
	@Override
	public int compare(Barco barcoUno, Barco barcoDos) {
		if(((Barco)barcoUno).getCoordenadas().length>((Barco)barcoDos).getCoordenadas().length) return 1;
		if(((Barco)barcoDos).getCoordenadas().length>((Barco)barcoUno).getCoordenadas().length) return -1;
		return 0;
	}
	@Override
	public int compareTo(Barco barcoDos) {
		return this.compare(this, barcoDos);
	}
	@Override
	public String toString() {
		return "Barco [tamanio=" + tamanio + ", coordenadas=" + Arrays.toString(coordenadas) +
				 "]";
	}
}
