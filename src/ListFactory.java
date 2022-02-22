package src;

public class ListFactory<E>  {
	public List<E> getList(String v){
		if (v.equals("Singly")) {
			return new SinglyLinkedList<E>();
		}
		
		else if(v.equals("Doubly")) {
			return new DoublyLinkList<E>();
		}
		
		return null;
		}
		

	}
	

