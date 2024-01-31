package dam.temaseis.collection.ordenacion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Ejemplo de ordenación de listas usando sort de Collections, con
 * y sin comparador específico
 * @author Rafa
 * @version 1.0
 */
public class TestListaOrdenada {
	private ArrayList<Empleado> empleados = new ArrayList<Empleado>();
	public static void main(String[] args) {		
		TestListaOrdenada tlo = new TestListaOrdenada();
		Collections.addAll(tlo.empleados,
				new Empleado("Sansome","28959848Z",33),
				new Empleado("Hosby","24715436A",34),
				new Empleado("Concha Leco","24715433P",23));
		
		System.out.println("Ordenar los empleados ascendentemente por NIF");
		System.out.println("---------------------------------------------");		
		tlo.ordenar();		
		for(Empleado e:tlo.empleados) {		
			System.out.println(e);
		}
		
		//ordenar por un campo específico
		System.out.println("\nOrdenar los empleados ascendentemente por un campo específico");
		System.out.println("---------------------------------------------");
		tlo.ordenar(new ComparadorEmpleado(ComparadorEmpleado.ORDEN_NOMBRE));		
		for(Empleado e:tlo.empleados) {
			System.out.println(e);
		}
	}
	public void ordenar() {
		//ordenación utilizando el comparador de los objetos
		//que contiene la lista
		Collections.sort(this.empleados);		
	}
	public void ordenar(Comparator<Empleado> comparator) {
		//ordenación utilizando un comparador específico,
		//los objeto de la lista
		Collections.sort((List)empleados, comparator);
	}
}