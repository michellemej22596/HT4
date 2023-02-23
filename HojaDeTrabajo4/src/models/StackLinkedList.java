/***
	    	 * Algoritmos y Estructura de datos
	    	 * Michelle Mejia 22596
	    	 *Lógica de Stack implementando LinkedList.
	    	 */

package models;

import interfaces.IStack;

public class StackLinkedList<T> implements IStack<T>{
	list<T> list1 = new list<>();
	int i=0;
	

	/***
	 * 
	 * @return takes out the last item on the stack.
	 */
	public T pop() {
		list1.remove(null);
		return null;
	}
	
	/***
	 * 
	 * @param add an item to the stack.
	 */
	public void push(T item) {
		list1.add(i, item);
	}

	/***
	 * 
	 * @return last item on the stack.
	 */
	public T peek() {
		return null;
	}

	/***
	 * @return the size of the stack.
	 */
	public int size() {
		return 0;
	}
	
}
