package src;

public abstract class AbstractList<E> implements List<E>{
	int size = 0;
	public AbstractList() {
		// TODO Auto-generated constructor stub
	}
	
	public boolean isEmpty() {
		return size() == 0;
	}
	
	public int size() {
		return size;
	}


}
