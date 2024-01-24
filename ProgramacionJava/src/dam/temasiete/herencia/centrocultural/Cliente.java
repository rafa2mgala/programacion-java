package dam.temasiete.herencia.centrocultural;
/**
 * Cliente para préstamo de materiales
 * @author Rafa
 * @version 1.0
 */
public class Cliente {
	private String dni;
	private String nombre;
	/**
	 * Construye objetos de tipo cliente a partir de su dni y nombre
	 * @param dni DNI del cliente
	 * @param nombre Nombre del cliente
	 */
	public Cliente(String dni, String nombre) {
		this.dni = dni;
		this.nombre = nombre;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
