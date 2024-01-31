package dam.temaseis.collection;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class DamQueue<Empleado> implements Queue<Empleado> {
	private LinkedList linkedList;
	@Override
	public boolean addAll(Collection<? extends Empleado> arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void clear() {
		this.linkedList.clear();
	}

	@Override
	public boolean contains(Object arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean containsAll(Collection<?> arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterator<Empleado> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean remove(Object arg0) {
		//antes de eliminar un empleado es neceario
		//hacer un registro en el libro de operaciones de recursos
		//humanos
		this.linkedList.remove(arg0);
		return false;
	}

	@Override
	public boolean removeAll(Collection<?> arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean retainAll(Collection<?> arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Object[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T> T[] toArray(T[] arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean add(Empleado arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Empleado element() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean offer(Empleado arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Empleado peek() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Empleado poll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Empleado remove() {
		// TODO Auto-generated method stub
		return null;
	}

}
