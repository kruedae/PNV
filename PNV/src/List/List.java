/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package List;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class List <T>{
    private Node head;
    private Node tail;
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
            tail = temporal;
        } else {
            temporal.next = head;
            head.prev = temporal;
            head = temporal;
        }
        count++;
    }

    public Object topFront() {
        if (isEmpty()) {
            return null;
        } else {
            return head.key;
        }
    }
    
    public void popFront() {
        if (isEmpty()) {            
        } else if(count != 1){
            head = head.next;
            head.prev = null;
            count--;
            if(head == null){
                tail = null;
            }
        }
        else{
            clean();
        }
    }
    
    public void pushback(T key) {
        if (isEmpty()) {
            head = new Node(key);
            tail = new Node(key);
        } else {
            Node temporal = new Node(key);
            temporal.prev = tail;
            tail.next = temporal;
            tail = tail.next;
        }
        count++;
    }
    
    public Object topBack() {
        if (isEmpty()){
            return null;
        }
        else{
            return tail.key;
        }
    }
    
    public void popBack(){
        if(isEmpty()){
        }else if(count != 1){
            tail = tail.prev;
            tail.next = null;
            if(tail == null){
                head = null;
            }
            else{
                clean();
            }
        }
        count--;
    }
    
    public Object Get(int index) {
        Node temp = head;
        for (int i = 0; i < index && index < count; i++) {
            temp = temp.next;
        }
        return temp.key;
    }

    public int size() {
        return count;
    }
    
    public void clean(){
        head = null;
        tail = null;
        count = 0;
    }
}
