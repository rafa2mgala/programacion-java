package dam.temacuatro.parametros;
/**
 * Alumno de una clase, las propiedades que se incluyen
 * son: dni, nombre, edad y aula asignada. La clase dispone
 * de métodos set y get para el establecimiento y obtención
 * del valor de las propidedades correspondientes
 * @author rafa
 * @version 1.0
 */
public class Alumno {
	private String dni;
	private String nombre;
	private int edad;
	private Aula aula;
	/**
	 * Constructor especializado en asignar el dni
	 * e inicializar el aula de un alumno
	 * @param dni Cadena de caracteres con el DNI del alumno
	 */
	public Alumno(String dni) {
		this.setDni(dni);
		this.aula = new Aula("Recepción");
	}
	public String getDni() {
		return this.dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
		dni="";
	}
	public String getNombre() {
		return this.nombre;
	}
	public void setAula(Aula aula) {
		this.aula = aula;
		aula.setIdentificador("2º DAM");
	}
	public void setEdad(int edad) {
		this.edad = edad;
		edad = 16;
		System.out.println(edad);
	}
}
