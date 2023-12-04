package dam.temados.examen;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;
import java.util.Scanner;
import java.util.StringJoiner;
import java.util.StringTokenizer;
/**
 * Soluciones propuestas al examen práctico del tema 2
 * 17-11-2023
 */
public class SolucionExamenTemaDos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LocalDate localDate,cumpleAnios;
		final int MES_CUMPLE=10;
		final int DIA_CUMPLE=10;
		String fecha;
		long diasFinAnio;
			
		//Pregunta 1
		System.out.println("Pregunta 1 -----------------------------------------------------------");
		System.out.println("Introduce una fecha (yyyy-MM-dd):");
		fecha = sc.next();
		localDate = LocalDate.parse(fecha);
		
	    //Nombre del mes de la fecha
		System.out.println(localDate.getMonth().name());
	    //Nombre del día, dos semanas y un día, después de la fecha
		System.out.println(localDate.plusWeeks(2).plusDays(1).getDayOfWeek());
	    //Nombre del último día del año de la fecha
		System.out.println(LocalDate.of(localDate.getYear(), 12, 31).getDayOfWeek());
	    //Número de días para finalizar el año desde la fecha
		diasFinAnio=ChronoUnit.DAYS.between(localDate, LocalDate.of(localDate.getYear(), 12, 31));
		System.out.println(diasFinAnio);
		
		//Pregunta 5
		System.out.println("\nPregunta 5 -----------------------------------------------------------");
		//Fecha del siguiente domingo a partir de la fecha actual
		System.out.println(localDate.with(TemporalAdjusters.nextOrSame(DayOfWeek.SUNDAY)));
		//Fecha del segundo viernes del mes de diciembre
		System.out.println(localDate.of(localDate.getYear(), 12, 1).plusWeeks(1).with(TemporalAdjusters.nextOrSame(DayOfWeek.FRIDAY)));
		//Nombre del día de la semana de mi siguiente cumpleaños
		cumpleAnios = (localDate.getMonth().getValue()>MES_CUMPLE?
				LocalDate.of(localDate.getYear()+1, MES_CUMPLE, DIA_CUMPLE):
			LocalDate.of(localDate.getYear(), MES_CUMPLE, DIA_CUMPLE));
		System.out.println(cumpleAnios.getDayOfWeek().name());
		
		//Pregunta 2
		System.out.println("\nPregunta 2 -----------------------------------------------------------");
	    //Símbolo separador de ficheros y carpetas en el sistema (Por ejemplo, en Windows es \)
		System.out.println(System.getProperty("file.separator"));
	    //Directorio de instalación de Java
		System.out.println(System.getProperty("java.home"));
	    //Versión de la máquina virtual
		System.out.println(System.getProperty("java.version"));
	    //Rutas donde se almacenan los ficheros .class en el sistema
		System.out.println(System.getProperty("java.class.path"));
		
		//Pregunta 6
		System.out.println("\nPregunta 6 -----------------------------------------------------------");
		//Crea dos objetos, de tipo StringBuilder, ambos deben estar inicializados con una cadena diferente. 
		//Después asigna la instancia del primer objeto al segundo y muestra por consola el contenido de ambos objetos. 
		//Explica el por qué del resultado obtenido. 
		//Explica las principales diferencias entre usar StringBuilder y StringBuffer
		StringBuilder sbUno,sbDos;
		sbUno = new StringBuilder("Programación");
		sbDos = new StringBuilder("Java");
		sbDos = sbUno;
		//se mostrará el mismo resultado porque las dos variables de tipo StringBuilder apuntan a la misma dirección de memoria
		System.out.println(sbUno + "," + sbDos);
		//una de las diferencias más importantes con StringBuffer es que el crecimiento en memoria (heap=montón) 
		//lo realiza dinámicamente de manera asíncrona, mientras que StringBuffer lo hace de manera síncrona
		
		//Pregunta 7
		System.out.println("\nPregunta 7 -----------------------------------------------------------");
		//Utiliza los constructores StringBuilder(int capacity) y StringBuilder(String str) 
		//para poner un ejemplo de cuándo utilizarías uno u otro en un programa
		//la construcción de un objeto StringBuilder con capacidad específica y sin cadena, lo utilizaría
		//cuando todavía no sé la cadena que voy a almacenar pero sí la longitud potencial que tendrá la cadena
		sbUno = new StringBuilder(10);
		System.out.println("StringBuilder vacío:" + sbUno);
		//construiría un objeto StringBuilder a partir de una cadena cuando tengo la cadena que voy a usar
		//y en principio no voy a trabajar con límite en la capacidad potencial
		sbDos = new StringBuilder("Programación Java");
		System.out.println(sbDos);
		
		//Pregunta 3
		System.out.println("\nPregunta 3 -----------------------------------------------------------");
		//Imagina que nos dan 2 cadenas de caracteres como las siguientes:
		//cadena 1: a e i o u
		//cadena 2: r m t p z
		//Nos piden transformar las cadenas anteriores para que se muestren en consola de la siguiente manera:
		//u;r;4;0
		//o;m;3;1
		//i;t;2;2
		//e;p;1;3
		//a;z;0;4
		final String CADENA_UNO="a e i o u";
		final String CADENA_DOS="r m t p z";
		String cadenaUno = CADENA_UNO.replace(" ", "");
		String cadenaDos = CADENA_DOS.replace(" ", "");
		StringTokenizer stringTokenizerDos = new StringTokenizer(CADENA_DOS);
		StringTokenizer stringTokenizerUno = new StringTokenizer((new StringBuilder(CADENA_UNO).reverse()).toString());
		StringJoiner stringJoiner = new StringJoiner(";");
		stringJoiner.add(stringTokenizerUno.nextToken());
		stringJoiner.add(stringTokenizerDos.nextToken());
		stringJoiner.add(String.valueOf(cadenaUno.indexOf('u')));
		stringJoiner.add(String.valueOf(cadenaDos.indexOf('r')));
		System.out.println(stringJoiner.toString());
		stringJoiner = new StringJoiner(";");
		
		stringJoiner.add(stringTokenizerUno.nextToken());
		stringJoiner.add(stringTokenizerDos.nextToken());
		stringJoiner.add(String.valueOf(cadenaUno.indexOf('o')));
		stringJoiner.add(String.valueOf(cadenaDos.indexOf('m')));
		System.out.println(stringJoiner.toString());
		stringJoiner = new StringJoiner(";");
		
		stringJoiner.add(stringTokenizerUno.nextToken());
		stringJoiner.add(stringTokenizerDos.nextToken());
		stringJoiner.add(String.valueOf(cadenaUno.indexOf('i')));
		stringJoiner.add(String.valueOf(cadenaDos.indexOf('t')));
		System.out.println(stringJoiner.toString());
		stringJoiner = new StringJoiner(";");
		
		stringJoiner.add(stringTokenizerUno.nextToken());
		stringJoiner.add(stringTokenizerDos.nextToken());
		stringJoiner.add(String.valueOf(cadenaUno.indexOf('e')));
		stringJoiner.add(String.valueOf(cadenaDos.indexOf('p')));
		System.out.println(stringJoiner.toString());
		stringJoiner = new StringJoiner(";");
		
		stringJoiner.add(stringTokenizerUno.nextToken());
		stringJoiner.add(stringTokenizerDos.nextToken());
		stringJoiner.add(String.valueOf(cadenaUno.indexOf('a')));
		stringJoiner.add(String.valueOf(cadenaDos.indexOf('z')));
		System.out.println(stringJoiner.toString());
		stringJoiner = new StringJoiner(";");
		
		//Pregunta 4
		System.out.println("\nPregunta 4 -----------------------------------------------------------");
		//Se dispone de una lista de alumnos/as y sus calificaciones en el módulo de Programación 
		//del CFGS 1º DAM (se aprueba el módulo siempre que la calificación sea 5 o más puntos) como la siguiente:

		//al1;4:h-al3;6:m-al2;9:m-al5;3:m-al4;5:h-al6;2:h

		//En la lista anterior al1, al2, al3... representa el código de cada alumno; el valor numérico entero 
		//es la calificación; y las letras 'h' o 'm' indican el sexo.

		//Muestra en consola una lista con las calificaciones del alumnado de sexo femenino de la siguiente manera:

		//<código alumna> <calificación> <aprobada/suspensa>
		final String CADENA_TRES="al1;4:h-al3;6:m-al2;9:m-al5;3:m-al4;5:h-al6;2:h";
		int calificacion;
		String alumna, alumnaLista="";
		StringTokenizer stringTokenizerTres = new StringTokenizer(CADENA_TRES,"-");
		StringTokenizer stringTokenizerAlumna, stringTokenizerCalificacion;
		//el primer elemento del tokenizer es un hombre
		stringTokenizerTres.nextToken();
		//primera alumna
		alumna = stringTokenizerTres.nextToken();
		stringTokenizerAlumna = new StringTokenizer(alumna,";");
		alumnaLista+=stringTokenizerAlumna.nextToken();
		stringTokenizerCalificacion = new StringTokenizer(stringTokenizerAlumna.nextToken(),":");
		calificacion = Integer.valueOf(stringTokenizerCalificacion.nextToken());
		alumnaLista+="\t" + calificacion + "\t";
		alumnaLista+=calificacion>4?"aprobada\n":"suspensa\n";
		//segunda alumna
		alumna = stringTokenizerTres.nextToken();
		stringTokenizerAlumna = new StringTokenizer(alumna,";");
		alumnaLista+=stringTokenizerAlumna.nextToken();
		stringTokenizerCalificacion = new StringTokenizer(stringTokenizerAlumna.nextToken(),":");
		calificacion = Integer.valueOf(stringTokenizerCalificacion.nextToken());
		alumnaLista+="\t" + calificacion + "\t";
		alumnaLista+=calificacion>4?"aprobada\n":"suspensa\n";
		//tercera alumna
		alumna = stringTokenizerTres.nextToken();
		stringTokenizerAlumna = new StringTokenizer(alumna,";");
		alumnaLista+=stringTokenizerAlumna.nextToken();
		stringTokenizerCalificacion = new StringTokenizer(stringTokenizerAlumna.nextToken(),":");
		calificacion = Integer.valueOf(stringTokenizerCalificacion.nextToken());
		alumnaLista+="\t" + calificacion + "\t";
		alumnaLista+=calificacion>4?"aprobada\n":"suspensa\n";
		
		System.out.println(alumnaLista);
		
	}

}
