package codechallenges.utilities;

import codechallenges.tree.*;
import org.junit.*;

import static org.junit.Assert.*;

public class FizzBuzzTreeTest {

    @Test
    public void fizzBuzz() {
        BinaryTree<String> byron = new BinaryTree<>();
        byron.root = new Node("1");
        byron.root.left = new Node("3");
        byron.root.left.left = new Node("8");
        byron.root.right = new Node("5");
        byron.root.right.right = new Node("15");
        BinaryTree<String> test = FizzBuzzTree.fizzBuzz(byron);
        String actual = (String) test.preOrder(test.root).get(0);
        String actual1 = (String) test.preOrder(test.root).get(1);
        String actual2 = (String) test.preOrder(test.root).get(2);
        String actual3 = (String) test.preOrder(test.root).get(3);
        String actual4 = (String) test.preOrder(test.root).get(4);
        assertEquals("Output tree root value should be 1","1",actual);
        assertEquals("Output tree root value should be 1","Fizz",actual1);
        assertEquals("Output tree root value should be 1","8",actual2);
        assertEquals("Output tree root value should be 1","Buzz",actual3);
        assertEquals("Output tree root value should be 1","FizzBuzz",actual4);

    }
    @Test
    public void fizzBuzzExpectedFailure() {
        BinaryTree<String> byron = new BinaryTree<>();
        byron.root = new Node("1");
        byron.root.left = new Node("2");
        byron.root.left.left = new Node("4");
        byron.root.right = new Node("7");
        byron.root.right.right = new Node("14");
        BinaryTree<String> test = FizzBuzzTree.fizzBuzz(byron);
        String actual = (String) test.preOrder(test.root).get(0);
        String actual1 = (String) test.preOrder(test.root).get(1);
        String actual2 = (String) test.preOrder(test.root).get(2);
        String actual3 = (String) test.preOrder(test.root).get(3);
        String actual4 = (String) test.preOrder(test.root).get(4);
        assertEquals("Output tree root value should be 1","1",actual);
        assertEquals("Output tree root value should be 1","2",actual1);
        assertEquals("Output tree root value should be 1","4",actual2);
        assertEquals("Output tree root value should be 1","7",actual3);
        assertEquals("Output tree root value should be 1","14",actual4);
    }
}