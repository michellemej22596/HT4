/***
	    	 * Algoritmos y Estructura de datos
	    	 * Michelle Mejía 22596
	    	 *Lógica de Stack implementando ArrayList.
	    	 */

package models;
import java.util.ArrayList;
import interfaces.IStack;

public class StackArrayList<T> implements IStack<T>{
	
	ArrayList<T> items = new ArrayList<T>();
	int i=-1;

	/***
	 * 
	 * @return takes out the last item on the stack.
	 */
	public T pop() {
		try {
		T x= items.get(i);
		items.remove(i);
		i=i-1;
		return x;
		}
		catch(Exception e) {
			System.out.println("Existen más operadores que operandos");
		}
		return null;
	}
	
	/***
	 * 
	 * @param add an item to the stack.
	 */
	public void push(T item) {
		items.add(item);
		i++;
	}

	/***
	 * 
	 * @return last item on the stack.
	 */
	public T peek() {
		System.out.println(items);
		return items.get(i);
	}

	/***
	 * @return the size of the stack.
	 */
	public int size() {
		return items.size();
	}
	
}
