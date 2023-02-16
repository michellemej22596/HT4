package models;
import java.util.LinkedList;
import java.util.List;

import interfaces.IStack;

public class StackLinkedList<T> implements IStack<T>{
	List<T> items = new LinkedList();
	

	/***
	 * 
	 * @return takes out the last item on the stack.
	 */
	public T pop() {
		return null;
	}
	
	/***
	 * 
	 * @param add an item to the stack.
	 */
	public void push(T item) {
		
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
