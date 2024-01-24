package dam.temasiete.herencia.banco;

import java.util.Objects;

public class Titular {
	private String dni;
	private String nombre;
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Titular other = (Titular) obj;
		return Objects.equals(dni, other.dni);
	}	
}
