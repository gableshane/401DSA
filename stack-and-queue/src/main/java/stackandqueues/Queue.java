package stackandqueues;


import java.util.*;

public class Queue extends LinkedList{

    Node tail;

    public void enqueue(int value){
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
    public int dequeue(){
        if(this.isEmpty()){
            throw new EmptyStackException();
        }
        Node result = this.head;
        this.head = result.next;
        return result.value;
    }

}
