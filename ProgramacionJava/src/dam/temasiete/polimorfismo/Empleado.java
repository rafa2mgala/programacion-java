package dam.temasiete.polimorfismo;

import java.time.LocalDate;

/**
 * Clase abstracta que se usará para implementar
 * el concepto de polimorfismo, con el método
 * setSalario()
 * @author rafa
 * @version 1.0
 */
public abstract class Empleado extends Persona {
	private String nombre;
	protected float salario;
	public abstract void setSalario(float salario);
	
	
	
	@Override
	protected void calcEdad(LocalDate fecha) {	
		System.out.println("calcEdad dentro de Empleado");
	}


	public Empleado(String nombre, float salario, LocalDate fechaNac) {
		super(nombre,fechaNac);
		this.nombre = nombre;
		this.salario = salario;
	}	
}
