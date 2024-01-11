package dam.temacuatro.interfaces;

import java.util.Arrays;
/**
 * Ejemplos de uso de interfaces no propias, comparar y ordenar
 * elementos con Comparable. Ejemplo de reescritura de equals()
 * heredado de Object
 * @author rafa
 * @version 1.0
 *
 */
public class TestEmpresa {

	public static void main(String[] args) {
		/*Empleado[] empleados = new Empleado[3];
		empleados[0]=new Empleado("12345678A");
		empleados[1]=new Empleado("87654321D");
		empleados[2]=new Empleado("12345678A");*/

		Empleado[] empleados = {
				new Empleado("12345678A"),
				new Empleado("87654321D"),
				new Empleado("02345678C")};
		//se ordena el array de empleados
		Arrays.sort(empleados);
		
		for(Empleado empleado:empleados) {
			System.out.println(empleado.getNif());
		}
	}
}
