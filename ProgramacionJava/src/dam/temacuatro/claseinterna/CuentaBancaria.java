package dam.temacuatro.claseinterna;

/**
 * Clase contenedora, en su método start() hay definida una clase interna
 * local al método. Estas clases son las más ocultas en Java. El método
 * start() pone en funcionamiento un temporizador que cada segundo calcula
 * el interés del saldo de la cuenta. Si el saldo de la cuenta cambia
 * el interés también
 * @author Rafa
 * @version 1.0
 */
public class CuentaBancaria
{
	//almacena la vez en que se realiza el cálculo del interés
	private int contadorReloj;
	//máximo número de veces que se realizará el cálculo del interés
	private int contadorRelojMax;
	//saldo de la cuenta bancaria
	private double saldo;
	//interés del saldo de la cuenta bancaria
	private double interesSaldo;
	//momento, en milisegundos en que se realiza cada cálculo
	//del interés
	private long inicio;
	
	/**
	 * Constructor especializado en construir objetos de la clase
	 * inicializando las propiedades contadorRelojMax y saldo
	 * @param contadorRelojMax Máximo número de veces que calculará
	 * el interés sobre el saldo
	 * @param saldo Saldo de la cuenta bancaria
	 */
	public CuentaBancaria(int contadorRelojMax, double saldo) {
		this.contadorRelojMax = contadorRelojMax;
		this.saldo = saldo;
	}	
	/**
	 * Este método pone en marcha un temporizador para calcular
	 * el interés de la cuenta según su saldo actual
	 * @param inc Interés que se aplicará al saldo. A partir de 
	 * la versión 8 de Java no es necesario poner final. Por defecto
	 * la variable del parámetro será no modificable en la clase
	 * interna
	 */
	public void start (double inc) 	
	{
		int i=0;
		/**
		 * Clase interna local, sólo es accesible desde dentro del propio
		 * método que la contiene
		 * @author Rafa
		 * @version 1.0
		 */
		class Interes
		{			
			/**
			 * Calcula el interés actual a partir del saldo actual
			 * de la cuenta
			 */
			public void calcularInteres() {				
				interesSaldo = saldo * inc/100;
				contadorReloj++;
				System.out.println(contadorReloj);
			}		
		}
		this.inicio = System.currentTimeMillis();
		Interes interes = new Interes();
		while(i<this.contadorRelojMax) {
			//cada segundo se calcula el interés
			if(System.currentTimeMillis()-this.inicio>=1000) {
				//cálculo del interés
				interes.calcularInteres();
				//actualización del momento en que se ha calculado
				//el interés
				this.inicio = System.currentTimeMillis();
				i++;
			}
		}
	}
	public int getContadorReloj() {
		return this.contadorReloj;
	}
	public double getInteres() {
		return this.interesSaldo;
	}
}

