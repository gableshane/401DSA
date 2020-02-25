package graph;

import org.junit.*;

import java.util.*;

import static org.junit.Assert.*;

public class GraphTest {

    Graph<Integer> graphy;

    @Before
    public void instantiateGraph(){
        graphy = new Graph<>();
    }


    @Test
    public void testAddNode(){
        Node<Integer> testNode = graphy.addNode(1);
        int expected = 1;
        assertEquals(1,graphy.size());
        assertEquals(expected,(int)testNode.value);
    }

    @Test
    public void testAddEdge(){
        graphy.addEdge(graphy.addNode(1),graphy.addNode(2),5);
        assertEquals(graphy.adjacencyList.get(0).edges.get(0).node,graphy.adjacencyList.get(1));

    }

    @Test
    public void testGetNodes(){
        graphy.addNode(5);
        graphy.addNode(6);
        graphy.addNode(7);
        graphy.addNode(8);
        ArrayList<Node<Integer>> expected = graphy.getNodes();
        assertEquals((int)expected.get(0).value,5);
        assertEquals((int)expected.get(1).value,6);
        assertEquals((int)expected.get(2).value,7);
        assertEquals((int)expected.get(3).value,8);
    }

    @Test
    public void testGetNeighbors(){
        Node<Integer> testNode = graphy.addNode(5);
        graphy.addEdge(testNode,graphy.addNode(9),99);
        graphy.addEdge(testNode,graphy.addNode(99),00);
        ArrayList<Edge<Integer>> expected = graphy.getNeighbors(testNode);
        assertEquals((int)expected.get(0).node.value,9);
        assertEquals((int)expected.get(1).node.value,99);
    }
    @Test
    public void testGetNeighborsWeight(){
        Node<Integer> testNode = graphy.addNode(5);
        graphy.addEdge(testNode,graphy.addNode(9),99);
        graphy.addEdge(testNode,graphy.addNode(99),00);
        ArrayList<Edge<Integer>> expected = graphy.getNeighbors(testNode);
        assertEquals(expected.get(0).weight,99);
        assertEquals(expected.get(1).weight,00);
    }
    @Test
    public void testSize(){
        graphy.addNode(0);
        graphy.addNode(0);
        graphy.addNode(0);
        graphy.addNode(0);
        graphy.addNode(0);
        assertEquals(5,graphy.size());
    }

    @Test
    public void testEmptyGraphReturnsNull(){
        assertNull("Should return null",graphy.getNodes());
    }

    @Test
    public void testBreathfirst(){
        Node<Integer> testNode = graphy.addNode(1);
        graphy.addEdge(testNode,graphy.addNode(2),99);
        graphy.addEdge(testNode,graphy.addNode(3),00);
        Node<Integer> testNodeTwo = graphy.addNode(4);
        graphy.addEdge(testNode,testNodeTwo,01);
        graphy.addEdge(testNodeTwo,graphy.addNode(5),99);
        graphy.addEdge(testNodeTwo,graphy.addNode(6),00);
        ArrayList<String> expected = new ArrayList<>();
        expected.add("1");
        expected.add("2");
        expected.add("3");
        expected.add("4");
        expected.add("5");
        expected.add("6");
        assertEquals(expected,graphy.breathFirst(testNode));
    }

    @Test
    public void testBreadthFirstExectedFail(){
        Node<Integer> testNode = graphy.addNode(1);
        assertNull(graphy.breathFirst(testNode));
    }

    @Test
    public void testBreathFirstCircular(){
        Node<Integer> testNode = graphy.addNode(1);
        Node<Integer> testNodeTwo = graphy.addNode(99);
        graphy.addEdge(testNode,testNodeTwo,01);
        ArrayList<String> expected = new ArrayList<>();
        expected.add("1");
        expected.add("99");
        assertEquals(expected,graphy.breathFirst(testNode));
    }

    // Michelle told me to ignore test 7 because it makes no sense

    // test 8 also makes no sense. Returns null if what? For what method?
}