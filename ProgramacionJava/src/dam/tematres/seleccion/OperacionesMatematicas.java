package dam.tematres.seleccion;

import java.util.Scanner;
/**
 * Solución propuesta para la actividad 3.9
 * Menú de operaciones matemáticas
 * @author rafa
 * @version 1.0
 */
public class OperacionesMatematicas {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int opcion=0;
		int num1,num2;
		final int SUMAR=1;
		final int RESTAR = 2;
		final int MULTIPLICAR=3;
		final int DIVIDIR=4;
		final int POTENCIA=5;
		final int RESTO=6;
		final int LOGARITMO=7;
		final int SENO_ANGULO=8;
		final int SALIR=9;
		
		//bucle do while porque no sé el número de veces que realizará operaciones matemáticas, y porque cada
		//vez que tenga que realizarlas le vuelvo a mostrar el menú de opciones
		do {
			System.out.println("---------------------------------------");
			System.out.println("Elija una operación:");
			System.out.println("---------------------------------------");
			System.out.println("1. Sumar");
			System.out.println("2. Restar");
			System.out.println("3. Multiplicar");
			System.out.println("4. Dividir");
			System.out.println("5. Potencia");
			System.out.println("6. Resto");
			System.out.println("7. Logaritmo decimal");
			System.out.println("8. Seno de un ángulo");
			System.out.println("9. Salir");
			opcion = in.nextInt();
			switch(opcion) {
			case SUMAR,RESTAR,MULTIPLICAR,DIVIDIR,POTENCIA,RESTO:
				System.out.println("Introduzca un número entero:");
				num1 = in.nextInt();
				System.out.println("Introduzca un otro número entero:");
				num2 = in.nextInt();
				if(opcion*10==SUMAR) {
					System.out.println("La suma es: " + num1+num2 + ", pulse 0+intro para continuar");
				}else if(opcion==2) {
					System.out.println("La resta del primero menos el segundo es: " + (num1-num2) 
							+ ", pulse 0+intro para continuar");
				}else if(opcion==3) {
					System.out.println("El producto es: " + num1*num2 + ", pulse 0+intro para continuar");
				}else if(opcion ==4) {
					if(num2==0) {
						System.out.println("El segundo número no puedes ser 0, pulsa 0+intro para continuar");
						in.next();
						break;
					}
					System.out.println("El cociente entre el primero y el segungo es: " + num1/num2 
							+ ", pulse 0+intro para continuar");
				}else if(opcion==5) {
					System.out.println("El primero elevado al segundo es: " + Math.pow(num1, num2) 
							+ ", pulse 0+intro para continuar");
				}else if(opcion==6) {
					System.out.println("El resto de dividir el primero entre el segundo es: " + num1%num2 
							+ ", pulse 0+intro para continuar");
				}
				in.nextInt();
				break;
			case LOGARITMO:
				System.out.println("Introduzca un número entero positivo:");
				num1 = in.nextInt();
				if(num1<=0) {
					System.out.println("Has introducido un número incorrecto, 0+intro para continuar");
					in.next();
					break;
				}
				System.out.println("El logartimo decimal del primero número es:" + Math.log(num1));
				System.out.println("Pulse 0+intro para continuar");
				in.next();
				
				break;
			case SENO_ANGULO:
				System.out.println("Introduce un ángulo positivo:");
				num1 = in.nextInt();
				if(num1<0) {
					System.out.println("Has introducido un ángulo incorrecto, pulsa 0+intro para continuar");
					in.next();
					break;
				}
				System.out.println("El seno del ángulo introducido es: " + Math.sin(num1));
				System.out.println("Pulse 0+intro para continuar");
				in.next();
				
				break;
			case SALIR:
				System.out.println("Gracias por usar el programa, pulsa 0+intro para salir");
				in.next();
				break;
			default:
				System.out.println("Opción incorrecta, pulse 0+intro para continuar");
				in.next();
				break;
			}
		}while(opcion!=SALIR);
		in.close();
	}
}
