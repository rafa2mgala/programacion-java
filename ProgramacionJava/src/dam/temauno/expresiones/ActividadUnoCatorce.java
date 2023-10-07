package dam.temauno.expresiones;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
/**
 * Solución propuesta a la actividad 1.14.
 * Expresiones, operadores, conversiones, variables y constantes
 * @author Rafa
 * @version 1.0
 */
public class ActividadUnoCatorce {

	public static void main(String[] args) {
		final int A_MAY=65;
		final int A_MIN=97;
		final int Z_MAY=90;
		final int Z_MIN=122;
		
		//10. Comprobar si la primera cifra de un número entero N de 3 cifras es impar
		int numero = 123;
		System.out.println((123/100)%2==0?"Primera cifra par": "Primera cifra impar");

		//11. Comprobar si la primera cifra de un número entero N de 4 cifras es par
		numero = 4321;
		System.out.println(((int)numero/1000)%2==0?"Primera cifra par": "Primera cifra impar");

		//12. Comprobar si una variable A de tipo carácter contiene 
		//una letra mayúscula
		char caracterA = 'e';
		System.out.println((!Character.isDigit(caracterA) 
				&& Character.valueOf(caracterA).toString().toUpperCase().
				equals(Character.valueOf(caracterA).toString()))?
						"Mayúscula":"O minúscula o no es un carácter");

		
		//13. Comprobar si una variable A de tipo carácter contiene
		//una letra mayúscula o minúscula
		System.out.println((!Character.isDigit(caracterA)&& 
				Character.valueOf(caracterA).toString().toUpperCase().
				equals(Character.valueOf(caracterA).toString()))?
						"Mayúscula":caracterA>=97 && caracterA<=122?"Minúscula":
							"Otro símbolo distintos");
		
		//14. Comprobar si una variable A de tipo carácter no 
		//contiene una letra mayúscula
		System.out.println((!Character.isDigit(caracterA)&& 
				!Character.valueOf(caracterA).toString().toUpperCase().
				equals(Character.valueOf(caracterA).toString()))?
						"Minúscula":"Mayúscula o no es un carácter");
		
		//15. Comprobar si una variable A de tipo carácter 
		//no contiene una letra mayúscula o minúscula
		int codigoCaracter = (int)caracterA;
		System.out.println(codigoCaracter<65 || 
				(codigoCaracter>90 && codigoCaracter<97)
				|| codigoCaracter>122?"No es un carácter":"Es un carácter");
		
		
		
		//16. Comprobar si el contenido de la variable N termina en 0 ó en 7
		System.out.println(String.valueOf(numero).endsWith("0") ||
				String.valueOf(numero).endsWith("7")?
						"El número termina en 0 o 7":
					"El número no termina ni en 0 ni en 7");
				
		//17. Comprobar si el contenido de la variable precio es igual o mayor
		//que 10€ y menor que 50€
		double precio=23;
		System.out.println(precio>=10 && precio<50?"Precio mayor o igual que 10 y menor que 50":
					"Precio menor que 10 o mayor o igual que 50");
		
		
		//18. Sumar el dígito más a la derecha de N al propio valor de N. 
		//Por ejemplo, si N contiene el valor 463 después de la operación 
		//contendrá el valor 466 ( 463 + 3 )
		int ultimoDigito = (int)String.valueOf(numero).
				charAt(String.valueOf(numero).length()-1);
		
		System.out.println("Suma de " + numero + " su último dígito " + ultimoDigito +
				" = " + numero + ultimoDigito);				
		
		//19. Comprobar si un número entero N de cuatro cifras es capicúa. 
		//Un número es capicúa si se puede leer igual de derecha a izquierda 
		//que de izquierda a derecha.
	    System.out.println(String.valueOf(numero).charAt(0)==ultimoDigito &&
	    		String.valueOf(numero).charAt(1)==
	    		String.valueOf(numero).charAt(2)?
	    				"Capicúa":"No capicúa");
	    
	    
	    //20. Una variable entera M contiene un número de mes. 
	    //Comprobar si corresponde a un mes de 30 días.
	    int mes = 3;
	    System.out.println((mes == Month.APRIL.getValue() || 
	    		mes == Month.JUNE.getValue() || 
	    		mes == Month.SEPTEMBER.getValue() || 
	    		mes == Month.NOVEMBER.getValue())?
	    				"Mes con 30 días":"El mes no tiene 30 días");
	    
	    //21. Quitarle a un número entero N su última cifra. 
	    //Supondremos que N tiene más de una cifra. Por ejemplo si 
	    //N contiene el valor 123 después de la operación contendrá el valor 12.
	    System.out.println(String.valueOf(numero).substring(0,
	    		String.valueOf(numero).length()-1));

	    
	    //22. Quitarle a un número entero N de 5 cifras su primera
	    //cifra. Por ejemplo si N contiene el valor 12345, después 
	    //de la operación contendrá el valor 2345.
	    numero = 12345;
	    System.out.println(String.valueOf(numero).
	    		substring(1,String.valueOf(numero).length()-2));
   
	    
	    //23. Comprobar si una variable C de tipo char contiene un dígito. 
	    //(Carácter entre 0 y 9)
	    char caracterC='2';
	    System.out.println(Character.
	    		isDigit(caracterC)?"Contiene un dígito":"No contiene un dígito");

	
	    //24. Dada dos variables enteras N y M de cuatro cifras, 
	    //sumar las cifras de N y guardar la suma en la variable X, 
	    //sumar las cifras de M y guardar la suma en la variable Y. 
	    //Finalmente guarda en la variable Z la suma de X e Y.
	    int numN=3344, numM=1234;
	    int sumaX,sumaY,sumaZ;
	    sumaX = ((int)String.valueOf(numN).charAt(0)) +
	    		((int)String.valueOf(numN).charAt(1)) +
	    		((int)String.valueOf(numN).charAt(2)) +
	    		((int)String.valueOf(numN).charAt(3));
	    
	    sumaY = ((int)String.valueOf(numM).charAt(0)) +
	    		((int)String.valueOf(numM).charAt(1)) +
	    		((int)String.valueOf(numM).charAt(2)) +
	    		((int)String.valueOf(numM).charAt(3));
	    System.out.println(sumaX+sumaY);
	    
	    
	    //25. Con DN, MN, AN  día, mes y año de nacimiento de una persona y 
	    //DA, MA, AA día, mes y año actual, escribe la expresión algorítmica 
	    //que compruebe si tiene 18 años cumplidos.
	    int diaActual = LocalDate.now().getDayOfMonth();
	    int mesActual = LocalDate.now().getMonthValue();
	    int anioActual = LocalDate.now().getYear();
	    int diaNac = 20;
	    int mesNac = 2;
	    int anioNac = 1992;
	    System.out.println(Period.between(
	    		LocalDate.of(anioActual, mesActual, diaActual), 
	    		LocalDate.of(anioNac,mesNac,diaNac)).getYears()>17?"Tiene 18 o más años":
	    			"Tiene menos de 18 años");
	    
	    
	}

}
