package dam.temaseis.actividad.seis.dos;

import java.util.Arrays;

import org.eclipse.jdt.annotation.NonNull;
/**
 * Solución propuesta a la actividad 6.2
 * @author Rafa
 * @version 1.0
 */
public class Flota {
	public static final int FLOTA_HUNDIDA=20;
	public static final int FLOTA_TOCADA=21;
	public static final int FLOTA_INTACTA=22;
	public static final int FLOTA_VACIA=23;
	public static final int FLOTA_INCOMPLETA=24;
	private Barco[] barcos;
	private Oceano oceano;
	private static Flota flota;
	private int numeroBarco;
	private Configuracion config;
	private Flota(Barco[] barcos, Configuracion config) {
		this.barcos = barcos;
		this.config = config;
	}
	public static Flota getInstance(@NonNull Oceano oceano,
			@NonNull Barco[] barcos, @NonNull Configuracion config) {
		int i=0;
		boolean correcta = true;
		int[] tamanios = new int[barcos.length];
		if(Flota.flota==null) {
			while(i<barcos.length) {
				tamanios[i] = barcos[i].getCoordenadas().length;
				i++;
			}
			Flota.flota = new Flota(barcos, config);
			Flota.flota.oceano = oceano;
		}
		return Flota.flota;
	}
	public boolean nuevoBarco(Barco barco) {
		int i=0,j=0, k=0;
		boolean colision = false;
		if(barco.estaIncompleto()) return false;
		while(i<this.barcos.length && !colision) {
			while(j<this.barcos[j].getCoordenadas().length && !colision) {
				while(k<barco.getCoordenadas().length && !colision) {
					if(barco.getCoordenadas()[k].equals(this.barcos[i].getCoordenadas()[j]))
						colision=true;
					k++;
				}
				j++;
			}
			i++;
		}
		if(!colision) {
			this.barcos[this.numeroBarco++] = barco;
		}else
			return colision;

		i=0;
		if(barco.getCoordenadas()[0].getCoorX()+this.oceano.getTamOceano()>this.oceano.getTamOceano() ||
				barco.getCoordenadas()[0].getCoorY()+this.oceano.getTamOceano()>this.oceano.getTamOceano())
			return false;
		return true;
	}
	public Barco[] getBarcos() {
		return this.barcos;
	}
	public int getEstadoFlota() {
		int barcos=0, i=0;
		Barco barco = new Barco(0, this.config);
		while(i<this.barcos.length) {
			if(this.barcos[i++]==null)
				i=this.barcos.length;
			barcos++;
		}
		if(barcos<this.barcos.length) return Flota.FLOTA_INCOMPLETA;
		if(this.barcos.length==0) return Flota.FLOTA_VACIA;
		barcos = Arrays.binarySearch(this.barcos, 
				barco,new ComparadorBarco(ComparadorBarco.COMPARAR_ESTADO_BARCO));
		if(barcos > 0) return Flota.FLOTA_TOCADA;
		for(Barco barcoFlota:this.barcos) {
			if(barcoFlota.getEstado() instanceof EstadoHundido)
				barcos++;
		}
		if(barcos==this.barcos.length) return Flota.FLOTA_HUNDIDA;
		return Flota.FLOTA_INTACTA;
	}
	public int hayBarco(Coordenada coordenada) {
		int i=0, j=0, k=-1;
		boolean encontrado=false;
		while(i<this.barcos.length && !encontrado) {
			while(j<this.barcos[i].getCoordenadas().length && !encontrado) {
				if(this.barcos[i].getCoordenadas()[j].equals(coordenada)) {
					k=i;
					encontrado=true;
				}
				j++;
			}
			j=0;
			i++;
		}
		return k+1;
	}
	public void setBarcos(Barco[] barcos) {
		this.barcos = barcos;
	}
	public void destruir() {
		Flota.flota.barcos = null;
		Flota.flota = null;
	}
}
