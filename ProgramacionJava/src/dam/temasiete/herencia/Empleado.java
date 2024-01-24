package dam.temasiete.herencia;

public class Empleado extends Persona{
	private double sueldo; 
	protected int bonificacion;
	private int numero;
	public Empleado(String nombre, int edad,
			String nif, int numero) {
		super(nombre, edad,nif);	
		this.numero = numero;
	}
	protected void setSueldo(double sueldo) {		
		this.sueldo = sueldo;
	}
	protected double getSueldo() {
		return this.sueldo;
	}
	@Override
	public String toString() {
		return "Empleado [sueldo=" + sueldo + 
				", bonificacion=" + bonificacion + "]";
	}
	@Override
	public void setNif(String nif) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public boolean equals(Object obj) {
		//nulidad
		if(obj == null) return false;
		//identidad
		if(this==obj) return true;
		//es otro objeto de tipo Empleado pero no el mismo
		if(obj instanceof Empleado 
				&& this.numero==((Empleado)obj).numero) return true;
		//otro caso
		return false;
	}		
	
	protected String miMetodo() {
		return "Hola";
	}
	
}
