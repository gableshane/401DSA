package stackandqueues;


import java.util.*;

public class Queue<E> extends LinkedList{

    Node tail;

    public void enqueue(E value){
        if(this.tail == null){
            Node newNode = new Node(value);
            this.tail = newNode;
            this.head = newNode;
        } else {
            Node newNode = new Node(value);
            this.tail.next = newNode;
            this.tail = newNode;
        }
    }
    public E dequeue(){
        if(this.isEmpty()){
            throw new EmptyStackException();
        }
        Node result = this.head;
        this.head = result.next;
        E return_data = (E) result.value;
        return return_data;
    }

}
