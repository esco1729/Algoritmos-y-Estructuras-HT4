/**
 * 
 */
package src;

/**
 * @author José Auyón
 *
 */
public class SingleLinkedListStack <E> implements Stack <E>{

	private SinglyLinkedList <E>  list = new SinglyLinkedList <E>();   
	@Override
	public void push(E item) {
		// TODO Auto-generated method stub
		
		list.addLast(item);
	}

	@Override
	public E pop() {
		// TODO Auto-generated method stub
		return  list.removeLast();
		
	}

	@Override
	public E peek() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean empty() {
		// TODO Auto-generated method stub
		return list.size() ==0; 
				
		
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return list.size();
	}

	
}
