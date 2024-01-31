package dam.temaseis.arraylist;

import java.util.ArrayList;
import java.util.Collections;
/**
 * Ejemplo de recorrido, búsqueda y ordenación de listas con 
 * ArrayList. Se utiliza la clase Empleado como elemento de la lista
 * , la clase implementa Comparator y rescribe el método de clonación 
 * @author Rafa
 * @version 1.0
 */
public class EmpleadoDuplicado {
	public static void main(String[] args) {
		ArrayList<Empleado> empleados = new ArrayList<Empleado>();
		ArrayList<Empleado> empleadosSinDuplicar = new ArrayList<Empleado>();
		ArrayList<Empleado> empleadosDuplicados = new ArrayList<Empleado>();

		Collections.addAll(empleados,
				new Empleado("Sansome","28959848Z"),
				new Empleado("Hosby","24715436A"),
				new Empleado("Hosby","24715436a"));

		System.out.println("Lista de empleados original");
		//se muestra la lista original de empleados ordenados por NIF
		empleados.sort(empleados.get(0));
		for(Empleado e:empleados)
			System.out.println(e);

		for(Empleado e:empleados) {
			Empleado e1;
			Empleado e2;
			try {
				e1 = (Empleado)e.clone();
				e1.setNif(e1.getNif().toLowerCase());
				e2 = (Empleado)e.clone();
				e2.setNif(e2.getNif().toUpperCase());
				//se guardan los originales duplicados
				if(empleados.contains(e1) && empleados.contains(e2)) {
					if(!(empleadosDuplicados.contains(e1) ||
							empleadosDuplicados.contains(e2)))
						empleadosDuplicados.add(e);					
				}else
					//se guardan los empleados sin duplicar con el nif original
					empleadosSinDuplicar.add(e);
			} catch (CloneNotSupportedException e3) {
				e3.printStackTrace();
			}						
		}
		
		System.out.println("Lista de empleados con NIF no duplicado");
		//se muestra la lista de empleados sin duplicar ordenados por NIF
		empleadosSinDuplicar.sort(empleadosSinDuplicar.get(0));
		for(Empleado e:empleadosSinDuplicar)
			System.out.println(e);

		System.out.println("Lista de empleados con NIF duplicado");
		//se muestra la lista de empleados duplicados ordenados por NIF
		empleadosDuplicados.sort(empleadosDuplicados.get(0));
		for(Empleado e:empleadosDuplicados)
			System.out.println(e);
		
		//se eliminan los empleados con nif duplicado
		empleados.removeAll(empleadosDuplicados);

		System.out.println("Lista de empleados original sin duplicados");
		//se muestra la lista original de empleados ordenados por NIF sin duplicados
		empleados.sort(empleados.get(0));
		for(Empleado e:empleados) {
			//se modifica el NIF para que la letra aparezca en mayúsculas
			//, por cada elemento de la lista los cambios que se hacen quedan permanentes
			//, ya que se guardan en la misma por referencia
			e.setNif(e.getNif().toUpperCase());
			System.out.println(e);
		}
		System.out.println();
	}
}
