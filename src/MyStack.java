package src;

import java.util.ArrayList;

public class MyStack <E> implements Stack<E> {
	private ArrayList<E> array;

	MyStack(ArrayList<E> array) {
		this.array = array;
	}

	/**
	 * Adds the parameter at the end of the ArrayList
	 * 
	 * @param item item to be appended
	 */
	@Override
	public void push(E item) {
		array.add(item);
	}

	/**
	 * Saves the last object of the array into a object variable. Then that object
	 * is deleted of the ArrayList
	 * 
	 * @return object saved in the object variable
	 */
	@Override
	public E pop() {
		int index;
		E object;
		if (array.isEmpty()) {
			return null;
		} else {
			index = array.size() - 1;
			object = array.get(index);
			array.remove(index);
		}
		return object;
	}

	/**
	 * Allows to see the last object in the array, without removing it or
	 * manipulating it
	 * 
	 * @return
	 */
	@Override
	public E peek() {
		try {
			int index = array.size() - 1;
			return array.get(index);
		} catch (Exception e) {
			
			return null;
		}
	}

	/**
	 * Allows to see if the ArrayList is empty
	 * 
	 * @return true for empty, false for else
	 */
	@Override
	public boolean empty() {
		if (array.isEmpty() == true) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * Allows to see the size of the ArrayList
	 * 
	 * @return size of the ArrayList
	 */
	@Override
	public int size() {
		return array.size();
	}
}
