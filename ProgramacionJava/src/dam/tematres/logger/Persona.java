package dam.tematres.logger;
/**
 * Persona, individuo de la especie humana
 * @author rafa
 * @version 1.0
 */
public class Persona {
	private String nombre;
	private byte edad;
	private String domicilio;
	
	public Persona(String nombre, byte edad, String domicilio) {
		this.nombre = nombre;
		this.edad = edad;
		this.domicilio = domicilio;
	}
		
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" 
	+ edad + ", domicilio=" + domicilio + "]";
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public byte getEdad() {
		return edad;
	}
	public void setEdad(byte edad) {
		this.edad = edad;
	}
	public String getDomicilio() {
		return domicilio;
	}
	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}
}
