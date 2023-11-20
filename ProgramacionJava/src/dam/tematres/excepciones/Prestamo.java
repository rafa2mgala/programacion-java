package dam.tematres.excepciones;
/**
 * Ejemplo de pre-condiciones y post-condiciones. Programación
 * preventiva para evitar excepciones
 * @author rafa
 * @version 1.0
 */
public class Prestamo {
	private float cantidad;
	public Prestamo(float cantidad) {
		this.cantidad = cantidad;
	}
	public float getCantidadPrestamo() {
		return this.cantidad;
	}
}
