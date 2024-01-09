package dam.temacuatro.claseinterna;
/**
 * Ejemplo de clase interna local
 * @author Rafa
 * @version 1.0
 */
public class TestCuentaBancaria {
	public static void main(String[] args) {
		CuentaBancaria cb = new CuentaBancaria(10,1000);		
		cb.start(3);		
	}
}
