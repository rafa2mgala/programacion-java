package dam.temacuatro.relaciones.composicion;

/**
 * Ejemplo de relación de composición entre las
 * clases Automovil y Rueda
 * La clase Automovil es final para evitar que
 * otra clase pueda heredar de Automovil y romper
 * la relación de composión respecto de rueda. Por
 * ejemplo modificar la rueda
 * @author Rafa
 * @version 1.0
 */
public final class Automovil {
	private final Rueda rueda; //composición
	//composición
	public Automovil(Rueda rueda) {
		this.rueda = rueda;
	}
	
	public void mover() {          
		System.out.println("El coche se mueve!");
	}
}
