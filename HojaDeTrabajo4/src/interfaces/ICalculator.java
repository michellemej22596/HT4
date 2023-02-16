/**
*

* @author Michelle
*/
package interfaces;

public interface ICalculator {
	
	/***
	 * @param numbers to add. 
	 * @return result
	 */
	 public float add(float a, float b);
	 
	 /***
		 * @param numbers to subtract. 
		 * @return result
		 */
	 float subtraction(float a, float b);
	 
	 /***
		 * @param numbers to multiply
		 * @return result
		 */
	 float multiplication(float a, float b);
	 
	 /***
		 * @param numbers to divide.
		 * @return result
		 */
	 float division(float a, float b);
	 
	 /***
	  	 * 
		 */
	 void getNextImput();

}

