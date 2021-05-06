package List;

public class Stack<T> extends List<T> {
	List<T> list = new List<T>();
	public void push(T key) {
		list.pushback(key);
	}
	public Object pop() {
		Object aux = list.topBack();
		list.popBack();
		return aux;
	}
	public Object Top() {
		return list.topBack();
	}
	public boolean empty() {
		return list.isEmpty();
	}
}
