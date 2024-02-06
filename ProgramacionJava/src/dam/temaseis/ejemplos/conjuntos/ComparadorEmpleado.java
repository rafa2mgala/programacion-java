package dam.temaseis.ejemplos.conjuntos;

import java.util.Comparator;

public class ComparadorEmpleado implements Comparator<Empleado>{
	private Integer[] campoComparacion;
	
	public ComparadorEmpleado(Integer... campoComparacion) {
		this.campoComparacion = campoComparacion;
	}
	/**
	 * Factory Method
	 * @param campoComparacion
	 * @return
	 */
	public static ComparadorEmpleado getInstance(Integer... campoComparacion) {
		if(campoComparacion.length==0) return null;
		return new ComparadorEmpleado(campoComparacion);
	}
	
	@Override
	public int compare(Empleado arg0, Empleado arg1) {		
		return 0;
	}
}
