package dam.temaseis.collection;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class TestCompartir {

	public static void main(String[] args) { 
		Empleado empleado1 = new Empleado("Rafa","12345678A");
		Empleado empleado2 = new Empleado("Antonio","55545678A");
		CompartirEmpleado ce1 = new CompartirEmpleado(empleado1);
		CompartirEmpleado ce2 = new CompartirEmpleado(empleado2);
		ce1.setNombre("Manuel");
		ce2.setNombre("Fátima");
		LinkedList<Empleado> list= new LinkedList<Empleado>();
		list.add(empleado2);
		list.add(empleado1);
		
		list.sort(empleado1);
		for(Empleado e:list) {
			System.out.println(e);
		}
	}

}
