package dam.temaseis.collection.ordenacion;

import java.util.ArrayList;
import java.util.Collections;

public class TestMaxMin {

	public static void main(String[] args) {
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		ArrayList<Empleado> empleados = new ArrayList<Empleado>();
		ArrayList<Empleado> jubilados = new ArrayList<Empleado>();
		ArrayList listaObjetos = new ArrayList();
		
		listaObjetos.add(2);
		listaObjetos.add("otra cosa");
		listaObjetos.add(new Empleado("Sansome","28959848Z",55));
		
		Collections.addAll(empleados,
				new Empleado("Sansome","28959848Z",65),
				new Empleado("Hosby","24715436A",34),
				new Empleado("Concha Leco","24715433P",66));
		
		
		for(Empleado empleado:empleados) {
			if(empleado.getEdad()>=65) {
				jubilados.add(empleado);				
			}			
		}
		
		for(Empleado jubilado:jubilados) {
			empleados.remove(jubilado);
		}
		
		numeros.add(5);
		numeros.add(-3);
		numeros.add(124345);
		
		int maximo = Collections.max(numeros);
		System.out.println(maximo);
		
		Empleado empleadoNifMayor = Collections.max(empleados);
		
		System.out.println(empleadoNifMayor);
		
		Object maxObject = Collections.max(listaObjetos);
		
		System.out.println(maxObject);

	}
}
