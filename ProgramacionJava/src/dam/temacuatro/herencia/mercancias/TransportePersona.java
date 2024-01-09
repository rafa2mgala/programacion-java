package dam.temacuatro.herencia.mercancias;
/**
 * Clase que representa a un transporte de personas, las propiedades principales son el número 
 * de personas y el precio del transporte por persona. Esta clase deriva de Transporte 
 * y lo especializa en un transporte para
 * personas
 * @author Rafa
 * @version 1.0
 */
public class TransportePersona extends Transporte{
	private int numeroPersonas;
	private int precioPersona=1;
	public TransportePersona(String matricula,int horas, int numeroPersonas) {
		super(matricula, horas);
		this.setNumeroPersonas(numeroPersonas);
	}
	public int getNumeroPersonas() {
		return numeroPersonas;
	}
	public void setNumeroPersonas(int numeroPersonas) {
		this.numeroPersonas = numeroPersonas;
		super.precioTransporte += (this.numeroPersonas>9)?this.precioPersona*this.numeroPersonas:
			this.numeroPersonas/2;
	}
	public int getPrecioPersona() {
		return precioPersona;
	}
	public void setPrecioPersona(int precioPersona) {
		this.precioPersona = precioPersona;
	}
}
