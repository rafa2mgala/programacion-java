package dam.temados.poo.referencia;

public class TestPunto {
	public static void main(String[] args) {
		Punto punto1, punto2=new Punto(),
				punto3,punto4;
		
		punto1 = new Punto(3,4);
		
		punto3 = new Punto(55);
	
		//el objeto punto4 apunta a la misma
		//dirección de memoria que punto1
		punto4 = punto1;
		
		System.out.println(punto1);
		//envío un mensaje al objeto punto4
		int x = 8;
		punto4.setX(x);
		System.out.println(x);
		
		
		System.out.println(punto4);
		//leo un mensaje del objeto punto4
		System.out.println(punto4.getX());
		
		System.out.println(punto2.getX());
		punto4.setPunto(punto2);
		System.out.println(punto2.getX());
		
		
		
	}
}
