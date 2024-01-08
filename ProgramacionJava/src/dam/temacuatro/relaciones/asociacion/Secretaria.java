package dam.temacuatro.relaciones.asociacion;

import org.eclipse.jdt.annotation.NonNull;
/**
 * Secretaria de un departamento de una empresa
 * @author Rafa
 * @version 1.0
 */
public class Secretaria {
	private String nombre;
	public Secretaria(String nombre) {
		this.nombre = nombre;
	}
	@Override
	public String toString() {
		return "Secretaria [nombre=" + nombre + "]";
	}
}
