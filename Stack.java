/**
 * 
 */

import java.util.ArrayList;
/**
 *
 *
 */
public class Stack<T> implements IStack<T> {

	private ArrayList<T> lista;
	
	public Stack() {
		lista = new ArrayList<T>();
	}
	
	@Override
	public void push(T value) {		
		lista.add(0, value);
	}

	@Override
	public T pull() {
		return lista.remove(0);
	}

	@Override
	public T peek() {
		return lista.get(0);
	}

	@Override
	public int count() {
		return lista.size();
	}

	@Override
	public boolean isEmpty() {		
		return lista.isEmpty();
	}

}
