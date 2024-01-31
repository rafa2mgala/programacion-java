package dam.temaseis.arraylist;

public class Director extends Empleado {
    
	public Director(String nombre, String nif) {
		super(nombre, nif);
	}

	@Override
	public String toString() {
		return "Director: " + super.toString();
	}
}
