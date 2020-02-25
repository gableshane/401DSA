package graph;


import java.util.*;

public class Graph<T> {

    ArrayList<Node<T>> adjacencyList = new ArrayList<>();

    public Node<T> addNode(T value){

        Node<T> newNode = new Node<>(value);
        this.adjacencyList.add(newNode);

        return newNode;
    }

    public void addEdge(Node<T> first, Node<T> second, int weight){
        Edge<T> firstEdge = new Edge<>(weight,second);
        Edge<T> secondEdge = new Edge<>(weight,first);
        first.edges.add(firstEdge);
        second.edges.add(secondEdge);
    }

    public ArrayList<Node<T>> getNodes(){
        if(this.adjacencyList.size() == 0){
            return null;
        }
        return this.adjacencyList;
    }

    public ArrayList<Edge<T>> getNeighbors(Node<T> node){
        return node.edges;
    }

    public int size(){
        return this.adjacencyList.size();
    }
}
