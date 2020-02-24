package graph;


import java.util.*;

public class Graph {

    ArrayList<Node> adjacencyList = new ArrayList<>();

    public Node addNode(int value){

        Node newNode = new Node(value);
        this.adjacencyList.add(newNode);

        return newNode;
    }

    public void addEdge(Node first, Node second, int weight){
        Edge firstEdge = new Edge(weight,second);
        Edge secondEdge = new Edge(weight,first);
        first.edges.add(firstEdge);
        second.edges.add(secondEdge);
    }

    public ArrayList<Node> getNodes(){
        return this.adjacencyList;
    }

    public ArrayList<Edge> getNeighbors(Node node){
        return node.edges;
    }

    public int size(){
        return this.adjacencyList.size();
    }
}
