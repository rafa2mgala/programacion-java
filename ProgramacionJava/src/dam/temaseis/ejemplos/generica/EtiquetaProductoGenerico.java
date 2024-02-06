package dam.temaseis.ejemplos.generica;

import java.util.ArrayList;

/**
 * Ejemplo de programación genérica usando el tipo E en la
 * clase EtiquetaProductoGenerico, esta clase es la misma
 * que EtiquetaProducto
 * El tipo E se refiere al tipo de datos de un conjunto,lista, array,etc
 * @author rafa
 * @param <E>
 * @version 1.0
 */
public class EtiquetaProductoGenerico<E>{
	public void imprimir(E[] codigos) {		
		for(E codigo:codigos)
			System.out.println(codigo);
	}
}