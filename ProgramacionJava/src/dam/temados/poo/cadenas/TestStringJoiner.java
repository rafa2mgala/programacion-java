package dam.temados.poo.cadenas;

import java.util.StringJoiner;
import java.util.StringTokenizer;
/**
 * Ejemplo de construcción de cadenas a partir
 * de subcadenas con StringJoiner
 * @author Rafa
 * @version 1.0
 */
public class TestStringJoiner {
	public static void main(String[] args) {
		StringJoiner sj = new StringJoiner(",");
		StringTokenizer st;
		sj.add("1");
		sj.add("Woodhouse");
		sj.add("awoodhouse0@live.com");
		sj.add("Male");
		sj.add("147.25.100.85");
		System.out.println(sj);
		st = new StringTokenizer(sj.toString(),",");
		System.out.println("El registro de datos tiene " + st.countTokens() +
				" campos");
	}
}
