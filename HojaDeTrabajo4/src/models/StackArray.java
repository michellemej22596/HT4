package models;
import interfaces.IStack;

public class StackArray<T> implements IStack<T>{
	 T[] items=(T[]) new Object[10];
	 int i=-1;

	/***
	 * 
	 * @return takes out the last item on the stack.
	 */
	public T pop() {
		
		try {
		
			for(int j=items.length; j>0; j--){
	            items[j-1]= items[j];
	        }   
			 i--;
			return items[i];
			
		}catch(Exception e) {
			
			System.out.println("Existen más operadores que operandos");
	}
		
	return null;
		
	}
	
	/***
	 * 
	 * @param add an item to the stack.
	 */
	public void push(T item) {
		
		 if(i>10){
	            throw (new IndexOutOfBoundsException());
	        }else{
	        	i++;
	            items[i]=item;
	        }
	}

	/***
	 * 
	 * @return last item on the stack.
	 */
	public T peek() {
		return items[i];
	}

	/***
	 * @return the size of the stack.
	 */
	public int size() {
		return items.length;
	}
	
}
