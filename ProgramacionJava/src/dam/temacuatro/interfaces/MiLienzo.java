package dam.temacuatro.interfaces;

import java.awt.Canvas;

public class MiLienzo implements Dibujable{
	private Canvas lienzo;
    private Dibujable figura;
    public void setFigura(Dibujable figura) {
    	this.figura = figura;
    }
	@Override
	public void dibujar(Canvas lienzo) {		
		figura.dibujar(lienzo);
	}
}
