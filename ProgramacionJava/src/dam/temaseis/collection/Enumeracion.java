package dam.temaseis.collection;

import java.util.Enumeration;
import java.util.LinkedList;
import java.util.NoSuchElementException;

public class Enumeracion<T> implements Enumeration<Empleado> {
	private LinkedList<Empleado> linkedList;
	private int pos;
	public Enumeracion() {
		this.linkedList = new LinkedList<Empleado>();
		this.pos = 0;
	}
	public boolean addElement(Empleado empleado) {
		return this.linkedList.add(empleado);
	}
	public boolean removeElement(Empleado empleado) {
		return this.linkedList.remove(empleado);
	}
	@Override
	public boolean hasMoreElements() {		
		return this.pos < (this.linkedList.size()-1);
	}

	@Override
	public Empleado nextElement() {		
		if(pos>=this.linkedList.size())
			throw new NoSuchElementException();
		return this.linkedList.get(pos++);
	}
}
