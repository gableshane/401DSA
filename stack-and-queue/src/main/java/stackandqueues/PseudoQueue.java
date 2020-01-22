package stackandqueues;

public class PseudoQueue<E> {

    Stack front = new Stack();
    Stack back = new Stack();

    public void enqueue(E value) {
        while(!front.isEmpty()){
            back.push(front.pop());
        }
        front.push(value);
        while(!back.isEmpty()){
            front.push(back.pop());
        }
    }
    public int dequeue(){
        return front.pop();
    }
}