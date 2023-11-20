package dam.tematres.excepciones;
/**
 * Ejemplo de pre-condiciones y post-condiciones. Programación
 * preventiva para evitar excepciones
 * @author rafa
 * @version 1.0
 */
public class CuentaBancaria {
	public static final int ACTIVA=1;
	public static final int INACTIVA=2;
	private Prestamo prestamo;
	private float saldo;
	private int estado;
	public CuentaBancaria(float saldo) {
		this.estado = ACTIVA;
		this.saldo = saldo;
	}
	public boolean pedirPrestamo(Prestamo prestamo) {
		//se puede pedir un préstamo si el saldo
		//es al menos el doble de la cantidad pedida
		//y la cuenta está activa
		//pre-condición
		if(prestamo!=null && this.saldo>=prestamo.getCantidadPrestamo()*2 
				&& this.estado==ACTIVA) {
			this.prestamo = prestamo;
			
			//post-condición
			if(this.prestamo.getCantidadPrestamo()==this.saldo/2)
				this.estado=INACTIVA;
			return true;
		}
		return false;
	}
}
