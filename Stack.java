/**
 * Clase Stack
 * @author Carlos_Edgardo_Lopez_Barrera
 * @version 1.0 19.02.2022
 *
 * En esta clase se implementa la interfaz IStack, y se define lo que hará cada método. 
 */

import java.util.ArrayList;
/**
 *
 *
 */
public class Stack<T> implements IStack<T> {
	/**
    *
    */
	
	//Instancia lista.
	private ArrayList<T> lista;
	
	/**
     * Constructor
     */
	public Stack() {
		lista = new ArrayList<T>();
	}
	
	/**
     * Metodo push: sirve para insertar el valor proporcionado en la parte superior de la pila,
     * en el caso de la lista, es en la posicion 0.
     * Pre: Recibe un valor para insertarlo.
     * Post: Lo inserta en la posicion 0.
     * @param value: (T)
     * 
     */
	@Override
	public void push(T value) {		
		lista.add(0, value);
	}

	/**
     * Metodo pull: sirve para extraer el valor que se encuentra en la parte superior de la pila.
     * Pre: No recibe ningun valor.
     * Post: retorna lo que se removió.
     * @return lista.remove(0): (int)
     * 
     */
	@Override
	public T pull() {
		return lista.remove(0);
	}

	/**
     * Metodo peek: sirve para obtener el valor que se encuentra en la parte superior de la pila
     * Pre: No recibe ningun valor.
     * Post: retorna el valor encontrado en dicha posicion.
     * @return lista.get(0): (int)
     * 
     */
	@Override
	public T peek() {
		return lista.get(0);
	}

	/**
     * Metodo count: sirve para evaluar el numero de elementos en el instante que hay en la pila.
     * Pre: No recibe ningun valor.
     * Post: retorna el numero de posiciones halladas.
     * @return lista.size(): (int)
     * 
     */
	@Override
	public int count() {
		return lista.size();
	}

	/**
     * Metodo isEmpty: sirve para evalua si la pila esta vacía.
     * Pre: No recibe ningun valor.
     * Post: retorna un booleano dependiendo de si esta vacia o no, vacia = true, no vacia = false.
     * @return lista.isEmpty(): (boolean)
     * 
     */
	@Override
	public boolean isEmpty() {		
		return lista.isEmpty();
	}

}
