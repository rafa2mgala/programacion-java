package dam.temauno.variables;
/**
 * Identificadores de variables
 * Propuestas de solución para las actividades 1.2 y 1.3
 * @author rafa
 * @version 1.0
 *
 */
public class Identificadores {

	public static void main(String[] args) {
		//Propuesta de solución para la actividad 1.2
		//---------------------------------------------------------------------------------
		//El número de calles de una ciudad. = Simple (numérico)
		//La distancia entre dos planetas. = Simple (numérico)
		//El río más largo del mundo. = Simple (cadena de caracteres)
		//El número de puertas de un edificio. = Simple (numérico)
		//El estado de una puerta (abierta o cerrada). = Simple (boolean)
		//El número de patas de una araña. = Simple (numérico)
		//La tercera letra del alfabeto griego. = Simple (char)
		//El color de un semáforo (rojo, amarillo o verde). = Simple (cadena de caracteres o numérico)
		//La dirección de una casa. = Compuesto (calle (cadena de caracteres), número 
		//(numérico), letra (carácter))


		//Propuesta de solución para la actividad 1.3
		//---------------------------------------------------------------------------------
		String apellido2; //correcto
		String APELLIDO DOS; //incorrecto, tiene espacio
		String 2Apellido; //incorrecto, empieza por número
		String APELLIDO_; //correcto
		String APELLIDO*; //incorrecto, * operador Java
		String 222; //incorrecto, todo números
		String _222; //correcto
		String *222; //incorrecto *
		String ENTERO; //correcto
		String entero; //correcto
		String entero_2;//correcto
		String "nombre"; //incorrecto, literal de tipo cadena
		String verdadero; //correcto
		String __falso;//correcto
		String 2.2; //incorrecto, empieza por número
		String CiUdAd; //correcto
		String país; //correcto
		String PI.PI; //incorrecto, tiene punto
		String PI*PI; //incorrecto, tiene operador *
		String PI_PI; //correcto
		String ¿QUIEN?; //incorrecto, empieza por ?
		String _???; //incorrecto, caracteres ? no permitidos
		String NO; //correcto
		String SÍ; //correcto
		String z; //correcto
		String e; //correcto
		String _; //incorrecto porque se usa en las expresiones lambda a partir de Java 9
	}
}
