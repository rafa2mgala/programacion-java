package dam.temacuatro.inmutable;

import java.awt.Point;
/**
 * Clase que representa a un círculo cuyas características no se pueden
 * modificar, por lo que se considera inmutable
 * @author rafa
 * @version 1.0
 */
public final class CirculoInmutable { //regla 3. clase 'final'
	private Point center; //reglas 2 y 3
	private double radius; // reglas 2 y 3
	public CirculoInmutable(Point point, double radius) {
		this.center = new Point(point.x,point.y); // regla 4, copia defensiva
		this.radius=radius; // no es una referencia, no hay problema.
	}
	public Point getCenter() {
		return new Point(center.x, center.y); // regla 5, copia defensiva
	}
	public Point replacePointCoor(int xCor, int yCor) {
		return new Point(xCor,yCor);
	}
	public double getRadius() { return radius; }

	// regla 1: no hay setters
}
