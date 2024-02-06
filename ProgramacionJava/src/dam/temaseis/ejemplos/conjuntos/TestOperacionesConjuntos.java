package dam.temaseis.ejemplos.conjuntos;

import java.util.LinkedHashSet;
import java.util.TreeSet;
/**
 * Ejemplo de operaciones entre conjuntos: unión, diferencia e intersección
 * @author rafa
 * @version 1.0
 */
public class TestOperacionesConjuntos {
	private TreeSet<Integer> treeSet;
	private LinkedHashSet<Integer> linkedHashSet;
	public static void main(String[] args) {
		TestOperacionesConjuntos toc = new TestOperacionesConjuntos();
		// Elementos del conjunto A: 9, 19, 5 y 7
		toc.treeSet= new TreeSet<Integer>();
		toc.treeSet.add(9); 
		toc.treeSet.add(19); 
		toc.treeSet.add(5); 
		toc.treeSet.add(7); 

		// Elementos del conjunto B: 10, 20, 5 y 7
		toc.linkedHashSet= new LinkedHashSet<Integer>();
		toc.linkedHashSet.add(10); 
		toc.linkedHashSet.add(20); 
		toc.linkedHashSet.add(5); 
		toc.linkedHashSet.add(7); 

		//Unión de conjuntos: A con B, no hay repetición los elementos
		//del conjunto resultante,el conjunto está ordenado porque
		//el resultado se almacena en un TreeSet
		toc.union();

		//Diferencia de conjuntos: A con B, no hay repetición los elementos
		//del conjunto resultante,el conjunto está ordenado porque
		//el resultado se almacena en un TreeSet. El conjunto resultante
		//contiene los elementos de A que no están en B
		toc.diferencia();
		
		//Intersección de conjuntos: A con B, no hay repetición los elementos
		//del conjunto resultante,el conjunto está ordenado porque
		//el resultado se almacena en un TreeSet. El conjunto resultante
		//contiene los elementos comunes entre A y B
		toc.interseccion();
	}
	/**
	 * Unión de A con B
	 */
	public void union() {
		//se clona el conjunto A para no modificar el conjunto original
		//se trabaja con el clonado de A
		TreeSet<Integer> clonA = (TreeSet<Integer>) this.treeSet.clone();
		clonA.addAll(linkedHashSet);
		System.out.println("El resultado de la unión A con B es:");
		for(Integer num:clonA)
			System.out.println(num);
	}
	/**
	 * Diferencia de A con B
	 */
	public void diferencia() {
		//se clona el conjunto A para no modificar el conjunto original
		//se trabaja con el clonado de A
		TreeSet<Integer> clonA = (TreeSet<Integer>) this.treeSet.clone();
		clonA.removeAll(linkedHashSet);
		System.out.println("El resultado de la diferencia A con B es:");
		for(Integer num:clonA)
			System.out.println(num);
	}
	/**
	 * Intersección de A con B
	 */
	public void interseccion() {
		//se clona el conjunto A para no modificar el conjunto original
		//se trabaja con el clonado de A
		TreeSet<Integer> clonA = (TreeSet<Integer>) this.treeSet.clone();
		clonA.retainAll(linkedHashSet);
		System.out.println("El resultado de la intersección A con B es:");
		for(Integer num:clonA)
			System.out.println(num);
	}
}
