/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package List ;


public class Node<T> {
    public Node prev;
    public Node next;
    public T key;
    
    
    public Node(T key){
        this.key = key;
        prev = null;
        next = null;
    }
}
