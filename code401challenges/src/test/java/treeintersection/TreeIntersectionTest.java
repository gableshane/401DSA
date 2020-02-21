package treeintersection;

import codechallenges.tree.*;
import codechallenges.tree.BinaryTree;
import com.sun.source.tree.*;
import org.junit.*;

import java.util.*;

import static org.junit.Assert.*;

public class TreeIntersectionTest {

    BinaryTree<Integer> treeOne;
    BinaryTree<Integer> treeTwo;
    BinaryTree<Integer> treeThree;

    @Before
    public void instantiateTrees(){
        treeOne = new BinaryTree<>();
        treeTwo = new BinaryTree<>();
        treeThree = new BinaryTree<>();
        
        Node<Integer> nodeAlpha = new Node<>(1);
        Node<Integer> nodeBravo = new Node<>(6);
        Node<Integer> nodeCharlie = new Node<>(99);
        Node<Integer> nodeDelta = new Node<>(3);
        Node<Integer> nodeEcho = new Node<>(55);
        Node<Integer> nodeFox = new Node<>(99);
        Node<Integer> nodeGolf = new Node<>(52);
        Node<Integer> nodeHotel = new Node<>(7);
        Node<Integer> nodeIndia = new Node<>(0);

        treeOne.root = nodeAlpha;
        treeOne.root.left = nodeBravo;
        treeOne.root.right = nodeCharlie;

        treeTwo.root = nodeDelta;
        treeTwo.root.right = nodeEcho;
        treeTwo.root.left = nodeFox;

        treeThree.root = nodeGolf;
        treeThree.root.left = nodeHotel;
        treeThree.root.right = nodeIndia;
    }

    @Test
    public void testTreeIntersection(){
        ArrayList expectedCucumber = new ArrayList();
        expectedCucumber.add(99);
        assertEquals(expectedCucumber,TreeIntersection.treeIntersection(treeOne,treeTwo));
    }

    @Test
    public void testTreeIntersectionExpectedFail(){
        ArrayList expectedPotato = new ArrayList();
        assertEquals(expectedPotato,TreeIntersection.treeIntersection(treeTwo,treeThree));
    }

}