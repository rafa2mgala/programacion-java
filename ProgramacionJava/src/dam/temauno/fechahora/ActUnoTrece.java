package dam.temauno.fechahora;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;
/**
 * Solución propuesta a la actividad 1.13. Cálculos temporales
 * sobre una fecha introducida por el usuario
 * @author Rafa
 * @version 1.0
 */
public class ActUnoTrece {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String fechaIntroducida;
		LocalDate fecha, fechaFin;
		long dias;
		Period periodo;
		System.out.println("Introduzca una fecha (yyyy-MM-dd):");
		fechaIntroducida = sc.next();
		//Número de días para el fin de año
		fecha = LocalDate.parse(fechaIntroducida);
		fechaFin = LocalDate.of(fecha.getYear(), 12, 31);
		dias = fecha.until(fechaFin,ChronoUnit.DAYS);
		System.out.println(dias);
		//Nombre del mes
		System.out.println(fecha.getMonth().name());
		//Nombre del día de la semana
		System.out.println(fecha.getDayOfWeek().name());
		//Siglo al que pertenece
		System.out.println((fecha.getYear()+99)/100);
		//Tiempo transcurrido desde el 1 de Enero de 1970, 
		//en días, meses y años
		periodo = LocalDate.parse("1970-01-01").until(fecha);
		System.out.println(periodo.getDays()+","+periodo.getMonths()
		+","+periodo.getYears());
		//Comprobar si el año de la fecha es bisiesto
		System.out.println(fecha.isLeapYear());
		
		System.out.println(fecha.getYear()%4==0?
				fecha.getYear()%100==0?
				fecha.getYear()%400==0?"Bisiesto":"No bisiesto"
					:"Bisiesto":"No es bisiesto");
	}

}
