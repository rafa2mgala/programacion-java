package dam.temaseis.collection;

public class TestEnumeracion {
	public static void main(String[] args) {		
		Enumeracion<Empleado> enumeracion = 
				new Enumeracion<Empleado>();
		enumeracion.addElement(new Empleado("12345678A","Rafa"));
		enumeracion.addElement(new Empleado("33345678A","Fátima"));
		enumeracion.addElement(new Empleado("22245678A","Alejandro"));
		enumeracion.addElement(new Empleado("11145678A","Manuel Jesús"));
		enumeracion.addElement(new Empleado("44445678A","José Carlos"));
		Empleado empleado;
		while(enumeracion.hasMoreElements()) {
			empleado = enumeracion.nextElement();
			System.out.println(empleado 
					+ ",hashcode:" + empleado.hashCode() );
		}				
	}
}
