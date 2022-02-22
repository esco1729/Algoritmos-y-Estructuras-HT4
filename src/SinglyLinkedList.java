package src;

import java.util.AbstractList;
import java.util.Iterator;

import com.sun.org.apache.bcel.internal.classfile.Node;
import com.sun.tools.javac.util.Assert;

/**
 * 
 * @author liter
 *
 */
public class SinglyLinkedList<E> extends AbstractList<E>{
	protected int count; // list size
	protected Node<E> head; // ref. to first element
	
	public SinglyLinkedList()	
	{
		head = null;
		count = 0;
	}
	
	public int size()
	{
		return count;
	}
	
	public void addLast(E value){
		Node<E> temp = new Node<E>(value,null);
		if (head != null)
		{
			// pointer to possible tail
			Node<E> finger = head;
			while (finger.next() != null)
			{
			finger = finger.next();
			}
			finger.setNext(temp);
		} else head = temp;
			count++;
	}
	
	public E removeLast() {
		Node<E> finger = head;
		Node<E> previous = null;
		Assert.pre(head != null, "List is not empty.");
		while (finger.next() != null) //find end of list
		{
			previous = finger;
			finger = finger.next();
		}
		//finger is null, or points ot end of list
		if (previous == null) {
			//has exactly one element
			head = null;
		}
		else {
			//point to last element is reset
			previous.setNext(null);
		}
		count--;
		return finger.value();
	}

	@Override
	public E get(int index) {
		// TODO Auto-generated method stub
		return null;
	}
		
		
		
		
	}
	
		
	
		

