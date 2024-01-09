package dam.temacuatro.herencia;

public class Director extends Empleado{
	private int bonif;
	public Director(String nombre,int bonif, String nif) {
		super(nombre, nif);
		this.bonif = bonif;
	}
	/**
	 * Método heredado de Empleado. La clase Director incorpora
	 * una especificación propia. Los directores de la empresa
	 * pueden incrementar su salario a partir de la bonificación
	 * asignada
	 * @param Importe con el salario base
	 */
	@Override
	public void setSalario(float salario) {		
		super.setSalario(salario + (salario * (1+this.bonif/100)));
	}	
}
