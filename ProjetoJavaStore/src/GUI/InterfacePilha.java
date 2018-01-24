package GUI;

public interface InterfacePilha <T> {

	public T next();
	
	public void add(T object);
	
	public boolean hasNext();
	
	public void remove();
	
}