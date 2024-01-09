package dam.temacuatro.claseinterna;

public class Contenedora {
	private int i=1;
	private static int k;
	public Contenedora(int i)
	{ 
		this.i=i;
	}
	public void testInternaAnonima(final String valor) {
		//clase interna anónima
		Comparable evento = new Comparable() {			
			@Override
			public int compareTo(Object arg0) {	
				return arg0.toString().compareTo(valor);
			}		
		};
		System.out.println(evento.compareTo("Java"));
	}
	public void printContenedora (InternaMiembro interna)
	{
		//acceso a un miembro de la clase interna
		System.out.println("i=" + i + "claseInterna.j=" + interna.j);
	}
	/**
	 * Clase interna miembro
	 * @author rafa
	 * @version 1.0
	 */
	protected class InternaMiembro
	{
		private int j=2;
		public InternaMiembro(int j)
		{
			this.j=j;
		}
		public void printInterna ()
		{
			//acceso a una propiedad miembro de la clase contenedora
			System.out.println("i=" + i + "j=" + j);
		}
	}
	/**
	 * Clase interna estática
	 * @author rafa
	 * @version 1.0
	 */
	protected static class EstaticaInterna{
		public static void inicio (int k)
		{
			Contenedora.k = k;
		}
	}

}
