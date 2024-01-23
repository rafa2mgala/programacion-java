package dam.temasiete.polimorfismo;

import java.time.LocalDate;

/**
 * Implementación y prueba de polimorfismo
 * @author rafa
 *
 */
public class TestPolimorfismo {
	public static void main(String[] args) {
		//el enlace con el método de la clase correspondiente
		//se hace en tiempo de ejecución, no de compilación
		//Empleado empleado = new Administrador("Fátima",2000, LocalDate.now());
		//empleado.setSalario(1200);
		Empleado empleado = new Director("Fátima",2000, LocalDate.now());
		empleado.calcEdad(null);
		
		
		
		
	}
}
