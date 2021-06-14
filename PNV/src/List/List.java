/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package List;


public class List<T> {

    protected Node<T> head;
    protected Node<T> tail;
    private int count;
    

    public List() {
        head = null;        
        tail = null;
        count = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void pushFront(T key) {

        Node temporal = new Node(key);
        if (isEmpty()) {
            head = temporal;
            tail = head;
        } else {
            temporal.next = head;
            head.prev = temporal;
            head = temporal;
        }
        count++;
    }

    public T topFront() {
        if (isEmpty()) {
            return null;
        } else {
            return head.key;
        }
    }

    public void popFront() {
        if (isEmpty()) {
        } else if (count != 1) {
            head = head.next;
            head.prev = null;
            count--;
            if (head == null) {
                tail = null;
            }
        } else {
            clean();
        }
    }

    public void pushback(T key) {
        if (isEmpty()) {
            head = new Node(key);
            tail = head;
        } else {
            Node temporal = new Node(key);
            temporal.prev = tail;
            tail.next = temporal;
            tail = tail.next;
        }
        count++;
    }

    public T topBack() {
        if (isEmpty()) {
            return null;
        } else {
            return tail.key;
        }
    }

    public void popBack() {
        if (isEmpty()) {
        } else if (count != 1) {
            tail = tail.prev;
            tail.next = null;
            if (tail == null) {
                head = null;
            }
        } else {
            clean();
        }
        count--;
    }

    public T Get(int index) {
        Node<T> temp = head;
        if (index >= count) {
            return null;
        } else {
            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }
            return temp.key;
        }
    }

    public int size() {
        return count;
    }

    public void clean() {
        head = null;
        tail = null;
        count = 0;
    }

    
}
