package dam.temacuatro.herencia.mercancias;
/**
 * Clase que representa a un transporte de mercancías, sus propiedades principales son el peso
 * y el precio por peso.
 * Esta clase deriva de la clase Transporte, la especializa en un transporte de 
 * merecancias.
 * @author Rafa
 * @version 1.0
 */
public class TransporteMercancia extends Transporte{
	private int peso;
	private int precioPeso=2;
	/**
	 * Constructor especializado en inicializar el peso de un transporte de mercancias.
	 * @param peso
	 */
	public TransporteMercancia(String matricula,int horas,int peso) {
		super(matricula, horas);
		this.setPeso(peso);
	}
	public int getPeso() {
		return peso;
	}	
	/**
	 * Modifica el peso del trasnporte y reacalcula el precio hora a partir del mismo
	 * @param peso
	 */
	public void setPeso(int peso) {
		this.peso = peso;
		super.precioTransporte+=this.precioPeso*peso;
	}
	public int getPrecioPeso() {
		return precioPeso;
	}
	public void setPrecioPeso(int precioPeso) {
		this.precioPeso = precioPeso;
	}
}
