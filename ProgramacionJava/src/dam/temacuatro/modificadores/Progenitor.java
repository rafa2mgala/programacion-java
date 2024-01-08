package dam.temacuatro.modificadores;
/**
 * Clase de ejemplo para herencia, es la clase base
 * para la clase Humano
 * @author Rafa
 * @version 1.0
 */
public class Progenitor {
	//propiedad de clase protegida, sólo accesible
	//desde clases derivadas y desde clases del mismo
	//paquete
	protected int colorPeloDescendiente;
	/**
	 * Método que devuelve el color de pelo que debe tener
	 * un descendiente de la clase Progenitor
	 * @return Color de pelo, mediante un entero
	 */
	public int getColorPelo() {
		return this.colorPeloDescendiente;		
	}
}
