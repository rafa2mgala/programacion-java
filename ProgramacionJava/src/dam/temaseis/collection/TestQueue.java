package dam.temaseis.collection;

import java.util.Iterator;
import java.util.LinkedList;
/**
 * Ejemplo de implementación de una cola sobre LinkedList
 * @author rafa
 * @version 1.0
 */
public class TestQueue {
	public static void main(String[] args) {
		Empleado empleado1 = new Empleado("Rafa","12345678A");
		Empleado empleado2 = new Empleado("Antonio","55545678A");
			
		LinkedList<Empleado> empleados = new LinkedList<Empleado>();
		//se insertan elementos en la cola (al final de la misma). 
		//El método offer() difiere de add()
		//en que el último devuelve una excepción IllegalStateException en caso
		//de que no se pueda realizar la inserción porque se supere la capacidad
		//de la cola (límite en memoria, no por programa)
		empleados.add(empleado1);
		empleados.offer(empleado2);
		
		//se obtiene el primer elemento de la cola sin eliminarlo, si la cola
		//está vacía lanza la excepción no comprobada NoSuchElementException
		Empleado primerEmpleado = empleados.element();
		System.out.println("Primer empleado de la cola (element):" + primerEmpleado);
		
		Iterator<Empleado> it = empleados.iterator();
		while(it.hasNext())
			System.out.println(it.next());
		
		//se obtiene el primer elemento de la cola sin eliminarlo, 
		//null si la cola está vacía, en dicho caso no lanza excepción
		primerEmpleado = empleados.peek();
		System.out.println("Primer empleado de la cola (peek):" + primerEmpleado);
		
		//obtiene y elimina el primer elemento de la cola,
		//también podemos usar remove(). El método poll() difiere de remove() en que
		//no lanza excepción si la cola está vacía, remove() lanza la excepción 
		//no comprobada NoSuchElementException
		primerEmpleado = empleados.poll();
		
		it = empleados.iterator();
		while(it.hasNext())
			System.out.println(it.next());
				
	}
}
