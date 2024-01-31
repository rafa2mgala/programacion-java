package dam.temaseis.arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class MiArrayList {
	public static void main(String[] args) {
		Empleado[] otrosEmpleados = new Empleado[6];
		
		ArrayList<Empleado> empleados = new ArrayList<Empleado>();		
		Director director = new Director("Mario","12345678A");
		Collections.addAll(empleados, 
				director,
				new Empleado("Rafa","87654321B"));
		
		empleados.add(null);			
		
		System.out.println(empleados.contains(director));
				
		for(Empleado e:empleados) {
			if(e==null) continue;
			System.out.println(e);			
		}
	}
}
