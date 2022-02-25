package src;



public class DoublyLinkList<E> extends AbstractList<E>{
	protected int count;
	protected DoublyLinkedNode<E> head;
	protected DoublyLinkedNode<E> tail;
	Node newNode = new Node(null); 
	
	public DoublyLinkList(){
		// TODO Auto-generated constructor stub
		head = null;
		tail = null;
		count = 0;
	
	
	}

	public void addLast(E value)
	// pre: value is not null
	// post: adds new value to tail of list
	{
		// construct new element
		tail = new DoublyLinkedNode<E>(value, null, tail);
		// fix up head
		if (head == null) head = tail;
		count++;
	}
	
	public E removeLast()
	// pre: list is not empty
	// post: removes value from tail of list
	{
		DoublyLinkedNode<E> temp = tail;
		tail = tail.previous();
		if (tail == null) {
			head = null;
		} else {
			tail.setNext(null);
		}
		count--;
		return temp.value();
	}

	@Override
	public void addFirst(E value) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public E getLast() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public E remove(E value) {
		// TODO Auto-generated method stub
		return null;
	}

    @Override
    public void add(E value) {
        //pre: value is not null
        //post:adds value to structure data
        if(value == null){
            throw new NullPointerException();
        }else{
            DoublyLinkedNode<E> last_element = tail.previousElement;
            DoublyLinkedNode<E> temporal = new DoublyLinkedNode<E>(value,last_element,tail);
            tail.previousElement = temporal;
            last_element.nextElement = temporal;
            this.size++;
        }
    }

    public E remove(int i) {
        //pre: index is not greater or equal than size, and index is greater than 0
        //post:shows and removes element at index i
        if(i < 0 || i >= size()){
            throw new ArrayIndexOutOfBoundsException();
        }
        else{
            if(i == size-1){
                return removeLast();
            }
            DoublyLinkedNode<E> actual_node = head;
            for(int n = 0;n<i;n++){
                actual_node = actual_node.nextElement;
            }
            DoublyLinkedNode<E> temporal = actual_node.nextElement;
            E value = temporal.data;
            actual_node.nextElement = temporal.nextElement;
            temporal.nextElement.previousElement = actual_node;
            this.size--;
            return value;
        }
    }

	@Override
	public E get() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public E remove() {
		// TODO Auto-generated method stub
		return null;
	}

	
	
}
