package List;

public class Stack<T> extends List<T> {
	private List<T> list = new List<>();
	public void push(T key) {
		list.pushback(key);
	}
	public T pop() {
		Object aux = list.topBack();
		list.popBack();
		return (T) aux;
	}
	public T top() {
		return (T) list.topBack();
	}
	public boolean empty() {
		return list.isEmpty();
	}
}
