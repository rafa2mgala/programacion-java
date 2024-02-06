package dam.temaseis.actividad.seis.dos;

import java.util.Comparator;
/**
 * Solución propuesta a la actividad 6.2
 * @author Rafa
 * @version 1.0
 */
public class Coordenada implements Comparator<Coordenada>, Comparable<Coordenada>{
	private int coorX;
	private int coorY;
	public Coordenada(int coorX, int coorY) {
		this.coorX = coorX;
		this.coorY = coorY;
	}
	public int getCoorX() {
		return coorX;
	}
	public int getCoorY() {
		return coorY;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Coordenada other = (Coordenada) obj;
		return coorX == other.coorX && coorY == other.coorY;
	}
	@Override
	public int compare(Coordenada coordenadaUno, Coordenada coordenadaDos) {
		if(coordenadaUno.getCoorX()>
		coordenadaDos.getCoorX() ||
		(coordenadaUno.getCoorX()==coordenadaDos.getCoorX() &&
		coordenadaUno.getCoorY()>coordenadaDos.getCoorY())){
			return 1;
		}else if(coordenadaDos.getCoorX()>
		coordenadaUno.getCoorX() ||
		(coordenadaDos.getCoorX()==coordenadaUno.getCoorX() &&
		coordenadaDos.getCoorY()>coordenadaUno.getCoorY())) {
			return -1;
		}
		return 0;
	}
	@Override
	public int compareTo(Coordenada arg0) {
		return compare(this,arg0);
	}
	@Override
	public String toString() {
		return "Coordenada [coorX=" + coorX + ", coorY=" + coorY + "]";
	}
}
