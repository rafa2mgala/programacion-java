package dam.temaseis.ejemplos.listas;

public class DamArrayList {
	private Object[] items;
	private int last;
	public DamArrayList() {
		this.items = new Object[100];
	}
	public Object get(int index) {
		return this.items[index];
	}
	public boolean add(Object object) {
		//comprobar si todos los elementos de items son
		//distinto de nulos, significa que está lleno
		//si está lleno tendré que redimensionar el array
		//una vez redimensionado añado el elemento y
		//devuelvo true
		
		//si no está lleno, lo pongo en la última posición
		this.items[this.last]=object;			
		this.last++;
		return true;
	}
	public boolean isEmpty() {
		boolean noNull=false;
		//comprobar si todos los elementos del array son nulos
		int i=0;
		while(i<this.items.length && !noNull) {
			if(this.items[i]!=null)
				noNull=true;
			i++;
		}
		return !noNull;
	}
}
