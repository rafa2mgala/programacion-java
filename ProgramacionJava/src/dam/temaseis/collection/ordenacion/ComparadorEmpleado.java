package dam.temaseis.collection.ordenacion;

import java.util.Comparator;

import org.eclipse.jdt.annotation.NonNull;
/**
 * Comparador para colecciones de empleados, se puede usar
 * para ordenar por distintas propiedades de un empleado
 * @author Rafa
 * @version 1.0
 */
public class ComparadorEmpleado implements Comparator<Empleado> {
	public static final int ORDEN_NIF=0;
	public static final int ORDEN_NOMBRE=1;
	private int campoOrdenacion;
	
	public ComparadorEmpleado(int campoOrdenacion) {
		this.campoOrdenacion = campoOrdenacion;
	}
	@Override
	public int compare(@NonNull Empleado e1, @NonNull Empleado e2) {
		if(this.campoOrdenacion==ORDEN_NIF)
			return e1.getNif().compareTo(e2.getNif());
		else if(this.campoOrdenacion==ORDEN_NOMBRE)
			return e1.getNombre().compareTo(e2.getNombre());
		return e1.getNif().compareTo(e2.getNif());
	}
}
