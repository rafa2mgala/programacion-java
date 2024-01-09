package dam.temacuatro.herencia.mercancias;
/**
 * Clase que representa a un transporte genérico, sus propiedades principales son el precio hora
 * y la matrícula del transporte
 * @author Rafa
 * @version 1.0
 */
public class Transporte {
	private String matricula;
	private int horas;
	private float precioHora=5;
	protected float precioTransporte;
	
	public Transporte(String matricula,int horas) {
		this.matricula = matricula;
		this.horas = horas;
		this.setPrecioTransporte();
	}
	public float getPrecioHora() {
		return precioHora;
	}
	public void setPrecioHora(float precioHora) {
		this.precioHora = precioHora;
		this.setPrecioTransporte();
	}
	public int getHoras() {
		return horas;
	}
	public void setHoras(int horas) {
		this.horas = horas;
		this.setPrecioTransporte();
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public float getPrecioTransporte() {
		return precioTransporte;
	}
	public void setPrecioTransporte() {
		this.precioTransporte=this.precioHora*this.horas;
	}
	@Override
	public String toString() {
		return "Transporte [matricula=" + matricula + ", horas=" + horas + ", precioHora=" + precioHora
				+ ", precioTransporte=" + precioTransporte + "]";
	}
}
