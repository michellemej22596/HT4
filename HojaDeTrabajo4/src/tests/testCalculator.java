package tests;
import junit.framework.TestCase;
import models.Calculator;

public class testCalculator extends TestCase {

	private Calculator calculator;
	
	/***
	 * Tries different scenarios with the calculator methods.
	 */
	
	public void scenario() {
		calculator = new Calculator();
	}
	
	public void testAdd() {
		scenario();
		assertTrue(calculator.add(2,2)==(2+2));
	}
	
	public void testSubtraction() {
		scenario();
		assertTrue(calculator.subtraction(2,2)==(2-2));
	}
	
	public void testMultiplicacion() {
		scenario();
		assertTrue(calculator.multiplication(2,2)==(2*2));
	}
	
	public void testDivision() {
		scenario();
		assertTrue(calculator.division(2,2)==(2/2));
	}
	
	public void testDivisionByZeroEqualsZero() {
		scenario();
		assertTrue(calculator.division(2,0)==(0));
	}
	
	
}
