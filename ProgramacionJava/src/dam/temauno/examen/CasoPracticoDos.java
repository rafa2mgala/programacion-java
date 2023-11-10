package dam.temauno.examen;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;
/**
 * Clase para mostrar las soluciones propuesta al examen del tema 1. 
 * Soluciones para el caso práctico dos
 * @author rafa
 * @version 1.0
 */
public class CasoPracticoDos {

	public static void main(String[] args) {
		/*6. Sumar el dígito más a la derecha de un número entero al propio 
		valor de dicho número. Por ejemplo, si el número contiene el valor 463 
		después de la operación contendrá el valor 466 ( 463 + 3). 
		El número introducido debe tener como mínimo 3 dígitos y como máximo 6. 
		Si se introduce un número que no tiene el tamaño anterior no se hará 
		ninguna operación y se mostrará en consola 'El número introducido debe 
		tener entre 3 y 6 dígitos' (1,5 puntos: e)*/
		Scanner sc = new Scanner(System.in);
		int numero;
		String numeroCadena="";
		System.out.println("Introduce un número con más de dos dígitos y menos de 7:");
		numero = sc.nextInt();
		numeroCadena = String.valueOf(numero);
		System.out.println((numero<100 || numero >999999)?"Número incorrecto":
			numero + Integer.valueOf(numeroCadena.substring(numeroCadena.length()-1)));
		
		/*7. Suponiendo que la edad de jubilación es a los 65 años, hay que distinguir 
		 * entre tres tipos de personas según su edad: menor de edad, mayor de edad pero 
		 * no jubilado, y mayor de edad y jubilado. 
		 * Solicita la fecha de nacimiento de una persona y muestra lo siguiente (2,5 puntos: f):
			- Según la edad habrá que indicar si la persona es menor de edad, mayor de edad y no 
			jubilidada, o mayor de edad y jubilada
			- En caso de tener 18 años o más y menos de 65, mostrar los días que le faltan 
			para jubilarse
		*/
		final int MENOR_EDAD=17;
		final int MAYOR_JUBILADO=65;
		LocalDate fechaNac;
		String fecha="";
		int anios;
		long milis;
		System.out.println("Introduzca su fecha de nacimiento yyyy-MM-dd:");
		fecha = sc.next();
		fechaNac = LocalDate.parse(fecha);
		anios = Period.between(fechaNac, LocalDate.now()).getYears();
		System.out.println((anios>MENOR_EDAD && anios<MAYOR_JUBILADO)?
				"Mayor de edad no jubilado":anios<=MENOR_EDAD?"Menor de edad"
						:"Mayor de edad jubilado");
		//si es mayor de edad y no jubilado se calculan los milisegundos
		//que faltan hasta la edad de jubilación (también se puede resolver
		//con fechaNac.toEpochDay()
		final int MILIS_POR_DIA = 86400000; //24*60*60*1000
		milis = ChronoUnit.MILLIS.between(LocalDateTime.now(), 
				LocalDateTime.of(LocalDateTime.now().getYear()+MAYOR_JUBILADO-anios,
						fechaNac.getMonth(), fechaNac.getDayOfMonth(),0,0));
		//se calculan los días correspondientes a los milisegundos
		//calculados
		System.out.println((anios>MENOR_EDAD && anios<MAYOR_JUBILADO)?
				"Te faltan :" + 
				String.valueOf(milis/MILIS_POR_DIA) + " días":"");
		
		/*
		 * 9. Resuelve lo que se plantea a continuación utilizando expresiones 
		 * con distintos operadores Java (2,5 puntos: g)
		 * a) Solicita una fecha por consola, calcula si el mes de la fecha es 
		 * un mes de 30 días y muestra por consola si el mes introducido tiene 30 días.
		 * b) Vamos a calcular el área de una figura, que podrá ser un cuadrado o un rectángulo. 
		 * Solicita cada lado de la figura por consola, calcula y muestra el área, e indica si 
		 * la figura de la que se ha calculado el área es un cuadrado o un rectángulo (área del cuadrado=l*l; área del rectángulo=base*altura)
		 * c) Solicita un número entero positivo por consola menor que 10000. 
		 * Calcula y muestra por consola las unidades, decenas, centenas y unidades 
		 * de millar que tiene (decenas = 10, centenas = 100 y millares = 1000)
		 */
		
		//a
		System.out.println(fechaNac.getMonth()==Month.APRIL ||
				fechaNac.getMonth() == Month.SEPTEMBER ||
				fechaNac.getMonth() == Month.NOVEMBER ||
				fechaNac.getMonth() == Month.JUNE?"El mes en que naciste tiene 30 días":"");
		
		//b
		int lado1, lado2;
		System.out.println("Introduce un lado:");
		lado1 = sc.nextInt();
		System.out.println("Introduce otro lado:");
		lado2 = sc.nextInt();
		System.out.println("El área del " + ((lado1==lado2)?"cuadrado es ":"rectángulo es ")
			+ (lado1*lado2));
		
		//c
		System.out.println("Introduce un número:");
		numero = sc.nextInt();
		System.out.println(numero/1000+ " millares " +
				numero%1000/100 + " centenas " +
				numero%100/10 + " decenas " +
				numero%10 + " unidades");
	}

}
