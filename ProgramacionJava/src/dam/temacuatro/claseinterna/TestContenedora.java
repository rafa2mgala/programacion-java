package dam.temacuatro.claseinterna;
/**
 * Ejemplos de uso de clases internas
 * @author rafa
 * @version 1.0
 */
public class TestContenedora {
	public static void main(String[] args) {		
		Contenedora contenedora = new Contenedora(13);
		/*Contenedora.InternaMiembro interna = contenedora.new InternaMiembro(-30);		
		// destruimos la referencia de la contenedora
		contenedora = null;
		interna.printInterna(); // i=13 j=-30
		contenedora = new Contenedora(14);
		//sigue manteniendo el valor de i tras destruir la instancia de la clase contenedora
		interna.printInterna(); // i=13 j=-30
		//acceso a un método estático de la clase interna estática
		Contenedora.EstaticaInterna.inicio(10);*/
		
		contenedora.testInternaAnonima("C++");
		
	}
}
