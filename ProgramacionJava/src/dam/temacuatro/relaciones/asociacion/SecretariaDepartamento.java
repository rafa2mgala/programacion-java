package dam.temacuatro.relaciones.asociacion;

import org.eclipse.jdt.annotation.NonNull;
/**
 * Representa la relacion entre un departamento
 * y su secretaria, sólo una secretaria
 * @author Rafa
 * @version 1.0
 */
public class SecretariaDepartamento {
	private Secretaria secretaria;
	private Departamento departamento;
	public SecretariaDepartamento(Secretaria secretaria,
			Departamento departamento) {
		this.secretaria = secretaria;
		this.departamento = departamento;
		this.setSecretaria(secretaria);
		this.setDepartamento(departamento);
	}
	public void setSecretaria(@NonNull Secretaria secretaria) {
		this.secretaria = secretaria;
	}
	public Secretaria getSecretaria() {
		return secretaria;
	}
	public void setDepartamento(@NonNull Departamento departamento) {
		this.departamento = departamento;
	}
	public Departamento getDepartamento() {
		return departamento;
	}
}
