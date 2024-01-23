package dam.temasiete.polimorfismo;

import java.time.LocalDate;

/**
 * Director de la empresa, esta clase hereda de
 * Empleado. Proporciona como nueva característica
 * la bonificación del director
 * @author rafa
 * @version 1.0
 */
public class Director extends Empleado {
	private float bonificacion;
	public Director(String nombre, float salario, LocalDate fechaNac) {
		super(nombre, salario,fechaNac);		
	}
	public Director(String nombre, float salario, float bonificacion, LocalDate fechaNac) {
		this(nombre,salario,fechaNac);
		this.bonificacion = bonificacion;
	}
	public void setBonificacion(float bonificacion) {
		this.bonificacion=bonificacion;
	}
	@Override
	public void setSalario(float salario) {		
		this.salario+=this.bonificacion;
	}
	@Override
	protected void calcEdad(LocalDate fecha) {		
		System.out.println("calcEdad dentro de Director");
	}	
}
