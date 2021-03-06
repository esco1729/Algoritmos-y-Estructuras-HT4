package src;

public class DoublyLinkedNode<E> {
	protected E data;
	protected DoublyLinkedNode<E> nextElement;
	protected DoublyLinkedNode<E> previousElement;
		public DoublyLinkedNode(E v, 
								DoublyLinkedNode<E> next, 
								DoublyLinkedNode<E> previous)
		{
			data = v;
			nextElement = next;
		if (nextElement != null)
			nextElement.previousElement = this;
			previousElement = previous;
		if (previousElement != null)
			previousElement.nextElement = this;
		}
		
		public DoublyLinkedNode(E v)
		// post: constructs a single element
		{
			this(v,null,null);
		}

		public void setNext(DoublyLinkedNode<E> object) {
			nextElement = object;
			
		}

		public E value() {
			// TODO Auto-generated method stub
			return data;
		}

		public DoublyLinkedNode<E> previous() {
			// TODO Auto-generated method stub
			return previousElement;
		}

		
}
