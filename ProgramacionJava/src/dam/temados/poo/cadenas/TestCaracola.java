package dam.temados.poo.cadenas;
/**
 * Solución propuesta para la actividad 2.4
 * @author rafa
 * @version 1.0
 */
public class TestCaracola {
	public static void main(String[] args) {
		int cantidad = 5000;
		String ultimos4Caracteres = "";
		// se crea el StringBuffer con "Hola Caracola"
		StringBuffer cadena1 = new StringBuffer("Hola Caracola");
		// se muestra
		System.out.println(cadena1);
		// se muestra capacidad
		System.out.println("Capacidad: " + cadena1.capacity());
		// se muestra longitud
		System.out.println("Longitud: " + cadena1.length());
		// se realizan replace para lograr cambiar a Hay Caracolas y mostrarla
		cadena1.replace(1, 4, "ay");
		cadena1.replace(12, 13, "s");
		System.out.println(cadena1);
		// se añade 5000 y se vuelve a mostrar
		cadena1.replace(4, 4, cantidad + " ");
		System.out.println(cadena1);
		// adjuntamos al final "en el mar" y lo volvemos a mostrar
		cadena1.append(" en el mar");
		System.out.println(cadena1);
		// guardamos los ultimos 4 caracteres
		ultimos4Caracteres += cadena1.charAt((cadena1.length() - 4));
		ultimos4Caracteres += cadena1.charAt((cadena1.length() - 3));
		ultimos4Caracteres += cadena1.charAt((cadena1.length() - 2));
		ultimos4Caracteres += cadena1.charAt((cadena1.length() - 1));
		System.out.println(ultimos4Caracteres);
		// se muestra capacidad
		System.out.println("Capacidad: " + cadena1.capacity());
		// se muestra longitud
		System.out.println("Longitud: " + cadena1.length());
	}
}
