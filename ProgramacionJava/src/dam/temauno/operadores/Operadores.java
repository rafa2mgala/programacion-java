package dam.temauno.operadores;

import java.util.Scanner;

/**
 * Clase en la que se probarán distintos ejemplos de operadores Java
 * @author rafa
 * @version 1.1
 * @since 1.0
 *
 */
public class Operadores {
	/**
	 * Método principal de la clase,es el punto de entrada al programa
	 * @param args Es un array de parámetros que se reciben desde el punto de llamada al
	 * programa
	 */
	public static void main(String[] args) {
		//El tipo Scanner se puede usar para leer de un flujo de entrada
		//in es una variable que puedo usar para leer la entrada por consola
		//desde teclado
		Scanner in = new Scanner(System.in);

		int contador=0; //tiene el valor 0
		
		//contador++; //contador = contador +1, primero toma el valor y luego suma
						
		System.out.println("Notación prefija ++:" + ++contador); //1
		contador = 0;
		System.out.println("Notación postfija ++:" + contador++);//2
				
		System.out.println(2*contador++);
		
		contador = 0;
		//++contador; //contador = contador +1, primero suma y luego toma el valor
		
		System.out.println(2*++contador);
		
		//muestro el valor de contador y luego lo incremento
		System.out.println(contador--);
		//muestro el valor de contador una vez incrementado
		System.out.println(contador);
		//incremento el valor de contador y lo muestro
		System.out.println(--contador);
		//muestro el valor de contador una vez incrementado
		System.out.println(contador);	

		//ejemplo de uso del operador alternativa
		String resultado;
		resultado=contador<0?"negativo":"no negativo";
		System.out.println(resultado + ", el valor de contador es:" + contador);

		int i,j;
		boolean iguales=false;
		//comparar por igualdad
		i=10;
		j=10;
		iguales = (i==j);
		//comparar por desigualdad
		iguales = (i!=j);
		//operador de negación
		iguales = !true;
		//Y lógico especial
		iguales = i<j && i <10;
		//O lógico especial
		iguales = i<j || i <10;
		//operadores de asignación

		i+=2;//es lo mismo que i=i+2;
		i-=2;//es lo mismo que i=i-2;	
		i*=2;//es lo mismo que i=i*2		
		i/=2;//es lo mismo que i=i/2

		i%=2;//es lo mismo que i=i%2;
		i=7;
		//el operador & realiza un Y lógico entre los bits del número
		//7=00000111, 5=00000101
		i&=5;//es lo mismo que i=i&2, es decir 5=000000101
		System.out.println(i);

		//el operador | realiza un O lógico entre los bits del número
		i|=8; //es lo mismo que i=i|8, es decir 13
		System.out.println(i);

		//el operador ^ realiza un O exclusivo lógico entre los bits del número
		i^=4; //es lo mismo que i=i^4, es decir 00001101 xor 00000100 es 9
		System.out.println(i);

		//el operador ~ realiza el complemento bit a bit de un número
		i=~4; //es decir 0000 0100 => 1111 1011 es decir -5
		System.out.println(i);
		
		//operadores de desplazamiento de bits
		i=8; //0000 1000 => 0010 0000
		System.out.println(i<<2); //igual que 8*2^2 es decir 32, el número crece
		
		System.out.println(i>>2); //igual que 8/2^2 es decir 2, el número decrece

		System.out.println("Carácter de escape para el retorno de carro\r"
				+ " incluyendo un tabulador\t antes de unas comillas dobles \""
				+ " y simples \'");
		
		//comprobar si un número introducido por teclado es par
		boolean par=false;
		int numero=0;
		//pido el número por consola
		System.out.print("Killo pon un número:");
		numero = in.nextInt();
		par=numero%2==0?true:false;
		System.out.println(par?"par":"impar");	
	}
}
