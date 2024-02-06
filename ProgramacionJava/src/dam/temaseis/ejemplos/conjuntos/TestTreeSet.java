package dam.temaseis.ejemplos.conjuntos;

import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;
/**
 * Ejemplo de conjunto de tipo árbol binario, los elementos del árbol
 * se recorren in-orden por lo que se muestran ordenados ascendentemente
 * por valor
 * @author rafa
 * @version 1.0
 */
public class TestTreeSet {
	public static void main(String[] args) {
		TreeSet <Integer> t;
		t=new TreeSet<Integer>();     
		t.add(4);
		t.add(3);
		t.add(1);
		t.add(99);
		//No se admiten valores duplicados, no se añaden
		t.add(99);
		
		//el resultado sale ordenado por valor:1 3 4 99
		for (Integer i:t)
		   System.out.println(i);
		System.out.println("Se muestran los valores del conjunto ordenados descendentemente");
		Iterator desIt = t.descendingIterator();
		while(desIt.hasNext())
			System.out.println(desIt.next());
		
		//se obtiene el valor mayor que uno dado
		System.out.println("El valor mayor al indicado es:" +t.ceiling(44));
		
		System.out.println("Subconjunto de valores  menores a uno dado");
		//se obtiene un subconjunto de valores inferiores al indicado
		SortedSet<Integer> subSet = t.headSet(50);
		for(Integer integer:subSet)
			System.out.println(integer);
	}
}
