/***
	    	 * Algoritmos y Estructura de datos
	    	 * Michelle Mejía 22596
	    	 * Clase main, lee el archivo de texto, por medio del traductor y calculadora
	    	 * se encarga de devolver el resultado de las operaciones encontradas.
	    	 */

package main;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

import interfaces.IStack;
import models.Calculator;
import models.Factory;
import models.StackArrayList;
import models.translator;

public class HT4 {
	
	Factory<Float> factory = new Factory<Float>();
	IStack stackList;

	public static void main(String[] args) {
				
		HT4 ht4 = new HT4();
		ht4.initialize();
			
			}
	
	public void initialize() {

		System.out.println("Bienvenido a la calculadora Postfix");
		Scanner entrada = new Scanner(System.in);
		String option = "";
		
		while (!option.equals("4")) {
			
			menu();
			option = "" + entrada.nextLine();
			switch (option) {
			
			case "1":
				stackList = factory.getDataStructure("ArrayList");
				break;
			
			case "2":
				stackList = factory.getDataStructure("Array");	
				break;
			
			case "3":
				menuListas();
				String option2 = "" + entrada.nextLine();
				if (option2.equals("1")) {
					//stackList = factory.getDataStructure("LinkedList");
					stackList = factory.getDataStructure("ArrayList");
				}else {
					//stackList = factory.getDataStructure("DoubleLinkedList");
					stackList = factory.getDataStructure("ArrayList");
				}
				break;
			
			case "4":
				System.out.println("Gracias por utilizar el programa");
				break;
			
			default:
				System.out.println("Por favor ingrese una opción válida.");
			}
			
			String msg="";
			//StackArrayList<Float> stackList = new StackArrayList<Float>();
			Calculator calculator = Calculator.getInstance();
			translator translator= new translator();
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
		    		float a=(float)stackList.pop();
		    		float b= (float)stackList.pop();
		    		stackList.push(calculator.multiplication(a,b));
		    		break;
		    		
		    	case "+":
		    		float d1=(float)stackList.pop();
		    		float d2= (float)stackList.pop();
		    		stackList.push(calculator.add(d1,d2));
		    		break;
		    		
		    	case "-":
		    		float e=(float)stackList.pop();
		    		float f= (float)stackList.pop();
		    		stackList.push(calculator.subtraction(e,f));
		    		break;
		    	
		    	case "/":
		    		float g=(float)stackList.pop();
		    		float h= (float)stackList.pop();
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
			
	
	public static void menu() {
		System.out.println("Elige el tipo de estructura que deseas utilizar para el Stack");
		System.out.println("1. ArrayList");
		System.out.println("2. Array");
		System.out.println("3. List");
		System.out.println("4. Salir");
	}
	
	public static void menuListas() {
		System.out.println("Elige el tipo de lista");
		System.out.println("1. LinkedList");
		System.out.println("2. DoubleLinkedList");
	}
	
	

}
