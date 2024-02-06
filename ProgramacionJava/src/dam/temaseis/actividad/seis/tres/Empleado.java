package dam.temaseis.actividad.seis.tres;

import java.time.LocalDate;
import java.util.Comparator;

import org.eclipse.jdt.annotation.NonNull;
/**
 * Solución propuesta a la actividad 6.3
 * @author Rafa
 * @version 1.0
 */
public class Empleado implements Comparator, Comparable{
	private String nombre;
	private String nif;
	private long telefono;
	private int edad;
	private LocalDate fechaAlta;
	
	public Empleado(String nombre, String nif, int edad,
			long telefono, LocalDate fechaAlta) {	
		this.nombre = nombre;
		this.nif = nif;
		this.edad = edad;
		this.fechaAlta = fechaAlta;
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
	public long getTelefono() {
		return telefono;
	}

	public void setTelefono(long telefono) {
		this.telefono = telefono;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public LocalDate getFechaAlta() {
		return fechaAlta;
	}

	public void setFechaAlta(LocalDate fechaAlta) {
		this.fechaAlta = fechaAlta;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return new Empleado(this.nombre, this.nif, this.edad, this.telefono,this.fechaAlta);
	}

	@Override
	public int compare(@NonNull Object arg0, @NonNull Object arg1) {
		return ((Empleado)arg0).nif.compareTo(((Empleado)arg1).nif);
	}

	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", nif=" + nif + ", telefono=" + telefono + ", edad=" + edad
				+ ", fechaAlta=" + fechaAlta + "]";
	}

	@Override
	public int compareTo(Object arg0) {
		return this.compare(this, arg0);
	}
}
