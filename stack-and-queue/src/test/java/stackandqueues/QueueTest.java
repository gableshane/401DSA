package stackandqueues;

import org.junit.*;

import static org.junit.Assert.*;

public class QueueTest<E> {
    @Test
    public void enqueue(){
        Queue cupid = new Queue();
        cupid.enqueue(1);
        assertEquals("The head of the queue should have value 1",1,cupid.peek());
    }
    @Test
    public void enqueueMulti(){
        Queue cupid = new Queue();
        cupid.enqueue(1);
        cupid.enqueue(99);
        assertEquals("The head should be 1",1,cupid.peek());
        assertEquals("The tail should be 99",99,cupid.tail.value);
    }
    @Test
    public void dequeue(){
        Queue cupid = new Queue();
        cupid.enqueue(1);
        cupid.enqueue(99);
        assertEquals("The return value of dequeue should equal the head.",1,cupid.dequeue());
    }
    @Test
    public void peekQueue(){
        Queue cupid = new Queue();
        cupid.enqueue(1);
        assertEquals("The return value of peek should be 1",1,cupid.peek());
    }
    @Test
    public void dequeueUntilEmpty(){
        Queue cupid = new Queue();
        cupid.enqueue(1);
        cupid.enqueue(99);
        cupid.dequeue();
        cupid.dequeue();
        assertTrue("Queue should be empty",cupid.isEmpty());
    }
    @Test
    public void emptyQueue(){
        Queue cupid = new Queue();
        assertTrue("Queue should be an empty queue",cupid.isEmpty());
    }
}