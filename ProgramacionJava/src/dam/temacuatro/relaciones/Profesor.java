package dam.temacuatro.relaciones;

import org.eclipse.jdt.annotation.NonNull;

/**
 * Relaciones entre clases, representando cardinalidades
 * @author rafa
 * @version 1.0
 */
public class Profesor {
	//departamento al que pertenece un profesor, no puede ser nulo
	private Departamento departamento;
	//nif del profesor
	private String nif;
	/**
	 * Constructor especializado en inicializar la propiedad departamento
	 * y nif del profesor, no admite nulos. Todo profesor pertenece a 
	 * un departamento
	 * @param departamento Departamento del profesor, no nulo
	 * @param nif NIF del profesor
	 */
	public Profesor(@NonNull String nif) {
		this.nif = nif;
	}
	@Override
	public String toString() {
		return "Profesor [departamento=" + departamento + ", nif=" + nif + "]";
	}
	/**
	 * Asigna el departamento al profesor, pero sólo se puede usar
	 * este método desde clases del propio paquete
	 * @param departamento Departamento del profesor
	 */
	void setDepartamento(@NonNull Departamento departamento) {this.departamento=departamento;}
	public String getNif() {return this.nif;}
	public Departamento getDepartamento() {return this.departamento;}
}
