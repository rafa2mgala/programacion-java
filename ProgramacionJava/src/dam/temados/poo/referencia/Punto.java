package dam.temados.poo.referencia;

public class Punto {
	//xCoor es la coordenada en X del punto
	//yCoor es la coordenada en Y del punto
	private int xCoor,yCoor;
	//constructor por defecto
	public Punto() {}
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
