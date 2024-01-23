package dam.temasiete.polimorfismo;

import java.time.LocalDate;

/**
 * Clase que representa al administrador de la empresa
 * , también es un empleado de la misma.
 * @author rafa
 * @version 1.0
 */
public class Administrador extends Empleado{

	public Administrador(String nombre, float salario,LocalDate fechaNac) {
		super(nombre, salario, fechaNac);		
	}

	@Override
	public void setSalario(float salario) {		
		this.salario = salario;
	}

	@Override
	protected void calcEdad(LocalDate fecha) {		
		
	}
}
