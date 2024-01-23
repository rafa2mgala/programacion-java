package dam.temasiete.polimorfismo;

import java.time.LocalDate;

public abstract class Persona {
	private String nombre;
	private LocalDate fechaNac;
	
	protected abstract void calcEdad(LocalDate fecha);
	
	protected Persona(String nombre, LocalDate fechaNac) {
		this.nombre = nombre;
		this.fechaNac = fechaNac;
	}
	protected String getNombre() {
		return this.nombre;
	}
	protected interface Probable{
		
	}
	class Interna{
		
	}
}
