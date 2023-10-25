package dam.temados.poo.fechahora;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;
/**
 * Ejemplos de uso de TemporalAdjusters. Se utiliza TemporalAdjusters
 * con el método with() de LocalDate.
 * @author Rafa
 * @version 1.0
 */
public class TestTemporalAdjusters {
	public static void main(String[] args) {
		//se inicializa una variable de tipo LocalDate con la fecha 23-10-2023, domingo
		LocalDate localDate = LocalDate.of(2023,10, 22);
		//se utiliza un TemporalAdjusters para obtener el siguiente domingo a partir
		//de la fecha anterior
	    LocalDate nextSunday = localDate.with(TemporalAdjusters.next(DayOfWeek.SUNDAY));
	    System.out.println(nextSunday);
	    //se obtiene el domingo anterior al 22-10-2023
	    LocalDate prevSunday = localDate.with(TemporalAdjusters.previous(DayOfWeek.SUNDAY));
	    System.out.println(prevSunday);
	    
	    localDate = localDate.of(2024, 2, 12);
	    //se obtiene la fecha que corresponde al segundo viernes del mes de febrero
	    //de 2024
	    LocalDate secondFriday = localDate.with(TemporalAdjusters.dayOfWeekInMonth(2, 
	    		DayOfWeek.FRIDAY));
	    System.out.println(secondFriday);
	    
	    //se obtiene la fecha del primer día del mes de febrero de 2024
	    LocalDate firstDayMonth = localDate.with(TemporalAdjusters.firstDayOfMonth());
	    System.out.println(firstDayMonth);
	    
	    //se obtiene la fecha del primer día del mes de marzo de 2024
	    LocalDate firstDayNextMonth = localDate.with(TemporalAdjusters.firstDayOfNextMonth());
	    System.out.println(firstDayNextMonth);
	    
	    //se obtiene la fecha del día de la semana, si el nombre del día de la semana
	    //coincide con el nombre del día de la fecha, se devuelve la propia fecha
	    //.Sino se devuelve la fecha del día indicado en la misma semana que la fecha
	    //Ejemplo, la fecha utilizada es 12-02-2024 (Monday), como el día que se indica
	    //es friday, se devuelve la fecha del viernes de la misma semana que el lunes.
	    LocalDate nextOrSame = localDate.with(TemporalAdjusters.nextOrSame(DayOfWeek.FRIDAY));
	    System.out.println(nextOrSame);
	    
	    //similar al anterior pero para fechas previas basadas en el día de la semana
	    LocalDate previousOrSame = localDate.with(TemporalAdjusters.previousOrSame(DayOfWeek.FRIDAY));
	    System.out.println(previousOrSame);
	}
}
