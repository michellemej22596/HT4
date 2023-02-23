package main;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import models.Calculator;
import models.StackArrayList;
import models.translator;

public class HT4 {

	public static void main(String[] args) {

		String msg="";
		StackArrayList<Float> stackList = new StackArrayList<Float>();
		Calculator calculator = Calculator.getInstance();
		translator translator= new translator();
		
		System.out.println("Bienvenido a la calculadora Postfix");
		System.out.println("Leyendo archivo...");
		
		
		//The following code to read a text file was found at https://chuwiki.chuidiang.org/index.php?title=Lectura_y_Escritura_de_Ficheros_en_Java#:~:text=Podemos%20abrir%20un%20fichero%20de,y%20extraer%20campos%20de%20ella.
		//Some lines have been edited in order to read properly the text file requested and split the characters.
		File archivo = null;
		FileReader fr = null;
		BufferedReader br = null;

		try {
		    // Apertura del fichero y creacion de BufferedReader para poder
		    // hacer una lectura comoda (disponer del metodo readLine()).
		    archivo = new File ("C:\\datos.txt");
		    fr = new FileReader (archivo);
		    br = new BufferedReader(fr);
		    
		    System.out.println("Su archivo ha sido leído con éxito.");
		    System.out.println("");
		    System.out.println("Contenido encontrado: ");
		
		    // Lectura del fichero
		    String linea;
		    while((linea=br.readLine())!=null) {
		       System.out.println(linea);
		    	msg=linea;
		    }}	
		    catch(Exception e){
				e.printStackTrace();
			    System.out.println("No se ha encontrado el archivo de texto");
			    System.out.println("Asegúrese de llamarlo datos.txt en su disco C");
			 }finally{
			    // En el finally cerramos el fichero, para asegurarnos
			    // que se cierra tanto si todo va bien como si salta 
			    // una excepcion.
			    try{                    
			       if( null != fr ){   
			          fr.close();     
			       }                  
			    }catch (Exception e2){ 
			       e2.printStackTrace();
			    }
			
				}
		System.out.println("");
		System.out.println("Contenido en formato postfix");
		//Translation to postfix
		msg = translator.infixToPostfix(msg);
		System.out.println(msg);
		
		for (int i = 0; i < msg.length(); i++) {
            char c = msg.charAt(i);
            String digit = String.valueOf(c);
	    	switch (digit) {
	    	
	    	/***
	    	 * Switch case to perform each operation, default case checks for a number, if it
	    	 * is, push it to the stack.
	    	 */
	    		
	    	case "*":
	    		float a=stackList.pop();
	    		float b= stackList.pop();
	    		stackList.push(calculator.multiplication(a,b));
	    		break;
	    		
	    	case "+":
	    		float d1=stackList.pop();
	    		float d2= stackList.pop();
	    		stackList.push(calculator.add(d1,d2));
	    		break;
	    		
	    	case "-":
	    		float e=stackList.pop();
	    		float f= stackList.pop();
	    		stackList.push(calculator.subtraction(e,f));
	    		break;
	    	
	    	case "/":
	    		float g=stackList.pop();
	    		float h= stackList.pop();
	    		stackList.push(calculator.division(g,h));
	    		break;
	    		
	    	default: 
	    		char x = c;
	    		if(Character.isDigit(x)){
	    			float number= Float.valueOf(x)-48;
	    			
	    		stackList.push(number);
	    		}else {
	    			System.out.println("Existe un caracter inválido en su archivo de texto. ");
	    		}
	    		break;
	    	
	    	
	    	}
	    		
	    }
	    System.out.println("");
		System.out.println("Resultado final: ");
	    stackList.peek();
		
	}
	
	

}
