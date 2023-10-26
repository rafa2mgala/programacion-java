package dam.temados.poo.fechahora;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoUnit;

/**
 * Ejemplos de formato de fecha y hora con DateTimeFormatter
 * @author Rafa
 * @version 1.0
 */
public class TestDateTimeFormatter {

	public static void main(String[] args) {
		DateTimeFormatter dtFormatter;
		LocalDate localDate = LocalDate.of(2023, 10, 26);
		//formato largo de fecha
		dtFormatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
		//se formatea la fecha 26-10-2023 a formato largo
		System.out.println(localDate.format(dtFormatter));
		
		//formato largo de fecha y hora
		dtFormatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL);
		LocalDateTime localDateTime = LocalDateTime.of(localDate, LocalTime.of(12, 0));
		System.out.println(localDateTime.format(dtFormatter.ISO_LOCAL_DATE_TIME));
		
		//formateando fechas y horas usando regionalización
		LocalDate anotherSummerDay = LocalDate.of(2023, 8, 23);
		LocalTime anotherTime = LocalTime.of(13, 12, 45);
		ZonedDateTime zonedDateTime = ZonedDateTime.of(anotherSummerDay, anotherTime, 
				ZoneId.of("Europe/Madrid"));
		System.out.println(
		  DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL)
		  .format(zonedDateTime));
		System.out.println(
		  DateTimeFormatter.ofLocalizedDateTime(FormatStyle.LONG)
		  .format(zonedDateTime));
		System.out.println(
		  DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM)
		  .format(zonedDateTime));
		System.out.println(
		  DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT)
		  .format(zonedDateTime));
		
		//formateando una fecha de manera personalizada
		String europeanDatePattern = "dd/MM/yyyy";
		DateTimeFormatter europeanDateFormatter = DateTimeFormatter.ofPattern(europeanDatePattern);
		System.out.println(europeanDateFormatter.format(LocalDate.of(2023, 7, 31)));
		//igual que antes pero con el nombre del mes en vez de el número
		europeanDatePattern = "dd/LLL/yyyy";
		europeanDateFormatter = DateTimeFormatter.ofPattern(europeanDatePattern);
		System.out.println(europeanDateFormatter.format(LocalDate.of(2023, 7, 31)));
		
		//formateando horas de manera personalizada, se muestran los milisegundos
		String timeColonPattern = "HH:mm:ss SSS";
		DateTimeFormatter timeColonFormatter = DateTimeFormatter.ofPattern(timeColonPattern);
		LocalTime colonTime = LocalTime.of(17, 35, 50).plus(329, ChronoUnit.MILLIS);
		System.out.println(timeColonFormatter.format(colonTime));
		
		//igual que antes pero con la hora del sistema
		colonTime = LocalTime.now();
		System.out.println(timeColonFormatter.format(colonTime));
		
		//fecha y hora en New York con formato personalizado
		String newYorkDateTimePattern = "dd.MM.yyyy HH:mm z";
		DateTimeFormatter newYorkDateFormatter = DateTimeFormatter.ofPattern(newYorkDateTimePattern);
		LocalDateTime summerDay = LocalDateTime.of(2023, 7, 31, 14, 15);
		System.out.println(newYorkDateFormatter.format(ZonedDateTime.of(summerDay, ZoneId.of("UTC-4"))));
		
		//igual que antes pero tomando la fecha y hora de New York
		LocalDateTime otherDay = LocalDateTime.of(LocalDate.now(ZoneId.of("UTC-4")), 
				LocalTime.now(ZoneId.of("UTC-4")));
		System.out.println(newYorkDateFormatter.format(ZonedDateTime.of(otherDay, ZoneId.of("UTC-4"))));
	}
}
