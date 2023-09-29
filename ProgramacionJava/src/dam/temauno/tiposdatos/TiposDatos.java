package dam.temauno.tiposdatos;

import java.io.File;
/**
 * Esta clase se utiliza para ejemplos Java relacionados con tipos de datos
 * @author rafa
 *
 */
public class TiposDatos {
	
	public static void main(String[] args) {		
		//uso de la función getClass() para obtener el nombre del tipo
		String cadena="Hola"; //String cadena = new String("Hola")
		String nombreTipo = cadena.getClass().getName();
		System.out.println(nombreTipo);
		
		float numero = 10F;
		
		//uso del operador instanceof para comprobar tipos
		boolean check1 = "1º DAM" instanceof String;
		System.out.println(check1);
		//en el tema 1 todavía esto no se ve
		Object file=new File("prueba.txt");
		boolean check2 = file instanceof String;
		System.out.println(check2);
				
		//wrappers
		Double distanciaDouble=2345.4566;
		
		//tipo de datos primitivo, double (doble precisión)
		double distanciaD = 2345.4566;
		
		System.out.println(distanciaDouble+distanciaD);

		//solución de la actividad 1.4
		//apartado 1
		int var1=10; //variable de tipo entero
		long var2=100; //variable de tipo entero largo
		float var3=(float)12.456; //variable de tipo decimal simple presición
		var1 = (int)var2; //conversión explícita
		var3 = var2;//conversión implícita
		
		//apartado 2	    
		char ch = 'c';
		int num = 88;
		//había que hacer un casting explícito
		ch = (char)num;

		//actividad 1.5
		//declaración de una variable de tipo byte
		byte b; 
		//inicialización de una variable entera
		int i = 257; 
		//inicialización de una variable decimal
		double d = 323.142;
		//casting explícito de int a byte
		b = (byte) i; 
		//salida por consola de las variables int y byte
		System.out.println("i = " + i + " b = " + b);        
		//casting explícito de double a byte
		b = (byte) d; 
		//salida por consola de las variables double y byte
		System.out.println("d = " + d + " b= " + b);

		//solución de la actividad 1.6
		//las variables b, i y d cambian su nombre
		//porque ya se han declarado antes: b1, i1, d1
		//inicializaciones de variables
		//aunque el valor es entero cabe en un byte, por lo que no 
		//es necesario realizar un casting explícito
		byte b1 = 42; 
		char c = 'a'; 
		//no es necesario el casting porque el valor asignado cabe en short
		short s = 1024;
		//no es necesario casting porque el valor asignado cabe en int
		int i1 = 50000;
		//se usa el especificador de formato en vez del casting explícito
		float f = 5.67f;
		//casting implícito de float a double
		double d1 = .1234;
		//la variable result almacena el resultado del cálculo,
		//es de tipo double porque el tipo con mayor representación
		//y presición es double, la variable d1
		double result = (f * b1) + (i1 / c) - (d1 * s);
		//se muestra por consola el valor del resultado del cálculo
		System.out.println("resultado = " + result);
		
		//solución de la actividad 1.7
		//se renombra la variable b por b2
		//el siguiente código sirve para mostrar la necesidad de realizar
		//un casting explícito debido al posible desbordamiento de la 
		//representación de la variable de tipo byte, byte * int => int
		byte b2 = 50; 
        b2 = (byte)(b2 * 2); 
        System.out.println(b2);
               
	}

}
