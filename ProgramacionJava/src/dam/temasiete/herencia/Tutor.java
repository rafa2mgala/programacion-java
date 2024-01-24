package dam.temasiete.herencia;
/**
 * Ejemplo en el que la clase Tutor, que necesita
 * obtener el código como docente se ve obligada
 * a derivar de la clase Docente
 * @author usuario
 *
 */
public class Tutor extends Docente {
	public Tutor() {		
		super("12345678A","Nombre");
		
	}
	public int getCodigo() {
		return this.codigo;
	}
}
