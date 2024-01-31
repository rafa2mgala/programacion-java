package dam.temaseis.collection;

public class CompartirEmpleado {
	private Empleado empleado;
	public CompartirEmpleado(Empleado empleado) {
		this.empleado = empleado;
	}
	public void setNombre(String nombre) {
		this.empleado.setNombre(nombre);
	}
}
