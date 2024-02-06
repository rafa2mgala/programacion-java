package dam.temaseis.actividad.seis.dos;

import java.util.Arrays;

import org.eclipse.jdt.annotation.NonNull;
/**
 * Solución propuesta a la actividad 6.2
 * @author Rafa
 * @version 1.0
 */
public class EstadoNoTocado extends EstadoBarco {
	protected EstadoNoTocado(Barco barco) {
		super(barco);
	}

	@Override
	public EstadoBarco disparo(@NonNull Disparo disparo) {
		//si alguna de las coordenadas del barco coinciden cola del 
		//disparo el barco pasará al estado tocado
		int resultado = Arrays.binarySearch(barco.getCoordenadas(), disparo.getCoordenada());
		if(resultado>-1) {
			disparo.setAcierto();
			this.barco.setEstado(new EstadoTocado(this.barco)); 
			return this.barco.getEstado();
		}
		barco.nuevoDisparo(disparo);
		return this;
	}
}
