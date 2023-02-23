package models;
import interfaces.IStack;
import models.StackArrayList;
import models.StackArray;
import models.StackLinkedList;
import models.StackDoubleLinkedList;


public class Factory<T> {

	public IStack<T> getDataStructure(String type){
        
        switch(type){
            case "ArrayList":
                return new StackArrayList<T>();
            case "Array":
            	return new StackArray<T>();
            case "LinkedList":
                return new StackLinkedList<T>();
            case "DoubleLinkedList":
                return new StackDoubleLinkedList<T>();
            default:
                return new StackArrayList<T>();
        }
    }
	
}
