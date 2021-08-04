package List;

public class Stack<T> extends List<T> {
	
	public void push(T key) {
		this.pushback(key);
	}
	public T pop() {
		Object aux = this.topBack();
		this.popBack();
		return (T) aux;
	}
	public T top() {
		return (T) this.topBack();
	}
	public boolean empty() {
		return this.isEmpty();
	}

}
