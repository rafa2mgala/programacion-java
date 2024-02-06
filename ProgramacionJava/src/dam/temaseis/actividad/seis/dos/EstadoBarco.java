package dam.temaseis.actividad.seis.dos;

import org.eclipse.jdt.annotation.NonNull;
/**
 * Solución propuesta a la actividad 6.2
 * @author Rafa
 * @version 1.0
 */
public abstract class EstadoBarco {
	protected Barco barco;
	public abstract EstadoBarco disparo(@NonNull Disparo disparo);
	protected EstadoBarco(Barco barco) {
		this.barco = barco;
	}
}
