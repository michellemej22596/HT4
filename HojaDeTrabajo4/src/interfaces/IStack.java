/**
*
* @author Michelle
*/
package interfaces;

public interface IStack<T> {

	/***
	 * 
	 * @return takes out the last item on the stack.
	 */
	public T pop();
	
	/***
	 * 
	 * @param add an item to the stack.
	 */
	public void push(T item);
	
	/***
	 * 
	 * @return last item on the stack.
	 */
	public T peek();
	
	/***
	 * 
	 * @return the length of the stack. 
	 */
	public int size();

	
	
}