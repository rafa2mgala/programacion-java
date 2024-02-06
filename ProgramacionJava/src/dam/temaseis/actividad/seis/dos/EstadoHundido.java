package dam.temaseis.actividad.seis.dos;

import org.eclipse.jdt.annotation.NonNull;
/**
 * Solución propuesta a la actividad 6.2
 * @author Rafa
 * @version 1.0
 */
public class EstadoHundido extends EstadoBarco {
	protected EstadoHundido(Barco barco) {
		super(barco);
	}

	@Override
	public EstadoBarco disparo(@NonNull Disparo disparo) {		
		barco.nuevoDisparo(disparo);
		return barco.getEstado();
	}
}
