package dam.temacuatro.inmutable;

import java.awt.Point;
/**
 * Clase para probar la mutabilidad o inmutabilidad de otras clases
 * @author rafa 
 * @version 1.0
 */
public class TestInmutable {
	public static void main(String[] args) {
		String datoOriginal="Java";
		Integer numOriginal = 100;
		StringBuffer sb = new StringBuffer("Java");
		TestInmutable ti = new TestInmutable();
		ti.pruebaInmutable(datoOriginal,numOriginal);
		//como es inmutable mostrará el valor original
		System.out.println(datoOriginal);
		
		ti.pruebaMutable(sb);
		//como es mutable la cadena del StringBuffer cambia su valor
		System.out.println(datoOriginal + "," + numOriginal + ", " + sb);
		
		CirculoInmutable circuloInmutable = new CirculoInmutable(new Point(5,5),100);
		circuloInmutable.replacePointCoor(10, 10);
		//como el círculo es inmutable no se modificarán sus propiedades
		System.out.println("x=" + 
				circuloInmutable.getCenter().getX() + 
				", y=" + circuloInmutable.getCenter().getY());
	}

	private void pruebaInmutable(String dato, Integer num) {
		dato.replace("Java","C++");
		num = 200;
	}
	private void pruebaMutable(StringBuffer dato) {
		dato.replace(0, dato.length(), "C++");
	}
	
	private void pruebaInMutable(CirculoInmutable circuloInmutable) {
		circuloInmutable.replacePointCoor(10, 20);
	}
}
