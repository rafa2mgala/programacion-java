package dam.temasiete.herencia.banco;

public class CuentaCredito extends Cuenta {
	private double limiteCredito;
	protected CuentaCredito(Titular titular, String numero, double limiteCredito) {
		super(titular, numero);		
	}

	@Override
	public boolean ingresarDinero(double dinero) {		
		return false;
	}

	@Override
	public boolean retirarDinero(double dinero) {
		if(this.limiteCredito<dinero) return false;	
		return true;
	}

	public double getLimiteCredito() {
		return limiteCredito;
	}	
}

