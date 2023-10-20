package dam.temados.poo.referencia;

import java.awt.Point;
/**
 * Ejemplos de asignaciones por valor y por referencia a memoria
 * @author rafa
 * @version 1.0
 */
public class TestPunto {
	public static void main(String[] args) {
		Punto punto1, punto2=new Punto(),
				punto3,punto4;
		
		punto1 = new Punto(3,4);
		
		punto3 = new Punto(55);		
	
		System.out.println(punto1);
		//envío un mensaje al objeto punto1
		int x = 8;
		punto1.setX(x);
		System.out.println(x);
		//leo un mensaje del objeto punto1
		System.out.println(punto1.getX());
		
		//punto2 es tipo objeto, al pasarlo como parámetro
		//se pasa su dirección de memoria. Si dentro del 
		//método setPunto() se cambia la información de 
		//estado de punto2, tras la llamada al método
		//el cambio realizado persistirá
		punto1.setPunto(punto2);
		System.out.println(punto2.getX());
		
		//asignación por valor
		int numero1, numero2=5;
		//cada variable conserva su dirección de memoria
		//sólo se copia el valor de numero2 a número1
		numero1 = numero2;
		//numero1 tendrá el valor 5, mientras que numero2
		//tendrá el valor 20
		numero2=20;
		//asignación por referencia a memoria
		Point point1, point2, point3;
		//el objeto point1 estará en memoria a partir de la
		//siguiente línea
		point1 = new Point(3,4);
		//el objeto point2 estará en memoria a partir de la
		//siguiente línea. Aunque point1 y point2 tienen
		//la misma información de estado, están en distintas
		//direcciones de memoria, son objetos distintos
		point2 = new Point(3,4);
		//se modifican las coordenadas de point1, point2
		//no se verá afectado porque es otro objeto
		point1.setLocation(6, 7);
		//asignación de referencia a memoria
		//se hace que point3 apunte a la misma dirección
		//de memoria que point2
		point3 = point2;
		//se hace que point2 apunte a la misma dirección
		//de memoria que point1
		point2 = point1;
		//el método setLocation() modifica las coordenadas
		//de point2 y point1 ya que ambas variables apuntan
		//a la misma dirección de memoria
		point2.setLocation(1, 1);
		//a partir de la siguiente línea point2 está
		//en la misma dirección de memoria que point3
		//cualquier cambio que se haga desde alguna
		//de estas dos variables se realizará
		//en la misma dirección de memoria. Es decir,
		//point2 y point3 tendrán la misma información
		//de estado
		point2 = point3;
	}
}
