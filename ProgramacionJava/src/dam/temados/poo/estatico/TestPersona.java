package dam.temados.poo.estatico;

public class TestPersona {
	public static void main(String[] args) {
		//se crean dos objetos de tipo Persona
		Persona persona1 = new Persona();
		Persona persona2 = new Persona();
		//se obtiene el número de personas creadas a partir
		//de un método estático de Persona
		System.out.println(Persona.getNumPersonas());
	}
}
