package dam.temaseis.actividad.seis.dos;

import org.eclipse.jdt.annotation.NonNull;
/**
 * Solución propuesta a la actividad 6.2
 * @author Rafa
 * @version 1.0
 */
public class EstadoTocado extends EstadoBarco {
	protected EstadoTocado(Barco barco) {
		super(barco);
	}
	@Override
	public EstadoBarco disparo(@NonNull Disparo disparo) {
		int i = 0, aciertos = 0;
		boolean acierto = false;
		barco.nuevoDisparo(disparo);		
		
		while(!acierto && i<barco.getCoordenadas().length) {
			if(barco.getCoordenadas()[i].equals(disparo.getCoordenada())) {
				acierto=true;
				disparo.setAcierto();
				
			}
			i++;
		}
		
		i=0;
		while(i<barco.getDisparos().length) {
			if(barco.getDisparos()[i].hayAcierto())
				aciertos++;
			i++;
		}
		
		if(aciertos==barco.getTamBarco()) {
			this.barco.setEstado(new EstadoHundido(this.barco));
			return this.barco.getEstado();
		}
		return barco.getEstado();
	}
}
