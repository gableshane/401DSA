package stackandqueues;

import org.junit.*;

import static org.junit.Assert.*;

public class StackTest {

    @Test
    public void push(){
        Stack zack = new Stack();
        zack.push(1);
        assertEquals("The value of the head should be 1",1,zack.head.value);
    }
    @Test
    public void pushMultiple(){
        Stack zack = new Stack();
        zack.push(1);
        zack.push(99);
        assertEquals("The value of the head should be 99",99,zack.head.value);
    }
    @Test
    public void pop(){
        Stack zack = new Stack();
        zack.push(1);
        zack.push(99);
        assertEquals("The value of the popped node should be 99",99,zack.pop());
    }
    @Test
    public void popUntilEmpty(){
        Stack zack = new Stack();
        zack.push(1);
        zack.push(99);
        zack.pop();
        zack.pop();
        assertTrue("Stack should be empty",zack.isEmpty());
    }
    @Test
    public void peek(){
        Stack stacky = new Stack();
        stacky.push(1);
        int expected = stacky.head.value;
        assertEquals("The value of peek should be same as head",expected,stacky.peek());
    }
    @Test
    public void emptyStack(){
        Stack zack = new Stack();
        assertTrue("Zack the stack should be empty",zack.isEmpty());
    }
}