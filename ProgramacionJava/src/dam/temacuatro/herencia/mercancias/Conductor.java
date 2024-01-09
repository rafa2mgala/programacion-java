package dam.temacuatro.herencia.mercancias;
/**
 * Clase que represeta a un conductor de tranportes, sus propiedades principales son: el dni
 * y el sueldo base
 * @author Rafa
 * @version 1.0
 */
public class Conductor {
	private String dni;
	private float sueldoBase = 850;
	/**
	 * Constructor especializado en inicializar las propiedades dni y sueldo base
	 * @param dni Cadena de caracteres con el dni del conductor
	 * @param sueldoBase Valor numérico, con decimales, para el sueldo base del conducto
	 */
	public Conductor(String dni, float sueldoBase) {
		this.dni = dni;
		this.sueldoBase = sueldoBase;
	}

	public float getSueldoBase() {
		return sueldoBase;
	}

	public void setSueldoBase(float sueldoBase) {
		this.sueldoBase = sueldoBase;
	}

	public String getDni() {
		return dni;
	}
	
}
