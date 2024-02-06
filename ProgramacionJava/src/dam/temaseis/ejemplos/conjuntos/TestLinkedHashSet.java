package dam.temaseis.ejemplos.conjuntos;

import java.util.Iterator;
import java.util.LinkedHashSet;

import dam.temaseis.collection.Empleado;
/**
 * Ejemplo de lista enlazada que utiliza códigos hash 
 * en la información de cada nodo de la misma
 * @author rafa
 * @version 1.0
 */
public class TestLinkedHashSet {
	public static void main(String[] args) {
		LinkedHashSet <Integer> t;
		LinkedHashSet<Empleado> empleados;
		Empleado empleado1 = new Empleado("Rafa","12345678A");
		Empleado empleado2 = new Empleado("Antonio","55545678A");
		Empleado empleado3 = new Empleado("Lucía","44445678A");
		//se inicializa el LinkedHashSet de enteros
		t=new LinkedHashSet<Integer>();     
		t.add(4);
		t.add(3);
		t.add(1);
		t.add(99);
		//no se admiten valores duplicados, no se añaden, para cada
		//valor diferente se crea un código hash
		t.add(99);
		//el resultado sale ordenado según el orden de //inserción:4 3 1 99
		for (Integer i:t){
		   System.out.println(i);
		}
		
		//se inicializa el LinkedHashSet de Empleado
		empleados = new LinkedHashSet<Empleado>();
		//antes de añadir un elemento a la lista se crea el código
		//hash en el método hashCode() de la clase Empleado
		empleados.add(empleado1);
		empleados.add(empleado2);
		empleados.add(empleado3);
		Iterator<Empleado> it = empleados.iterator();
		while(it.hasNext())
			System.out.println(it.next());
	}
}
