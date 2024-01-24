package dam.temasiete.herencia;
/**
Prueba
 */
public class Director extends Empleado {	
	public Director(String nombre, int edad,String nif, int numero) {
		super(nombre, edad,nif, numero);
	}
	protected final void setBonificacion(int bonificacion) {
		this.bonificacion = bonificacion;
	}
	@Override
	public String toString() {
		return "Director [bonificacion=" + bonificacion + "]";
	}	
	@Override
	public double getSueldo() {
		return this.getSueldo() + bonificacion;
	}
}
