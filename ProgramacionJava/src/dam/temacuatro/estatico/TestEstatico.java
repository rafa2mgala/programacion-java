package dam.temacuatro.estatico;
/**
 * Contador de instancias implementado a partir del uso de static
 * en una propiedad de la clase
 * @author rafa
 * @version 1.0
 */
public class TestEstatico {
	private static int contador;
	private String nombre;
	private int id;
	public static void main(String[] args) {
		TestEstatico te1=new TestEstatico("nombre1");
		System.out.println(te1.id);//1
		
		TestEstatico te2=new TestEstatico("nombre2");
		System.out.println(te2.id);//2
		
		TestEstatico te3=new TestEstatico("nombre3");
		System.out.println(te3.id);
		
		System.out.println("Se han creado " + TestEstatico.contador
				+ " objetos");
	}
	/**
	 * Constructor de la clase que asigna un nombre al objeto
	 * y contabiliza la instancia del mismo
	 * @param nombre Nombre del objeto
	 */
	public TestEstatico(String nombre) {
		this.nombre = nombre;
		this.id=++TestEstatico.contador;
	}
}
