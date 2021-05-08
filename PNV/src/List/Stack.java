package List;

public class Stack<T> extends List<T> {
	private List<T> list = new List<T>();
	public void push(T key) {
		list.pushback(key);
	}
	public Object pop() {
		Object aux = list.topFront();
		list.popFront();
		return aux;
	}
	public Object Top() {
		return list.topFront();
	}
	public boolean empty() {
		return list.isEmpty();
	}
}
