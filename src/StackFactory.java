package src;
/**
 * 
 * @author liter
 *
 * @param <E>
 */
public class StackFactory<E> {
    public Stack<E> getStack(String datos){
    	if (datos.equals("Array")) {
    		return new StackArrayList<E>();}
    	else if(datos.equals("Vector")) {
    		return new StackVector<E>();}
    	else if (datos.equals("List")) {
    		return new StackList<E>();}
    	else if (datos.equals("Double")) {
    		return new StackList<E>();}
		return null;
    	
    }
    
}