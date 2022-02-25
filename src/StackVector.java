package src;
/**
 * 
 */
import java.util.Vector;
/**
 * 
 * @author liter
 *
 * @param <E>
 */
public class StackVector<E> extends AbstractStack<E> {
	Vector<E> data = new Vector<E>();
	

	public E peek()
	// pre: stack is not empty
	// post: top value (next to be popped) is returned
	{
		return (E)data.get(size() - 1);
	}
	
	public int size()
	// post: returns the number of elements in the stack
	{
		return data.size();
	}
	
	public void push(E item)
	// post: the value is added to the stack
	//          will be popped next if no intervening push
	{
		data.addElement(item);
	}

	public E pop()
	// pre: stack is not empty
	// post: most recently pushed item is removed and returned
	{
		return (E)data.remove(size()-1);
	}

	@Override
	public void add(E item) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public E remove() {
		// TODO Auto-generated method stub
		return null;
	}
	
    public boolean empty() {
        return data.size() == 0;
    }
  
}
	
	

