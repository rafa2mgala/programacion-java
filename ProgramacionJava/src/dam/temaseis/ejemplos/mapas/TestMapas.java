package dam.temaseis.ejemplos.mapas;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.TreeMap;

import dam.temaseis.collection.Empleado;
/**
 * Ejemplos de mapas. Estas estructuras de datos son útiles cuando se
 * debe acceder al conjunto de elementos a partir de una clave única, el acceso es
 * muy rápido.
 * @author rafa
 * @version 1.0
 */
public class TestMapas {
	public static void main(String[] args) {

		
		Empleado[] plantilla = new Empleado[10];
		Object[] objetos = plantilla;
		objetos[0] = LocalDate.now();

		
		
		
		//mapa de empleados, la clave es el NIF de los mismos
		HashMap<String,Empleado> hashMap = 
				new HashMap<String,Empleado>();
		Empleado empleado1 = new Empleado("Rafa","88845678A");
		Empleado empleado2 = new Empleado("Antonio","55545678A");
		Empleado empleado3 = new Empleado("Almudena","22245678A");
		hashMap.put(empleado1.getNif(), empleado1);
		hashMap.put(empleado2.getNif(), empleado2);
		hashMap.put(empleado3.getNif(), empleado3);
		//El HashMap no implementa la interfaz Iterator, por eso no tiene el método hasNext()
		//while(hashMap.hasNext())

		//Por el mismo motivo tampoco se puden recorrer sus elementos con un 'foreach'
		//for(Empleado e:hashMap)

		//Para recorrerlo se puede obtener un iterador o recorrerlo por el conjunto de claves
		//Obteniendo un iterador
		System.out.println("Recorriendo un mapa con un iterador:");
		Iterator it = hashMap.keySet().iterator();
		while(it.hasNext())
			System.out.println(hashMap.get(it.toString()));

		//Utilizando el conjunto de claves
		System.out.println("Recorriendo un mapa usando las claves:");
		for(String key:hashMap.keySet())
			System.out.println(hashMap.get(key));

		//LinkedHashMap es igual que HashMap pero los datos se almacenan internamente
		//en una lista enlazada
		LinkedHashMap<String,Empleado> lhm = new LinkedHashMap<String,Empleado>();
		lhm.put(empleado1.getNif(), empleado1);
		lhm.put(empleado2.getNif(), empleado2);
		lhm.put(empleado3.getNif(), empleado3);

		//para recorrer el LHM tenemos las mismas posibilidades que con HashMap
		System.out.println("Recorriendo un LHM usando las claves:");
		for(String key:lhm.keySet())
			System.out.println(lhm.get(key));

		//TreeMap es igual que HashMap pero los datos se almacenan internamente
		//en un arbol binario
		TreeMap<String,Empleado> tm = new TreeMap<String,Empleado>();
		tm.put(empleado1.getNif(), empleado1);
		tm.put(empleado2.getNif(), empleado2);
		tm.put(empleado3.getNif(), empleado3);

		//para recorrer el LHM tenemos las mismas posibilidades que con HashMap
		System.out.println("Recorriendo un TM usando las claves:");
		for(String key:tm.keySet())
			System.out.println(lhm.get(key));
		
		//Entonces ¿qué mapa debo utilizar? Consulta el tema 6 en el que se indican
		//las características y diferencias entre listas y árboles
	}

}
