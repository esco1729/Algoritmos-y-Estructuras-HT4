package src;

public class StackFactory<E> {
    public Stack<E> factoryStack(String v){
		if (v.equals("ArrayList")) {
			return new StackArrayList<E>();
		}
		
		else if(v.equals("Vector")) {
			return new StackVector<E>();
		}
		
		
		else if(v.equals("Doubly")) {
			return (Stack<E>) new DoublyLinkList<E>();
		}
		
		else if(v.equals("Singly")) {
			return (Stack<E>)new SinglyLinkedList<E>();
		}
		return null;
    	
    }
    
}