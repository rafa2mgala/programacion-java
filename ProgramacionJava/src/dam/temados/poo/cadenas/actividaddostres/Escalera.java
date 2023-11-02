package dam.temados.poo.cadenas.actividaddostres;
/**
 * Solución propuesta para el apartado a) de la actividad 2.3
 * @author rafa
 *
 */
public class Escalera {
	public static void main(String[] args) {
		String escalera = "1 2 3 4 5";
		System.out.println(escalera.substring(0,1) + "\n\t" + 
				escalera.substring(2,3) + "\n\t\t" + 
				escalera.substring(4,5) + "\n\t\t\t" + 
				escalera.substring(6,7)+ "\n\t\t\t\t" + 
				escalera.substring(8));
	}
}
