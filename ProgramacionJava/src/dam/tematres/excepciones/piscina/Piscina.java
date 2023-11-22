package dam.tematres.excepciones.piscina;
/**
 * Solución propuesta a la actividad 3.17
 * Ejemplo de excepción controlada para gestionar
 * el llenado de una piscina
 * @author rafa
 * @version 1.0
 */
public class Piscina {
	private int nivel;
	public final int MAX_NIVEL;

	public Piscina(int max)
	{
		if (max<0) max=0;
		this.MAX_NIVEL=max;
	}
	public int getNivel()
	{ 
		return this.nivel; 
	}
	public void vaciar(int cantidad) throws NivelPiscinaException
	{
		if (this.nivel-cantidad < 0)
			throw new NivelPiscinaException("Vaciado excesivo", this.nivel-cantidad);
		else this.nivel=this.nivel-cantidad;
	}
	public void llenar(int cantidad) throws NivelPiscinaException
	{
		if (this.nivel+cantidad > MAX_NIVEL)
			throw new NivelPiscinaException("Llenado excesivo", this.nivel+cantidad);
		else this.nivel=this.nivel+cantidad;
	}
	
	
	
	
	
	
	
	
}
