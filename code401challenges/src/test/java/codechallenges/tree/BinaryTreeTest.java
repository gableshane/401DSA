package codechallenges.tree;

import org.junit.*;

import static org.junit.Assert.*;

public class BinaryTreeTest {

    @Test
    public void preOrderTest() {
        BinaryTree byron = new BinaryTree();
        byron.root = new Node(1);
        byron.root.left = new Node(2);
        byron.root.right = new Node(3);
        byron.preOrder(byron.root);
    }

    @Test
    public void inOrder() {
        BinaryTree byron = new BinaryTree();
        byron.root = new Node(1);
        byron.root.left = new Node(2);
        byron.root.right = new Node(3);
        byron.inOrder(byron.root);
    }

    @Test
    public void postOrder() {
        BinaryTree byron = new BinaryTree();
        byron.root = new Node(1);
        byron.root.left = new Node(2);
        byron.root.right = new Node(3);
        byron.postOrder(byron.root);
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
        assertEquals("Binary tree root node value is 1", byron.root);
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
}