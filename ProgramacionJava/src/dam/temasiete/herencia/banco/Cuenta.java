package dam.temasiete.herencia.banco;

public abstract class Cuenta {
	private Titular titular;
	private String numero;
	private double saldo;
	
	public abstract boolean ingresarDinero(double dinero);
	public abstract boolean retirarDinero(double dinero);
	
	protected Cuenta(Titular titular, String numero) {
		this.titular = titular;
		this.numero = numero;
	}
	
	protected Titular getTitular() {
		return titular;
	}

	protected void setTitular(Titular titular) {
		this.titular = titular;
	}	
	
	protected double getSaldo() {
		return this.saldo;
	}
	protected void setSaldo(double saldo) {
		this.saldo = saldo;
	}
}
