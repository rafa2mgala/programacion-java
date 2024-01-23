package dam.temasiete.polimorfismo;

import java.time.LocalDate;

public class Estudiante extends Persona{
	protected Estudiante(String nombre, LocalDate fechaNac) {
		super(nombre, fechaNac);		
	}

	@Override
	protected void calcEdad(LocalDate fecha) {		
		
	}
}
