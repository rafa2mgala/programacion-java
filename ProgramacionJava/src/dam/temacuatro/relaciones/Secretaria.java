package dam.temacuatro.relaciones;

import org.eclipse.jdt.annotation.NonNull;

/**
 * Control de cardinalidad mínima en una relación 1 a 1 y control
 * para evitar que una secretaría tiene ya asociado el departamento que se pasa
 * como parámetro
 * @author rafa
 * @version 1.0
 */
public class Secretaria {
	private String telefono;
	private Departamento departamento;
	private static Secretaria[] secretarias= new Secretaria[10];
	private Secretaria() {}
	public static Secretaria createSecretaria(String telefono,@NonNull Departamento departamento) {
		boolean asignado = false;
		int i=0;
		while(i<secretarias.length) {
			if(secretarias[i].departamento!=null &&
					secretarias[i].departamento==departamento)
				asignado=true;
			i++;
		}
		if(!asignado) {
			Secretaria secretaria = new Secretaria();
			secretaria.telefono = telefono;
			secretaria.departamento = departamento;
			secretarias[i] = secretaria;
			return secretaria;
		}
		return null;
	}
}
