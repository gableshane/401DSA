package codechallenges.tree;

import org.junit.*;

import java.lang.reflect.*;
import java.util.*;

import static org.junit.Assert.*;

public class BinaryTreeTest {

    @Test
    public void preOrderTest() {
        BinaryTree byron = new BinaryTree();
        byron.root = new Node(1);
        byron.root.left = new Node(2);
        byron.root.right = new Node(3);
        int actual = (int) byron.preOrder(byron.root).get(0);
        int actual1 = (int) byron.preOrder(byron.root).get(1);
        int actual2 = (int) byron.preOrder(byron.root).get(2);
        assertEquals("Index 0 should be equal to root value",byron.root.value, actual);
        assertEquals("Index 1 should be equal to left value",byron.root.left.value, actual1);
        assertEquals("Index 2 should be equal to right value",byron.root.right.value, actual2);
    }

    @Test
    public void inOrder() {
        BinaryTree byron = new BinaryTree();
        byron.root = new Node(1);
        byron.root.left = new Node(2);
        byron.root.right = new Node(3);
        int actual = (int) byron.inOrder(byron.root).get(0);
        int actual1 = (int) byron.inOrder(byron.root).get(1);
        int actual2 = (int) byron.inOrder(byron.root).get(2);
        assertEquals("Index 0 should be equal to left value",byron.root.left.value, actual);
        assertEquals("Index 1 should be equal to root value",byron.root.value, actual1);
        assertEquals("Index 2 should be equal to right value",byron.root.right.value, actual2);
    }

    @Test
    public void postOrder() {
        BinaryTree byron = new BinaryTree();
        byron.root = new Node(1);
        byron.root.left = new Node(2);
        byron.root.right = new Node(3);
        int actual = (int) byron.postOrder(byron.root).get(0);
        int actual1 = (int) byron.postOrder(byron.root).get(1);
        int actual2 = (int) byron.postOrder(byron.root).get(2);
        System.out.println(byron.postOrder(byron.root));
        assertEquals("Index 0 should be equal to left value",byron.root.left.value, actual);
        assertEquals("Index 1 should be equal to right value",byron.root.right.value, actual1);
        assertEquals("Index 2 should be equal to root value",byron.root.value, actual2);
    }
    @Test
    public void canInstantiateEmptyTree(){
        BinaryTree byron = new BinaryTree();
        assertNotNull(byron);
        assertNull(byron.root);
    }
    @Test
    public void canInstantiateTreeWithSingleNode(){
        BinaryTree byron = new BinaryTree();
        byron.root = new Node(1);
        assertEquals("Binary tree root node value is 1", 1,byron.root.value);
    }
    @Test
    public void add(){
        BinarySearchTree byron = new BinarySearchTree();
        byron.root = new Node(10);
        byron.root.left = new Node(9);
        byron.root.right = new Node(11);
        byron.add(12,byron.root);
        assertEquals("The binary search tree should be balanced",12,byron.root.right.right.value);
    }
    @Test
    public void addSmaller(){
        BinarySearchTree byron = new BinarySearchTree();
        byron.root = new Node(10);
        byron.root.left = new Node(9);
        byron.root.right = new Node(11);
        byron.add(8,byron.root);
        assertEquals("The binary search tree should be balanced",8,byron.root.left.left.value);
    }
    @Test
    public void addEqual() {
        BinarySearchTree byron = new BinarySearchTree();
        byron.root = new Node(10);
        byron.root.left = new Node(9);
        byron.root.right = new Node(11);
        byron.add(11, byron.root);
        assertNull(byron.root.right.right);
    }
    @Test
    public void contains(){
        BinarySearchTree byron = new BinarySearchTree();
        byron.root = new Node(10);
        byron.root.left = new Node(9);
        byron.root.right = new Node(11);
        assertTrue("BST contains 9, should return true",byron.contains(9));
        assertTrue("BST contains 10, should return true",byron.contains(10));
        assertTrue("BST contains 11, should return true",byron.contains(11));
    }
    @Test
    public void containsFalse(){
        BinarySearchTree byron = new BinarySearchTree();
        byron.root = new Node(10);
        byron.root.left = new Node(9);
        byron.root.right = new Node(11);
        assertFalse("BST does not contain 99, should return false",byron.contains(99));
    }
    @Test
    public void breadthFirstTest(){
        BinaryTree byron = new BinaryTree();
        byron.root = new Node(1);
        byron.root.left = new Node(2);
        byron.root.right = new Node(3);
        assertArrayEquals("Should return array [1,2,3]",new Integer[]{1,2,3},BinaryTree.breadthFirst(byron).toArray());
    }
    @Test
    public void breadthFirstTestFalse(){
        BinaryTree byron = new BinaryTree();
        try{
            BinaryTree.breadthFirst(byron);
            assertTrue(false);

        } catch(Exception e){
            assertTrue(true);
        }
    }
    @Test
    public void findMaxValueTest(){
        BinaryTree byron = new BinaryTree();
        byron.root = new Node(1);
        byron.root.left = new Node(2);
        byron.root.right = new Node(3);
        assertEquals("Max value in tree is 3, should return 3",3,byron.findMaxValue());
    }
    @Test
    public void findMaxValueTestBig(){
        BinaryTree byron = new BinaryTree();
        byron.root = new Node(1);
        byron.root.left = new Node(2);
        byron.root.right = new Node(3);
        byron.root.left.right = new Node(99);
        assertEquals("Max value is 99 expect 99",99,byron.findMaxValue());
    }
    @Test
    public void findMaxValueFailure(){
        BinaryTree byron = new BinaryTree();
        try {
            byron.findMaxValue();
            assertTrue(false);
        } catch(Exception e) {
            assertTrue(true);
        }
    }
}