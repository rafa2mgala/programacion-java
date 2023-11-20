package dam.tematres.excepciones;
/**
 * Ejemplo de pre-condiciones y post-condiciones. Programación
 * preventiva para evitar excepciones
 * @author rafa
 * @version 1.0
 */
public class Sucursal {

	public static void main(String[] args) {
		CuentaBancaria cuentaBancaria = new CuentaBancaria(1000);
		Prestamo prestamo = new Prestamo(600);
		if(cuentaBancaria.pedirPrestamo(prestamo)) {
			System.out.println("Se ha concedido el préstamo");
		}else
			System.out.println("No se ha concedido el préstamo");
	}
}
