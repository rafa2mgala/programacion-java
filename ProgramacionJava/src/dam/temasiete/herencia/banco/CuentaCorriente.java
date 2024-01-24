package dam.temasiete.herencia.banco;

public class CuentaCorriente extends Cuenta {

	protected CuentaCorriente(Titular titular, String numero) {
		super(titular, numero);		
	}

	@Override
	public boolean ingresarDinero(double dinero) {
				
		return false;
	}

	@Override
	public boolean retirarDinero(double dinero) {
		if(this.getSaldo()<dinero) return false;
		this.setSaldo(this.getSaldo()-dinero);
		return true;
	}

}
