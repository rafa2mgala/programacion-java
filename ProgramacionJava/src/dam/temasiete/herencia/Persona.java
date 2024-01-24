package dam.temasiete.herencia;

public abstract class Persona {
	private String nombre;
	private int edad;
	protected String nif;
	
	//método abstracto que deben implementar las clases derivadas
	public abstract void setNif(String nif);
	
	public Persona(String nombre, int edad, String nif) {
		this.edad = edad;
		this.nombre = nombre;
		this.nif = nif;
	}

	protected int getEdad() {
		return edad;
	}

	protected void setEdad(int edad) {
		this.edad = edad;
	}
	@Override
	public boolean equals(Object obj) {
		//comprobar la nulidad
		if(obj==null) return false;
		//comprobar la identidad
		if(obj==this) return true;				
		//comprobación de tipos
		if(obj instanceof Persona) {
			return ((Persona)obj).nif.equals(this.nif);
		}
		return false;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + ", nif=" + nif + "]";
	}
}
