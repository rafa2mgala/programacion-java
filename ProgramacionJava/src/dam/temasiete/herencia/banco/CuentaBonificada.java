package dam.temasiete.herencia.banco;

public class CuentaBonificada extends CuentaCorriente {
	public static final int COCHE=0;
	public static final int VIAJE=1;
	private int premio;
	private int bonificacion;
	protected CuentaBonificada(Titular titular, String numero) {
		super(titular, numero);		
	}

	@Override
	public boolean ingresarDinero(double dinero) {
		return false;
	}

	@Override
	public boolean retirarDinero(double dinero) {
		if(super.retirarDinero(dinero)) {
			this.bonificacion+=10;
			return true;
		}
		return false;
	}
}
