package dam.temados.poo.estatico;
/**
 * Ejemplo de miembros estáticos e instanciables
 * @author rafa
 * @version 1.0
 */
public class Persona {
	//propiedad estática para contar el número de instancias
	//del tipo persona que se van a crear
	private static int numPersonas;
	//propiedad instanciable, sólo puedo acceder a través de una
	//instancia
	private String nombre;
	/**
	 * Constructor predeterminado, su función es incrementar
	 * una variable estática que almacena el número de instancias
	 * de Persona creadas. Todos los objetos en su creación
	 * acceden a la propiedad estática, que pertenece al tipo de datos
	 * Persona
	 */
	public Persona() {
		//acceso estático
		Persona.numPersonas++;
		//acceso instanciado
		this.nombre="";
	}
	/**
	 * Método estático que devuelve el número de instancias
	 * de personas creadas
	 * @return Un número entero que representa el número de instancias
	 * de personas creadas
	 */
	public static int getNumPersonas() {
		//se devuelve el valor de la propiedad estática
		//numPersonas mediante acceso estático
		return Persona.numPersonas;
	}
	/**
	 * Modifica el nombre de una persona
	 * @param nombre Nombre que se asiganará al objeto persona
	 */
	public void setNombre(String nombre) {
		//acceso a la propiedad nombre a través de la propia
		//instancia
		this.nombre = nombre;
	}	
}
