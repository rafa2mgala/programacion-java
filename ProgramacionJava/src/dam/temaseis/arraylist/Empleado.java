package dam.temaseis.arraylist;

import java.util.Comparator;

import org.eclipse.jdt.annotation.NonNull;

public class Empleado implements Comparator{
	private String nombre;
	private String nif;
	public Empleado(String nombre, String nif) {	
		this.nombre = nombre;
		this.nif = nif;
	}
	
	@Override
	public boolean equals(Object obj) {
		//nulidad
		if(obj==null) return false;
		//el tipo
		if(!(obj instanceof Empleado)) return false;
		//comparo por nif
		if(this.nif.equals(((Empleado)obj).nif)) return true;
		return false;
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getNif() {
		return nif;
	}
	public void setNif(String nif) {
		this.nif = nif;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return new Empleado(this.nombre,this.nif);
	}

	@Override
	public int compare(@NonNull Object arg0, @NonNull Object arg1) {
		return ((Empleado)arg0).nif.compareTo(((Empleado)arg1).nif);
	}

	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", nif=" + nif + "]";
	}	
}
