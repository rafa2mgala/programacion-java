package dam.temados.poo.cadenas;

import java.util.Scanner;
/**
 * Clase para probar métodos y propiedades de StringBuffer
 * @author rafa
 * @version 1.0
 */
public class TestStringBuffer {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String cadena="Prueba";
		
		char[] dst = new char[] {'a','b','c'};		
		
		//sbUno tiene longitud 16 caracteres
		StringBuffer sbUno = new StringBuffer();	
		
		
		//Los objetos de StringBuffer son mutables
		StringBuffer sbDos = new StringBuffer("¡Hola desde Java! ");
		
		sbDos.replace(6, 11, "a");
		System.out.println(sbDos); //¡Hola a Java!
		
		//los objetos de String son inmutables
		String s = new String("¡Hola desde Java! ");
		s.replace("desde", "a");
		System.out.println(s); //¡Hola desde Java!
		
		//comprobar si una cadena introducida por teclado es capicúa
		System.out.print("Introduzca una cadena:");
		cadena = sc.next();
		sbUno = new StringBuffer(cadena);
		System.out.println(cadena.equals(sbUno.reverse().toString())?"La cadena introducida"
				+ " es capicúa":"La cadena introducida no es capicúa");
		//muestra la capacidad actual, que se corresponde con el número de caracteres
		//de la cadena usada en el constructor + 16
		System.out.println(sbUno.capacity());
		//observad que la capacidad es la mayor adquirida en algún momento
		//,es decir cuando almacenaba la cadena más larga (antes del replace)
		System.out.println(sbDos.capacity());
		sbUno.trimToSize();
		sbDos.trimToSize();
		//ajuste del tamaño de los StringBuffers, ahora
		//el tamaño es el resultado de quitar 16 al número de caracteres
		//actuales 
		System.out.println(sbUno.capacity());
		System.out.println(sbDos.capacity());
		
		sc.close();
	}
}
