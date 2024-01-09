package dam.temacuatro.herencia.mercancias;
/**
 * Clase que representa a un desplazamiento de un conductor en un transporte
 * @author Rafa
 * @version 1.0
 */
public class Desplazamiento {
	private Conductor conductor;
	private Transporte transporte;
	/**
	 * Constructor especializado en inicializar un desplazamiento a partir de el conductor
	 * y transporte utilizado
	 * @param conductor
	 * @param transporte
	 */
	public Desplazamiento(Conductor conductor, Transporte transporte) {
		this.conductor = conductor;
		this.transporte = transporte;
	}
	@Override
	public String toString() {
		return "Desplazamiento [conductor=" + this.conductor + "], " + this.transporte;
	}
}
