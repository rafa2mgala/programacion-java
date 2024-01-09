package dam.temacuatro.herencia.mercancias;
/**
 * Clase que representa a un transporte de mercancias peligrosas, las propiedades principales son 
 * el número de transportes y el precio por transporte
 * @author Rafa
 * @version 1.0
 *
 */
public class TransporteMercanciaPeligrosa extends TransporteMercancia {
	private int numeroTransportes;
	private int precioPorTransporte=50;
	/**
	 * Constructor especializado en inicializar las propiedades de peso y número de
	 * transportes
	 * @param peso Valor numérico (int) que indica el peso del transporte
	 * @param numeroTransportes Valor numérico (int) que indica el número de tranportes
	 */
	public TransporteMercanciaPeligrosa(String matricula, int horas,int peso, int numeroTransportes) {
		super(matricula,horas,peso);
		super.precioTransporte+=this.numeroTransportes*this.precioPorTransporte;
	}
	public int getNumeroTransportes() {
		return numeroTransportes;
	}
	public void setNumeroTransportes(int numeroTransportes) {
		this.numeroTransportes = numeroTransportes;
	}
	public int getPrecioPorTransporte() {
		return precioPorTransporte;
	}
	public void setPrecioPorTransporte(int precioPorTransporte) {
		this.precioPorTransporte = precioPorTransporte;
	}
}
