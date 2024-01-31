package dam.temaseis.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class TestArrayList {
	private ArrayList<Empleado> empleados = new ArrayList<Empleado>();
	public static void main(String[] args) {	
		TestArrayList tal = new TestArrayList();		
		tal.empleados.add(new Empleado("Empleado1","12345678A"));
		tal.empleados.add(new Empleado("Empleado2","67345678B"));
		tal.empleados.add(new Empleado("Empleado3","67675678C"));
		Empleado empleadoEliminar = new Empleado("Empleado2","67345678B");
		tal.empleados.remove(empleadoEliminar);
		
		System.out.println();
		
	}
	public void addValue(Object ... value) {		
		//comprobar nulidad
		if(value==null) return;
		//comprobar tipo
		if(!(value instanceof Empleado[])) return;
		//tamaño
		if(value.length==0) return;			
		for(int i=0;i<value.length;i++)
			this.empleados.add((Empleado)value[i]);				
	}
}
