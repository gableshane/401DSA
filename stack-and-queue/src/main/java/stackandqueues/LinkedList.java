package stackandqueues;


import java.util.*;

public class LinkedList {

    Node head;

    public int peek(){
        System.out.println(this.isEmpty());
        if(this.isEmpty()){
            throw new EmptyStackException();
        }
        return this.head.value;
    }

    public boolean isEmpty(){
        if(this.head == null){
            return true;
        } else {
            return false;
        }
    }

}
