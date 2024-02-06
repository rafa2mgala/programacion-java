package dam.temaseis.actividad.seis.dos;

import java.util.Comparator;
/**
 * Solución propuesta a la actividad 6.2
 * @author Rafa
 * @version 1.0
 */
public class ComparadorBarco implements Comparator<Barco> {
	public static final int COMPARAR_ESTADO_BARCO=100;
	public static final int COMPARAR_TAMANIO_BARCO=101;
	public static final int COMPARAR_COOR_BARCO=102;
	private int compararCon;

	public ComparadorBarco(int compararCon) {
		this.compararCon = compararCon;
	}
	@Override
	public int compare(Barco barcoUno, Barco barcoDos) {
		switch(compararCon) {
		case ComparadorBarco.COMPARAR_ESTADO_BARCO:
			if(((Barco)barcoUno).getEstado()==((Barco)barcoDos).getEstado())
				return 0;
			if(((Barco)barcoUno).getEstado() instanceof EstadoNoTocado &&
				(((Barco)barcoDos).getEstado() instanceof EstadoTocado ||
						((Barco)barcoDos).getEstado() instanceof EstadoHundido))
				return -1;
			if(((Barco)barcoDos).getEstado() instanceof EstadoNoTocado &&
					(((Barco)barcoUno).getEstado() instanceof EstadoTocado ||
							((Barco)barcoUno).getEstado() instanceof EstadoHundido))
				return 1;

		case ComparadorBarco.COMPARAR_TAMANIO_BARCO:
			return ((Barco)barcoUno).compareTo(barcoDos);
		default:
			return ((Barco)barcoUno).compareTo(barcoDos);
		}
	}
}
