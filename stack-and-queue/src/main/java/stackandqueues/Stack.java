package stackandqueues;


import java.util.*;

public class Stack extends LinkedList{


    public int pop(){
        if(this.isEmpty()){
            throw new EmptyStackException();
        }
        Node result = this.head;
        if(head.next != null){
            this.head = this.head.next;
            return result.value;
        } else {
            this.head = null;
            return result.value;
        }
    }
    public void push(int value){
        Node n =  new Node(value);
        n.next = this.head;
        this.head = n;
    }
}
