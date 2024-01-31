package dam.temaseis.collection;

import java.util.Iterator;
import java.util.LinkedList;
/**
 * Ejemplo de iterador sobre una lista símplemente enlazada.
 * Se elimina un elemento de la lista mientras se está recorriendo
 * @author rafa
 * @version 1.0
 */
public class TestIterator {
	public static void main(String[] args) {
		Empleado empleado1 = new Empleado("Rafa","12345678A");
		Empleado empleado2 = new Empleado("Antonio","55545678A");
		Empleado empleado3 = new Empleado("Lucía","44445678A");
		
		LinkedList<Empleado> empleados = new LinkedList<Empleado>();
		
		empleados.add(empleado1);
		empleados.add(empleado2);		
		
		//se obtiene el iterador de la lista
		Iterator<Empleado> it = empleados.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
			//si existe el empleado3 se elimina mientras se está recorriendo la lista
			if(empleados.indexOf(empleado3)>-1)
				empleados.remove(empleado3);
		}
	}
}
