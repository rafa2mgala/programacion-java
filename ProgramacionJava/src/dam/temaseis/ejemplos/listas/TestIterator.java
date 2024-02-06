package dam.temaseis.ejemplos.listas;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class TestIterator {
	public static void main(String[] args) {
		LinkedList<Empleado> listaEmpleados = new LinkedList<Empleado>();
		ArrayList<Empleado> arrayEmpleados = new ArrayList<Empleado>();

		arrayEmpleados = new ArrayList<Empleado>();
		//se añaden tres empleados a la lista
		arrayEmpleados.add(new Empleado("Rafa","12345678A",44));
		arrayEmpleados.add(new Empleado("Antonio","55545678A",65));
		arrayEmpleados.add(new Empleado("Lucía","44445678A",22));

		listaEmpleados = new LinkedList<Empleado>();
		//se añaden tres empleados a la lista
		listaEmpleados.add(new Empleado("Rafa","12345678A",44));
		listaEmpleados.add(new Empleado("Antonio","55545678A",65));
		listaEmpleados.add(new Empleado("Lucía","44445678A",22));

		//obtengo el iterador del array de empleados, el iterador
		//sólo se puede mover hacia adelante
		Iterator<Empleado> arrayIterator = arrayEmpleados.iterator();
		arrayEmpleados.get(arrayEmpleados.size()-1);
		//obtengo el iterador del array de empleados
		//,se mueve el apuntador al último elemento del array
		//para recorrerla en orden inverso
		ListIterator<Empleado> listIterator = arrayEmpleados.
				listIterator(arrayEmpleados.size());
		while(listIterator.hasPrevious()) {
			Empleado empleado = ((Empleado)listIterator.previous());
			System.out.println(empleado);
		}
		
		//utilizo el iterador simple para eliminar un elemento del array 
		//de empleados mientras lo recorro
		while(arrayIterator.hasNext()) {
			Empleado empleado = ((Empleado)arrayIterator.next());
			if(empleado.getEdad()>=65)
				arrayIterator.remove();					
		}

		//obtengo el iterador de la lista de empleados
		//,se mueve el apuntador al último elemento de la lista
		//para recorrerla en orden inverso
		listIterator = 
				listaEmpleados.listIterator(listaEmpleados.size());
		
		//se recorre la lista de empleados en orden inverso
		while(listIterator.hasPrevious()) {
			Empleado empleado = ((Empleado)listIterator.previous());
			System.out.println(empleado);
		}
	}

}
