package dam.temaseis.ejemplos.conjuntos;

import java.util.HashSet;

/**
 * Ejemplo de manejo de propiedades Hash en un HashSet
 * @author Rafa
 * @version 1.0
 */
public class TestHashSet {
	public static void main(String[] args) {
		HashSet<Empleado> empleados = new HashSet<Empleado>();

		Empleado empleado = new Empleado("Rafa","12345678A");		
		empleados.add(empleado);
		//Si definimos como público el método que modifica el NIF
		//no es coherente con el criterio de que en el conjunto
		//los objetos no pueden tener NIF duplicados
		//¿Cómo corregimos este problema?. Si hemos decidido que el NIF
		//sea único no deberíamos poder modificarlo una vez asignado
		//, por lo que el método setNif() debería ser privado o no existir
		//Una vez que se crea un objeto Empleado el NIF no se puede modificar
		//empleado.setNif("22222222B");
		empleado.setNombre("Carlos");
		
		//ahora no lo añade porque no se ha podido modificar el NIF
		empleados.add(empleado);
		
		System.out.println(empleados.size());	
		
	}
}
