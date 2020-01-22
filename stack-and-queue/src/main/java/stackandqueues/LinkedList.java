package stackandqueues;


import java.util.*;

public class LinkedList<E> {

    Node head;

    public E peek(){
        if(this.isEmpty()){
            throw new EmptyStackException();
        }
        return (E) this.head.value;
    }

    public boolean isEmpty(){
        if(this.head == null){
            return true;
        } else {
            return false;
        }
    }

}
