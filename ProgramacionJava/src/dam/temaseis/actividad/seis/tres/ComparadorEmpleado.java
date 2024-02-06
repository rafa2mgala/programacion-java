package dam.temaseis.actividad.seis.tres;

import java.util.Comparator;
/**
 * Solución propuesta a la actividad 6.3
 * @author Rafa
 * @version 1.0
 */
public class ComparadorEmpleado implements Comparator<Empleado>{
	public static final int NOMBRE=0;
	public static final int NIF=1;
	public static final int EDAD=2;
	public static final int FECHA_ALTA=3;
	public static final int TELEFONO=4;
	public static final int ASC=1;
	public static final int DESC=-1;
	private int campoComparacion;
	private int ascDesc;
	public ComparadorEmpleado(int campoComparacion, int ascDesc) {
		this.campoComparacion = campoComparacion;
		this.ascDesc = ascDesc;
	}
	@Override
	public int compare(Empleado arg0, Empleado arg1) {
		switch(this.campoComparacion) {
		case NOMBRE:
			return arg0.getNombre().compareTo(arg1.getNombre()) * this.ascDesc ;
		case NIF:
			return arg0.getNif().compareTo(arg1.getNif())* this.ascDesc;
		case EDAD:
			if(arg0.getEdad()>arg1.getEdad())
				return 1* this.ascDesc;
			else if(arg0.getEdad()<arg1.getEdad())
				return -1* this.ascDesc;
			return 0;
		case FECHA_ALTA:
			return arg0.getFechaAlta().compareTo(arg1.getFechaAlta())* this.ascDesc;
		case TELEFONO:
			if(arg0.getTelefono()>arg1.getTelefono())
				return 1* this.ascDesc;
			else if(arg0.getTelefono()<arg1.getTelefono())
				return -1* this.ascDesc;
			return 0;
		default:
			return arg0.getNif().compareTo(arg1.getNif())* this.ascDesc;
		}
	}

}
