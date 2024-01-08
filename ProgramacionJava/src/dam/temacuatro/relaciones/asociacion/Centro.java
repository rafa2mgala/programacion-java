package dam.temacuatro.relaciones.asociacion;
/**
 * Centro de trabajo que tiene múltiples departamentos
 * , cada uno de ellos con una única secretaria
 * @author Rafa
 * @version 1.0
 */
public class Centro {
	private static int i;
	private SecretariaDepartamento[] secretariaDepartamento 
	= new SecretariaDepartamento[10];
	
	public static void main(String[] args) {		
		//aquí pondremos todos los casos de prueba posibles
		//1. Que se intente asignar una secretaria o departamento nulos
		//2. Que se intente asignar una secretearia ya asignada
		//3. Que se intente asignar un departamento ya asignado
		//4. Mostrar todas las asignaciones realizadas.
	}
	public void asignarSecretariaDepartamento(Secretaria secretaria,
			Departamento departamento) {
		boolean asignado=false;
		//antes de asignar habrá que comprobar si el departamento
		//que se pasa como parámetro ya tiene secretaria y si la
		//secretaria ya ha sido asignada
		this.secretariaDepartamento[i] =
				new SecretariaDepartamento(secretaria,departamento);
		//antes de asignar habrá que comprobar si la secretaria
		//que se pasa como parámetro ya tiene departamento y si el
		//departamento ya ha sido asignado
		if(asignado) {
			//agregar la nueva asignación al array
			Centro.i++;
		}
	}
}
