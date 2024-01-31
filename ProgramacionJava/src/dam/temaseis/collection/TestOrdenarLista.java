package dam.temaseis.collection;

import java.util.LinkedList;

public class TestOrdenarLista {

	public static void main(String[] args) {
		Empleado empleado1 = new Empleado("Rafa","12345678A");
		Empleado empleado2 = new Empleado("Antonio","55545678A");
		
		LinkedList<Empleado> list= new LinkedList<Empleado>();
		list.add(empleado2);
		list.add(empleado1);
		
		list.sort(empleado1);
		for(Empleado e:list) {
			System.out.println(e);
		}
	}

}
