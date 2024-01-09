package dam.temacuatro.herencia;

public class Empleado extends Persona {
	private float salario;
	private String nif;
	public Empleado(String nombre, String nif) {
		super.setNombre(nombre);
		this.nif = nif;
	}
	/**
	 * Establece el salario base del empleado
	 * @param salario Importe con el salario base
	 */
	public void setSalario(float salario) {
		this.salario = salario;
	}	
	public float getSalario() {
		return salario;
	}
	public String getNif() {
		return this.nif;
	}
	@Override
	protected void setNombre(String nombre) {
		// TODO Esbozo de método generado automáticamente
		super.setNombre(nombre);
	}		
}
