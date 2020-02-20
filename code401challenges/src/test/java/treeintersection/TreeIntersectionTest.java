package treeintersection;

import codechallenges.tree.*;
import codechallenges.tree.BinaryTree;
import com.sun.source.tree.*;
import org.junit.*;

import static org.junit.Assert.*;

public class TreeIntersectionTest {

    BinaryTree<Integer> treeOne;
    BinaryTree<Integer> treeTwo;

    @Before
    public void instantiateTrees(){
        treeOne = new BinaryTree<>();
        treeTwo = new BinaryTree<>();
        Node<Integer> nodeAlpha = new Node<>();
        Node<Integer> nodeBravo = new Node<>();
        Node<Integer> nodeCharlie = new Node<>();
        Node<Integer> nodeDelta = new Node<>();
        Node<Integer> nodeEcho = new Node<>();
        nodeAlpha.value = 1;
        nodeBravo.value = 6;
        nodeCharlie.value = 99;
        nodeDelta.value = 3;
        nodeEcho.value = 55;
        treeOne.root = nodeAlpha;
        treeOne.root.left = nodeBravo;
        treeOne.root.right = nodeCharlie;
        treeTwo.root = nodeDelta;
        treeTwo.root.right = nodeEcho;
        treeTwo.root.left = nodeCharlie;
    }

    @Test
    public void testTreeIntersection(){
        System.out.println(TreeIntersection.treeIntersection(treeOne,treeTwo));

    }

}