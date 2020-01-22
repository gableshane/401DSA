package stackandqueues;

public class PseudoQueue {

    Stack front = new Stack();
    Stack back = new Stack();

    public void enqueue(int value) {
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