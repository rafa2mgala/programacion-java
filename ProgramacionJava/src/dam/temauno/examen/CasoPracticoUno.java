package dam.temauno.examen;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAccessor;
import java.util.Scanner;
/**
 * Clase para mostrar las soluciones propuesta al examen del tema 1. 
 * Del cuestionariosólo se incluye las solución a la pregunta 5. 
 * Del caso práctico uno están los 5 apartados
 * @author rafa
 * @version 1.0
 */
public class CasoPracticoUno {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		//Cuestionario, pregunta de lógica, tabla
		System.out.println("Cuestionario, pregunta 5, tabla");
		System.out.println("---------------------------------------");
		boolean bol1, bol2, bol3, bol4;
		//1)true,true,true,?
		bol1=bol2=bol3=true;
		bol4 = (bol1 && bol2)||!bol3;

		System.out.println("1)" + bol1 + ","
				+ bol2 + ","
				+ bol3 + ","
				+ bol4);

		//2 true,true,false, ?
		bol1=bol2=true;
		bol3=false;
		bol4 = (bol1 && bol2)||!bol3;
		System.out.println("2)" + bol1 + ","
				+ bol2 + ","
				+ bol3 + ","
				+ bol4);

		//3 true,false,false, ?
		bol1=true;
		bol2=bol3=false;
		bol4 = (bol1 && bol2)||!bol3;
		System.out.println("3)" + bol1 + ","
				+ bol2 + ","
				+ bol3 + ","
				+ bol4);

		//4 false,false,false, ?
		bol1=bol2=bol3=false;		
		bol4 = (bol1 && bol2)||!bol3;
		System.out.println("4)" + bol1 + ","
				+ bol2 + ","
				+ bol3 + ","
				+ bol4);

		//5 false,false,true,?
		bol1=bol2=false;
		bol3=true;
		bol4 = (bol1 && bol2)||!bol3;
		System.out.println("5)" + bol1 + ","
				+ bol2 + ","
				+ bol3 + ","
				+ bol4);

		//6 false,true,true,?
		bol1=false;
		bol2=bol3=true;		
		bol4 = (bol1 && bol2)||!bol3;
		System.out.println("6)" + bol1 + ","
				+ bol2 + ","
				+ bol3 + ","
				+ bol4);


		System.out.println("Caso práctico");
		System.out.println("---------------------------------------");
		//Caso práctico
		//6. Sumar el dígito más a la izquierda de un número entero 
		//al propio valor de dicho número. Por ejemplo, si el número 
		//contiene el valor 463 después de la operación contendrá 
		//el valor 467 ( 463 + 4 ). El número introducido debe tener 
		//como mínimo 3 dígitos y como máximo 6. Si se introduce un 
		//número que no tiene el tamaño anterior no se hará ninguna 
		//operación y se mostrará en consola 'El número introducido 
		//debe tener entre 3 y 6 dígitos' (1,5 puntos: e)
		int numero;
		String resultado="";
		System.out.println("Introduzca un número que tenga más de 2 dígitos"
				+ " y menos de 7:");

		numero = sc.nextInt();
		resultado = (numero<100 || numero > 999999)?"El número introducido no"
				+ " no es válido!":
					"El resultado es: " + 
					(numero + Integer.valueOf(String.valueOf(numero).substring(0,1)));
		System.out.println(resultado);

		//7. Solicita la fecha de nacimiento de una persona (2,5 puntos: f). 
		//Muestra lo siguiente:
		//- En caso de no tener 18 años, mostrar los años, meses y días 
		//que le faltan
		//- En caso de tener 18 años o más, mostrar los años, meses y días 
		//transcurridos desde que cumplió los 18 años a la fecha actual.
		
		//la fecha de nacimiento no se puede modificar una vez introducida
		//se define como una constante
		final LocalDate FECHA_NAC;
		//la fecha de referencia para los cálculos no se puede modificar
		//una vez asiganado su valor, se define como una constante
		final LocalDate AHORA;
		//la variable fecha se utilizará y modificará en distintos apartados
		//se define como variable
		String fecha;
		System.out.println("Introduzca su fecha de nacimiento (yyyy-MM-dd)");
		fecha = sc.next();
		FECHA_NAC = LocalDate.parse(fecha);
		AHORA = LocalDate.now();
		
		Period periodoHasta = Period.between(AHORA, 
				LocalDate.of(AHORA.plusYears(1).getYear()
				, FECHA_NAC.getMonth(), FECHA_NAC.getDayOfMonth()));
		
		
		Period periodoDesde = Period.between(FECHA_NAC,AHORA);
		
		resultado = Period.between(FECHA_NAC, AHORA).getYears()<18?
				"Te faltan para los 18: " + periodoHasta.getYears() +
				" años, " + periodoHasta.getMonths() + " meses, " +
				periodoHasta.getDays() + " días":
					"Desde los 18 años han transcurrido: " +
					+ (periodoDesde.minusYears(18).getYears()) +
					" años, " + periodoDesde.getMonths() + " meses, " +
					periodoDesde.getDays() + " días";
		System.out.println(resultado);
		
		//8. Analiza el siguiente trozo de código y explica cada 
		//línea añadiendo comentarios de código (2,5 puntos: h):
		//conversión ímplicita de int a byte, no hay pérdida 
		//de precisión
		byte b = 42; 
		//conversión ímplicta de int a char, no hay pérdida
		//de precisión
		char c = 'a'; 
		//conversión ímplicta de int a short, puede haber pérdida
		//de precisión según el valor asignado. Se puede producir
		//un desbordamiento
		short s = 1024;
		//inicialización, no hay conversión ímplicita, int a int
		int i = 50000;
		//inicialización, no hay conversión ímplicita, float a float
		float f = 5.67f;
		//inicialización, no hay conversión ímplicita, double a double
		double d = .1234;         
		//analizamos la siguiente línea por partes
		double result = (f * b) + (i / c) - (d * s);
		//f*b Conversión implícita a float
		//i/c Conversión implícita a int
		//d*s Conversión implícita a double
		//(float) + (int) + (double) Conversión implícita a double 
		//se realiza una conversión implícita de double a String
		System.out.println("resultado = " + result);

		//- Responde a las siguientes preguntas y pon un ejemplo:

		//¿Cuándo se produce un desbordamiento de una variable? ¿Qué ocurre?
		//Cuando se produce desbordamiento en compilación puede que avise
		//para que hagamos una conversión explícita, por ejemplo Short s=66666;.
		//el resultado del valor es inesperado. Ejemplo: s= (short) 66666;
		
		//¿Es lo mismo desbordamiento que truncamiento? No, el desbordamiento se produce
		//cuando el valor de una variable excede el tamaño de respresentación de su tipo
		//El truncamiento se produce cuando el tipo de la variable no tiene precisión (decimales)
		//y sólo puede almacenar la parte entera de un número.
		
		//9. Utiliza un operador unario sobre el mes de una fecha introducida 
		//por consola (formato yyyy-MM-dd hh:mm, donde M=mes y m=minuto). 
		//Explica el uso de dicho operador en todas sus variantes.  
		//Relaciona, si es posible, el operador unario elegido con funciones de 
		//alguno de los tipos de datos utilizados en la fecha-hora. 
		//Después, muestra el número de días, minutos y segundos transcurridos 
		//desde la fecha introducida y tu fecha de cumpleaños (2,5 puntos: g)
		LocalDateTime fechaHora, fechaCumple;
		System.out.println("Introduzca una fecha y hora (yyyy-MM-dd hh:mm)");
		sc.nextLine();
		sc = new Scanner(System.in);
		//no se puede usar next() porque se deja atrás lo que haya después
		//del espacio
		fecha = sc.nextLine();
		fecha = fecha.replace(" ", "T");
		fechaHora = LocalDateTime.parse(fecha);
		int mes=fechaHora.getMonth().getValue();
		mes+=1; //se añade un mes al mes de la fecha
		fechaHora = fechaHora.withMonth(fechaHora.getMonth().plus(1).getValue());
		mes-=1; //se quita el mes añadido
		fechaHora = fechaHora.withMonth(fechaHora.getMonth().minus(1).getValue());
		mes+=mes; //se suma el valor del mes con el mismo y se guarda en la variable mes
		fechaHora = fechaHora.withMonth(fechaHora.getMonth().plus(fechaHora.getMonthValue()).getValue());
		mes++; //se añade un mes
		fechaHora = fechaHora.withMonth(fechaHora.getMonth().plus(1).getValue());
		mes--; //se quita un mes
		fechaHora = fechaHora.withMonth(fechaHora.getMonth().minus(1).getValue());
		
		
		//recupero la fecha-hora introducida porque en los apartados anteriores
		//se ha modificado
		fechaHora = LocalDateTime.parse(fecha);
		//como se refiere a período de tiempo transucurrido se entiende
		//que la fecha introducida debe ser posterior a la fecha de cumpleaños
		fechaCumple = LocalDateTime.of(2000, 1,20,23,5);
		
		System.out.println("El tiempo transcurrido en días ha sido de: " + 
				Duration.between(fechaCumple, fechaHora).toDays());
		System.out.println("El tiempo transcurrido en horas ha sido de: " + 
				Duration.between(fechaCumple, fechaHora).toHours());
		System.out.println("El tiempo transcurrido en minutos y segundos ha sido de: " +
				Duration.between(fechaCumple, fechaHora).toMinutes() +" minutos y 0 segundos");
		

	}

}
