package src;

public interface IPila<T> { //forma de dividir los metodos
	public void pop();
	public void push(T dato);
	public T peek();
	public boolean isEmpty();

}