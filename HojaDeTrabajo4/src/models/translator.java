/***
	    	 * Algoritmos y Estructura de datos
	    	 * Michelle Mejía 22596
	    	 * Clase traductor, se encarga de pasar las operaciones encontradas en método infix
	    	 * a postfix para la aplicación de nuestro stack.
	    	 * Código utilizado como referencia: https://www.tutorialspoint.com/Convert-Infix-to-Postfix-Expression#:~:text=To%20convert%20infix%20expression%20to,maintaining%20the%20precedence%20of%20them
	    	 */

package models;
/* Java implementation to convert
 infix expression to postfix*/
// Note that here we use ArrayDeque class for Stack
// operations

 
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;
 
public class translator{
 
    // A utility function to return
    // precedence of a given operator
    // Higher returned value means
    // higher precedence
    static int Prec(char ch)
    {
        switch (ch) {
        case '+':
        case '-':
            return 1;
 
        case '*':
        case '/':
            return 2;
 
        case '^':
            return 3;
        }
        return -1;
    }
 
    // The main method that converts
    // given infix expression
    // to postfix expression.
    public String infixToPostfix(String exp)
    {
        // initializing empty String for result
        String result = new String("");
 
        // initializing empty stack
        Deque<Character> stack
            = new ArrayDeque<Character>();
 
        for (int i = 0; i < exp.length(); ++i) {
            char c = exp.charAt(i);
 
            // If the scanned character is an
            // operand, add it to output.
            if (Character.isLetterOrDigit(c))
                result += c;
 
            // If the scanned character is an '(',
            // push it to the stack.
            else if (c == '(')
                stack.push(c);
 
            //  If the scanned character is an ')',
            // pop and output from the stack
            // until an '(' is encountered.
            else if (c == ')') {
                while (!stack.isEmpty()
                       && stack.peek() != '(') {
                    result += stack.peek();
                    stack.pop();
                }
 
                stack.pop();
            }
            else // an operator is encountered
            {
                while (!stack.isEmpty()
                       && Prec(c) <= Prec(stack.peek())) {
 
                    result += stack.peek();
                    stack.pop();
                }
                stack.push(c);
            }
        }
 
        // pop all the operators from the stack
        while (!stack.isEmpty()) {
            if (stack.peek() == '(')
                return "Invalid Expression";
            result += stack.peek();
            stack.pop();
        }
       
        return result;
    }
}
