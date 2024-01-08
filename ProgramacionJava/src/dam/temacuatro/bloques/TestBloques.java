package dam.temacuatro.bloques;

/**
 * Clase para probar la prioridad en la ejecución: bloques estáticos
 * ,bloques instanciables y constructor.
 * @author rafa
 * @version 1.0
 *
 */
public class TestBloques {
	private static String texto="";
	private String titulo="";
	//bloque de inicialización estática, lo primero que se ejecuta
	static {
		texto = "Valor inicial";
	}
	//bloque de inicialización instanciable, lo segundo en ejecución
	{
		this.titulo="Título inicial";
	}
	public static void main(String[] args) {
		System.out.println(TestBloques.texto);
	}
	/**
	 * Constructor predeterminado, tercero en ejecución
	 */
	public TestBloques() {
		System.out.println(this.titulo);	
	}
}
