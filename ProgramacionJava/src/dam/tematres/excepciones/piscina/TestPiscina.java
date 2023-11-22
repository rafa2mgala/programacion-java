package dam.tematres.excepciones.piscina;
/**
 * Solución propuesta a la actividad 3.17
 * Ejemplo de excepción controlada para gestionar
 * el llenado de una piscina
 * @author rafa
 * @version 1.0
 */
public class TestPiscina {
	public static void operacionesPiscina(Piscina piscina)
	{
		try
		{
			for (int i=1;i<=3;i++)
			{
				piscina.llenar((int)(Math.random()*100));
				System.out.println ("llenado..." + piscina.getNivel());
				piscina.vaciar((int)(Math.random()*100));
				System.out.println ("vaciado..." + piscina.getNivel());
			}
		}
		catch (NivelPiscinaException e)
		{
			System.out.println(e.toString() + ' ' + e);
		}
		System.out.println("El nivel de la piscina es..." + piscina.getNivel());
	}
	public static void main (String [] args)
	{
		Piscina piscina = new Piscina(100);
		TestPiscina.operacionesPiscina(piscina);
	}

}

