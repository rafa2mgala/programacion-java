package dam.temaseis.collection;

import java.util.Stack;
/**
 * Ejemplo de uso de una pila
 * @author rafa
 * @version 1.0
 */
public class TestStack {
	public static void main(String[] args) {
		Empleado empleado1 = new Empleado("Rafa","88845678A");
		Empleado empleado2 = new Empleado("Antonio","55545678A");
		Stack<Empleado> stack = new Stack<Empleado>();
		//se ponen en la pila 2 empleados, el último empleado
		//se coloca en primera posición
		stack.push(empleado1);
		stack.push(empleado2);
		//se recorre la cola, no es necesario obtener el iterador
		//de forma explícita porque la clase ya dispone de él
		//los empleados de la cola se recorren como si estuviesen
		//en una lista no en una pila
		for(Empleado e:stack)
			System.out.println(e);
		
		//se puede comprobar si la pila está vacía antes de obtener el primer elemento
		if(!stack.isEmpty()) {
			//se obtiene el primer elemento de la pila sin eliminarlo
			System.out.println("Primer empleado en la pila:" + stack.peek());
		
			//También podemos buscar un empleado en la pila
			int pos=stack.search(empleado1);
			if(pos>0)
				System.out.println("El empleado " + empleado1 + " está en la posición " + pos
						+ " de la pila");
			
			//finalmente podemos desapilar el primer elemento
			Empleado primerEmpleado = stack.pop();
			System.out.println("Se extraído de la pila al empleado: " + primerEmpleado);
			System.out.println("El estado actual de la pila es:");
			for(Empleado e:stack)
				System.out.println(e);
		}	
	}
}
