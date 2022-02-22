package src;

public interface List<E>{
		public int size();
		// post: returns number of elements in list


		public void addFirst(E value);
		// post: value is added to beginning of list
		
		
		public void addLast(E value);
		// post: value is added to end of list
		
		
		public E getLast();
		// pre: list is not empty
		// post: returns last value in list
		
		public E removeLast();
		// pre: list is not empty
		// post: removes last value from list
		
		
		public E remove(E value);
		// post: removes and returns element equal to value
		// otherwise returns null
		
		public void add(E value);
		// post: value is added to tail of list
		
		public E remove();
		// pre: list has at least one element
		// post: removes last value found in list
		
		public E get();
		// pre: list has at least one element
		// post: returns last value found in list
}
