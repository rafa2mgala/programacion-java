package dam.temacuatro.interfaces;

import java.awt.Canvas;

public class TestInterfaz {

	public static void main(String[] args) {
		Canvas canvas = new Canvas();
		MiLienzo lienzo = new MiLienzo();
		Dibujable figura =new Circulo();
		lienzo.setFigura(figura);
		lienzo.dibujar(canvas);
		TestInterfaz ti = new TestInterfaz();
		figura = new Cuadrado();
		ti.dibujar(figura);
	}
	
	public void dibujar(Dibujable figura) {
		
	}
}
