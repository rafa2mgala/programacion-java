package dam.temados.poo.cadenas;

import java.time.LocalDateTime;
import java.util.Scanner;
import java.util.StringJoiner;
import java.util.StringTokenizer;
/**
 * Solución propuesta a la actividad 2.4
 * @author rafa
 * @version 1.0
 */
public class ActividadDosCuatro {

	public static void main(String[] args) {
		//dada una frase por consola calcular
		//el número de palabras que tiene
		StringTokenizer st;
		String cadena="", token="", resultado="";
		StringJoiner sj;
		String[] tokens;
		Scanner sc = new Scanner(System.in);

		//pido la frase
		System.out.println("Escribe una frase con cuatro palabras:");
		//leo la frase
		cadena = sc.nextLine();

		//apartado 1
		//utilizo StringTokenizer para dividir la frase a partir
		//de los espacios en blanco que tiene
		st = new StringTokenizer(cadena);
		System.out.println(st.countTokens());
		//muestra el número de caracteres de la primera palabra
		token = st.nextToken();
		System.out.println(token + ", longitud=" 
				+ token.length());

		token = st.nextToken();
		System.out.println(token + ", longitud=" 
				+ token.length());

		token = st.nextToken();
		System.out.println(token + ", longitud=" 
				+ token.length());

		token = st.nextToken();
		System.out.println(token + ", longitud=" 
				+ token.length());

		//otra posibilidad es dividir la frase
		//en un array de cadenas, usando el espacio
		//como símbolo separador
		tokens = cadena.split(" ");
		System.out.println(tokens[0] + ", longitud=" 
				+ tokens[0].length());

		System.out.println(tokens[1] + ", longitud=" 
				+ tokens[1].length());

		System.out.println(tokens[2] + ", longitud=" 
				+ tokens[2].length());

		System.out.println(tokens[3] + ", longitud=" 
				+ tokens[3].length());

		//apartado 2
		//guardo el primer elemento del array en la variable resultado
		//PROGRAMA en Java ya
		resultado = tokens[0].
				startsWith(String.valueOf(tokens[0].toUpperCase().charAt(0)))?
						tokens[0].substring(0,1).toLowerCase() +
						tokens[0].substring(1)
						:tokens[0].substring(0,1).toUpperCase() +
						tokens[0].substring(1);
		System.out.println(resultado);

		resultado = tokens[1].
				startsWith(String.valueOf(tokens[1].toUpperCase().charAt(0)))?
						tokens[1].substring(0,1).toLowerCase() +
						tokens[1].substring(1)
						:tokens[1].substring(0,1).toUpperCase() +
						tokens[1].substring(1);
		System.out.println(resultado);

		resultado = tokens[2].
				startsWith(String.valueOf(tokens[2].toUpperCase().charAt(0)))?
						tokens[2].substring(0,1).toLowerCase() +
						tokens[2].substring(1)
						:tokens[2].substring(0,1).toUpperCase() +
						tokens[2].substring(1);
		System.out.println(resultado);

		resultado = tokens[3].
				startsWith(String.valueOf(tokens[0].toUpperCase().charAt(0)))?
						tokens[3].substring(0,1).toLowerCase() +
						tokens[3].substring(1)
						:tokens[3].substring(0,1).toUpperCase() +
						tokens[3].substring(1);
		System.out.println(resultado);

		//apartado 3
		resultado = cadena.replace(tokens[2], tokens[0]);
		System.out.println(resultado);

		//apartado 4
		sj = new StringJoiner(" ");
		st = new StringTokenizer(cadena);
		sj.add(st.nextToken());
		sj.add(st.nextToken());
		sj.add(LocalDateTime.now().toString());
		sj.add(st.nextToken());
		sj.add(st.nextToken());
		System.out.println(sj);
	}
}
