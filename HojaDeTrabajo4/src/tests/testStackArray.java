package tests;
import junit.framework.TestCase;
import models.Calculator;
import models.StackArray;

public class testStackArray extends TestCase{
	StackArray<Float> stackList = new StackArray<Float>();
	Calculator calculator = new Calculator();
	
	/***
	 * Pushes an item to the stack, calculates the addition and finally peeks for the answer.
	 */
	public void testPushItemCalculatedAndPeek() {
		stackList.push(calculator.add(1,2));
		assertTrue(stackList.peek()==3);
		}
	
	/***
	 * Pops the last and only item on the stack, checks if the size equals 0.
	 */
	public void testPopItemAndSizeOfArray() {
		stackList.pop();
		assertTrue(stackList.size()==10);
	}
	
	/***
	 * Tries to pop when the stack is empty, returns null.
	 */
	public void testPopWhenZeroItemsReturnsNull() {
		assertTrue(stackList.pop()==null);
		}
	
	
	
}
