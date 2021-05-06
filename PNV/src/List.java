
public class List<T> {
    // T stands for "Type"
	private class Node {
		T key;
		Node next;
		Node prev;
		public Node(T t) {
			key = t;
			next = null;
			prev = null;
		}
		
		public void setnext(Node n) {
			next = n;
			n.prev = this;
		}
		public Node getnext() {
			return this.next;
		}
	}
	Node head;
	Node tail;
	public List(T t) {
		head = new Node(t);
		tail = tail;
	}
	
}
