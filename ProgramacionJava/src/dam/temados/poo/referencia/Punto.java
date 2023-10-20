package dam.temados.poo.referencia;
/**
 * Ejemplos del uso de this. Distintos constructores
 * en un tipo de datos
 */
public class Punto {
	//xCoor es la coordenada en X del punto
	//yCoor es la coordenada en Y del punto
	private int xCoor,yCoor;
	private static int numPuntos;
	//constructor por defecto
	public Punto() {
		Punto.numPuntos=0;
	}
	/**
	 * Constructor específico para crear un punto
	 * con sus coordenadas x e y 
	 * @param xCoor Es un entero que representa la coordenada
	 * en X del punto
	 * @param yCoor Es un entero que representa la coordenada
	 * en Y del punto
	 */
	public Punto(int xCoor, int yCoor) {
		this.setX(xCoor);
		this.yCoor = yCoor;			
	}
	public Punto(int xCoor) {
		this.setX(xCoor);
	}
	//implementando encapsulación
	public void setX(int xCoor) {
		this.xCoor = xCoor+2;
	}
	public void setY(int yCoor) {
		this.yCoor = yCoor;
	}
	public int getX() {
		return this.xCoor;
	}
	public void setPunto(Punto punto) {
		punto.setX(2);
	}
}
