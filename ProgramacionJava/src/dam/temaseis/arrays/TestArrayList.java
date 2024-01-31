package dam.temaseis.arrays;

import java.util.ArrayList;

public class TestArrayList {

	public static void main(String[] args) {
		boolean encontrado = false;
		int contador = 0;
		ArrayList<Integer> lista = new ArrayList<Integer>();
		
		for(int i=0;i<10;i++)
			lista.add(i);		

		//probamos que una vez construida la lista no se puede modificar
		//el número de elementos
		while(contador<lista.size()) {
			System.out.println(lista.get(contador));
			
			if(lista.get(contador)>0 && lista.get(contador)%2==0) {
				encontrado=true;
				//dará una excepción debido a que no se utiliza un iterador
				//y no se puede modificar el número de elementos de la lista
				lista.set(contador, contador*4);
				lista.add(3,contador+3);
				//eliminar usando un objeto
				Integer cero = new Integer(0);
				lista.remove(cero);
			}			
			contador++;
		}
		//aquí si se puede eliminar un elemento de la lista
		lista.remove(contador);
	}

}
