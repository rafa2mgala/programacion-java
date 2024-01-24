package dam.temasiete.actividad.siete.seis;
/**
 * Supervisor de los trabajos de los distintos empleados
 * Todos los empleados tendrán un supervisor, no todos
 * los empleados serán supervisores.
 * @author Rafa
 * @version 1.0
 */
public class Supervisor extends Empleado implements Supervisable {
	/**
	 * Constructor específico para crear un supervisor
	 * con sus datos de empleado. Lo convierte en supervisor
	 * el hecho de tener valor null en la propiedad supervisor
	 * que tiene como Empleado
	 * @param nombre Nombre del supervisor
	 * @param apellidos Apellidos del supervisor
	 * @param direccion Dirección del supervisor
	 * @param dni DNI del supervisor
	 * @param telefono Número de teléfono
	 * @param salario Salario en euros
	 */
	public Supervisor(String nombre, String apellidos, 
			String direccion, String dni, int telefono, 
			double salario) {
		super(nombre, apellidos, direccion, dni, telefono, salario, null);
	}

	@Override
	public void supervisar(Empleado empleado) {
		//aquí iría el proceso de supervisión
		//no definido en el problema
	}

	@Override
	public String imprimir() {
		return "\nTipo empleado: Supervisor" + super.toString();
	}
}
