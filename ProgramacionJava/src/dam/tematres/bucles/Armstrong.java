package dam.tematres.bucles;
/**
 * Solución propuesta para la actividad 3.15
 * Calcula si los números comprendidos entre 1 y 600 es un número de Armstrong
 * @author rafa
 * @version 1.0
 */
public class Armstrong {
	public static void main(String[] args) {
		int sumaProducto = 0, resto, temp, totalArmstrong=0;
		//la variable de control de bucle i es la que contiene, en cada
		//iteración, el valor sobre el que vamos a comprobar si es un 
		//número de Armstrong
		for(int i=1;i<601;i++) {
			temp = i;
			while (temp > 0) {
				resto = temp % 10;
				//se calcula el número de cifras del número a comprobar
				//para saber cuantas veces se multiplica el resto de dividir
				//por 10. Como el número mayor tiene sólo centenas siempre
				//podremos calcular el resto
				if(String.valueOf(i).length()==3)
					sumaProducto = sumaProducto + (resto * resto * resto);
				if(String.valueOf(i).length()==2)
					sumaProducto = sumaProducto + (resto * resto);
				if(String.valueOf(i).length()==1)
					sumaProducto = sumaProducto + (resto);
				temp = temp / 10;
			}
			//se comprueba si la suma de productos es el número original
			//en cuyo caso es un número de Armstrong
			if (i == sumaProducto) {
				System.out.println(sumaProducto + " es un número de Armstrong");
				totalArmstrong++;
			}
			sumaProducto=0;
		}
		System.out.println("Entre 1 y 600 hay " + totalArmstrong + " números de Armstrong");
	}
}
