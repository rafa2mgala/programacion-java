package dam.temaseis.collection;

import java.util.Comparator;
import java.util.Objects;

public class Empleado implements Comparable, Comparator{
	public static final int NIF=0;
	public static final int NOMBRE=1;
	private String nombre;
	private String nif;
	public Empleado(String nombre, String nif) {	
		this.nombre = nombre;
		this.nif = nif;
	}	
	@Override
	public int hashCode() {
		return Objects.hash(nif, nombre);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Empleado other = (Empleado) obj;
		return Objects.equals(nif, other.nif) && Objects.equals(nombre, other.nombre);
	}
	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", nif=" + nif + "]";
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
	public int compare(Object arg0, Object arg1) {
		Empleado e1,e2;
		if(arg0==null || arg1==null)
			throw new NullPointerException();
		if(!(arg0 instanceof Empleado) || !(arg1 instanceof Empleado))
			throw new ClassCastException();
		e1 = (Empleado)arg0;
		e2 = (Empleado)arg1;
		return e1.getNif().compareTo(e2.getNif());
	}
	@Override
	public int compareTo(Object arg0) {		
		return this.compare(this, arg0);
	}
}
