package dam.temacuatro.parametros;
/**
 * Aula de un centro educativo a la que asiste el alumnado.
 * La propiedad identificativa del aula es su identificador
 * @author rafa
 * @version 1.0
 */
public class Aula {
	private String identificador;
	/**
	 * Constructor especializado en asignar el identificador
	 * del aula
	 * @param identificador Cadena de caracteres con el valor
	 * que identifica a un aula
	 */
	public Aula(String identificador) {
		this.identificador = identificador;
	}
	public String getIdentificador() {
		return identificador;
	}
	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}
}
