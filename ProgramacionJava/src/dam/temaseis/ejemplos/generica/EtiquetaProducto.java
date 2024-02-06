package dam.temaseis.ejemplos.generica;

import java.util.ArrayList;

/**
 * Ejemplo de la clase EtiquetaProducto sin usar programación genérica
 * @author rafa
 * @version 1.0
 */
public class EtiquetaProducto {
	public void imprimirEan(CodigoEan[] codigos) {
		for(CodigoEan codigo:codigos)
			System.out.println(codigo);
	}
	public void imprimirC128(CodigoC128[] codigos) {
		for(CodigoC128 codigo:codigos)
			System.out.println(codigo);
	}
	public void imprimirQr(CodigoQr[] codigos) {
		for(CodigoQr codigo:codigos)
			System.out.println(codigo);
	}
}
