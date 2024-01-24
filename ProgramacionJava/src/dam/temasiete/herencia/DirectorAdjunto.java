package dam.temasiete.herencia;

public class DirectorAdjunto extends Empleado {

	public DirectorAdjunto(String nombre, int edad, String nif, int numero) {
		super(nombre, edad, nif, numero);		
	}

	@Override
	protected String miMetodo() {		
		return super.miMetodo() +  " Holi!";
	}	
}
