package dam.temasiete.herencia.banco;

public class Sucursal {
	public static final int CAJEROS_COMPLETOS=-1;
	public static final int CAJERO_NOVALIDO=-2;
	public static final int CAJERO_AGREGADO = 0;
	public static final int CUENTA_NOVALIDA=-100;
	public static final int CUENTA_TITULAR_EXISTENTE=-101;
	public static final int CUENTA_AGREGADA=100;


	private String nombre;
	private int numero;
	private int ultimoCajero;
	private int ultimaCuenta;
	private Cuenta[] cuentas;
	private Cajero[] cajeros;

	public Sucursal(String nombre, int numero) {
		this.nombre = nombre;
		this.numero = numero;
		this.cuentas = new Cuenta[50];
		this.cajeros = new Cajero[2];
	}
	public int nuevoCajero(Cajero cajero) {		
		if(this.cajeros[0]!=null && this.cajeros[1]!=null) return CAJEROS_COMPLETOS;
		if((cajero==null || !(cajero instanceof Cajero))) return CAJERO_NOVALIDO;
		this.cajeros[this.ultimoCajero] = cajero;
		this.ultimoCajero++;
		return CAJERO_AGREGADO;
	}
	public int nuevaCuenta(Cuenta cuenta) {
		int i = 0;
		if(cuenta==null || (!(cuenta instanceof Cuenta) &&
				!(cuenta instanceof CuentaBonificada) &&
				!(cuenta instanceof CuentaCorriente) &&
				!(cuenta instanceof CuentaCredito))) return CUENTA_NOVALIDA;
		//comprobar si el titular de la nueva cuenta ya tiene una cuenta
		while(i<this.cuentas.length) {
			if(this.cuentas[i]!=null) {
				if(this.cuentas[i].getTitular().equals(cuenta.getTitular()))
					break;
			}
			i++;
		}
		if(i==this.cuentas.length) {
			this.cuentas[this.ultimaCuenta] = cuenta;
			this.ultimaCuenta++;
			return CUENTA_AGREGADA;
		}		
		return CUENTA_TITULAR_EXISTENTE;
	}

}
