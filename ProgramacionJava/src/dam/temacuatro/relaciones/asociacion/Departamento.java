package dam.temacuatro.relaciones.asociacion;

import org.eclipse.jdt.annotation.NonNull;
/**
 * Departamento de una empresa, para relacionarlo
 * con una secretaria de una empresa
 * @author Rafa
 * @version 1.0
 */
public class Departamento {
	private String nombre;
	public Departamento(String nombre) {
		this.nombre = nombre;
	}
	@Override
	public String toString() {
		return "Departamento [nombre=" + nombre + "]";
	}
}
