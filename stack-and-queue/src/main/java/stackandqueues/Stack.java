package stackandqueues;


import java.util.*;

public class Stack<E> extends LinkedList{


    public E pop(){
        if(this.isEmpty()){
            throw new EmptyStackException();
        }
        Node result = this.head;
        if(head.next != null){
            this.head = this.head.next;
            return (E) result.value;
        } else {
            this.head = null;
            return (E) result.value;
        }
    }
    public void push(int value){
        Node<Integer> n =  new Node<>(value);
        n.next = this.head;
        this.head = n;
    }
}
