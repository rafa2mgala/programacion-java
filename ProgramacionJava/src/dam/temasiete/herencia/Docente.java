package dam.temasiete.herencia;

public class Docente{
	protected int codigo;
	private String dni;
	private String nombre;
	
	public Docente(String dni, String nombre) {
		this.dni = dni;
		this.nombre = nombre;
	}
	protected String getDni() {
		return dni;
	}
	protected void setDni(String dni) {
		this.dni = dni;
	}
	protected String getNombre() {
		return nombre;
	}
	protected void setNombre(String nombre) {
		this.nombre = nombre;
	}	
}
