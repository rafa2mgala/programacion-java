package dam.temaseis.ejemplos.listas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

import org.eclipse.jdt.annotation.NonNull;

/**
 * Solución propuesta para la actividad 6.3.1
 * @author rafa
 * @version 1.0
 */
public class TestListaEmpleado {
	private ArrayList<Empleado> empleados;
	public static void main(String[] args) {
		TestListaEmpleado tle = new TestListaEmpleado();
		tle.empleados = new ArrayList<Empleado>();
		//se añaden tres empleados a la lista
		tle.nuevoEmpleado("Rafa","12345678A",44);
		tle.nuevoEmpleado("Antonio","55545678A",23);
		tle.nuevoEmpleado("Lucía","44445678A",22);
		
		//pedir en un menú el campo de ordenación y recogerlo
		//según la constante correspondiente
		tle.ordenarLista(Empleado.ORDENAR_EDAD, Empleado.ORDEN_DESC);
		for(Empleado e:tle.empleados) {
			System.out.println(e);		
		}
		
		//pedir en un menú el nif del empleado a buscar
		Empleado empleado = tle.buscarEmpleado("55545678A");
		if(empleado!=null)
			System.out.println("Encontrado:" + empleado);
		
		//pedir en un menú el nif del empleado a eliminar
		empleado = tle.eliminarEmpleado("55545678A");
		if(empleado!=null)
			System.out.println("Eliminado:" + empleado);
	}
	/**
	 * Busca a un empleado por su nif
	 * @param nif NIF del empleado
	 * @return Empleado encontrado o null si no lo encuentra
	 */
	public Empleado buscarEmpleado(String nif) {
		Empleado empleado = new Empleado("",nif,0);
		if(empleados.contains(empleado))
			return empleados.get(empleados.indexOf(empleado));
		return null;
	}
	/**
	 * Elimina a un empleado de la lista por su nif
	 * @param nif NIF del empleado
	 * @return Empleado eliminado o null si no lo encuentra
	 */
	public Empleado eliminarEmpleado(String nif) {
		Empleado empleado = new Empleado("",nif,0);
		int pos = empleados.indexOf(empleado);
		if(pos<0) return null;
		return this.empleados.remove(pos);
	}
	/**
	 * Añade un nuevo empleado
	 * @param nif NIF del empleado
	 * @param nombre Nombre del empleado
	 * @param edad Edad del empleado
	 */
	public void nuevoEmpleado(String nif, String nombre, int edad) {
		this.empleados.add(new Empleado(nif,nombre,edad));
	}
	/**
	 * Ordena la lista de empleados por el campo de ordeanación indicado
	 * @param ordenacion Campo de ordenación
	 */
	public void ordenarLista(int ordenacion, int sentido) {
		Empleado.ordenacion=ordenacion;
		Empleado.sentidoOrdenacion = sentido;
		Collections.sort(this.empleados,this.empleados.get(0));
	}
	public void nuevoEmpleado(@NonNull Empleado empleado) {
		boolean encontrado = false;
		Empleado empleadoAnterior=null;
		this.ordenarLista(Empleado.ORDENAR_EDAD, Empleado.ORDEN_ASC);
		Iterator<Empleado> iterator = this.empleados.iterator();
		while(!encontrado && iterator.hasNext()) {
			empleadoAnterior = (Empleado)iterator.next();
			if(empleado.getEdad()<=empleadoAnterior.getEdad()) {
				empleados.add(empleados.indexOf(empleadoAnterior),empleado);
				encontrado=true;
			}	
		}
	}
	public void eliminarEmpleadoMayor() {
		this.ordenarLista(Empleado.ORDENAR_EDAD,Empleado.ORDEN_ASC);
		Empleado empleadoEliminar = 
				(Empleado)Collections.max(this.empleados, this.empleados.get(0));
		this.empleados.remove(empleadoEliminar);
	}
}
