package dam.temacuatro.interfaces;

public class TestEmpleado {

	public static void main(String[] args) {		
		Empleado empleado = new Empleado("aaa","12345678A");
		TestEmpleado te = new TestEmpleado();
		//de manera automática se llamará al primer método
		//probarInterfaces porque la clase del objeto
		//que hemos pasado como parámetro no implementa
		//la interfaz Comparable
		te.probarInterfaces(empleado);
	}
	public void probarInterfaces(Empleado empleado) {
		Empleado empleado2 = new Empleado("aaa","12345678A");
		//no puedo llamar con seguridad al método compareTo
		//porque nada asegura que la clase empleado
		//lo tenga
		int resultado = empleado.compareTo(empleado2);
		System.out.println(resultado);
	}
	public void probarInterfaces(Comparable empleado) {
		Empleado empleado2 = new Empleado("aaa","12345678A");
		//puedo llamar al método compareTo porque el objeto
		//que se pasa como parémtro debe implementar la interfaz
		//Comparable
		int resultado = empleado.compareTo(empleado2);
		System.out.println(resultado);
	}
}
