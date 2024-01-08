package dam.temacuatro.modificadores;
/**
 * Ejemplo de clase ámbito público que tiene varias
 * propiedades de ámbito público y estáticas, constantes,
 * con los posibles colores de pelo.
 * Tambien tiene tres propiedades más: nombre, color de pelo
 * y altura
 * @author usuario
 * @version 1.0
 */
public class Humano extends Progenitor{
	public static final int RUBIO=0;
	public static final int MORENO=1;
	public static final int CASTANIO=2;
	private String nombre;
	private int colorPelo;
	public int altura;
	/**
	 * Constructor privado, sólo accesible desde la propia
	 * clase. Está especializado en construir objetos
	 * de la clase Humanano gestionando el color de pelo
	 * de los mismos
	 * @param colorPelo Color del pelo, valor predefinido
	 * por las constantes RUBIO, MORENO Y CASTANIO
	 */
	private Humano(int colorPelo) {
		//obtengo el color del pelo y la altura
		//de sus progenitores
		if(colorPelo!=RUBIO && colorPelo!=MORENO && colorPelo!=CASTANIO)
			this.colorPelo = super.getColorPelo();

		this.colorPelo = colorPelo;
	}
	/**
	 * Constructor público, especializado en gestionar la altura
	 * de un humano. Se usa escalada de constructores para establecer
	 * el color de pelo
	 * @param colorPelo Color del pelo, valor predefinido
	 * por las constantes RUBIO, MORENO Y CASTANIO
	 * @param altura Altura en centímetros
	 */
	public Humano(int colorPelo, int altura) {
		this(colorPelo);		
		this.altura = altura;
	}
	/**
	 * Constructor público, especializado en gestionar el nombre
	 * de un humano. Se usa escalada de constructores para establecer
	 * el color de pelo y la altura
	 * @param colorPelo Color del pelo, valor predefinido
	 * por las constantes RUBIO, MORENO Y CASTANIO
	 * @param altura Altura en centímetros
	 * @param nombre Nombre del humano, si el valor no viene dado
	 * en mayúsculas se modifica dentro del constructor
	 */
	public Humano(int colorPelo, int altura, String nombre) {
		this(colorPelo,altura);	
		//gestión del nombre de un humano
		if(nombre.equals(nombre.toLowerCase()))
			this.nombre= nombre.toUpperCase(); 
	}
	String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getColorPelo() {
		return colorPelo;
	}
	public void setColorPelo(int colorPelo) {
		this.colorPelo = colorPelo;
	}	
}