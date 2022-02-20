/**
 * Clase IStack
 * @author  moises.alonso
 *
 * Interfaz que muestra los métodos a utilizar y a implementar que simularan la pila.
 */

public interface IStack<T> {

	//Inserta el valor que se le proporciona en la parte superior de la pila.
	void push(T value);
	
	//Extrae el valor que se encuentra en la parte superior de la pila
	T pull();
	
	//Obtiene el valor que se encuentra en la parte superior de la pila
	T peek();
	
	//Evalua el numero de elementos en el instante que se ejecuta de la pila
	int count();
	
	//Evalua si la pila esta vacía
	boolean isEmpty();
}
