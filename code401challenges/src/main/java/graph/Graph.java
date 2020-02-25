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

    public ArrayList<String> breathFirst(Node node){

        if(node.edges.isEmpty()){
            return null;
        }

        HashSet<Node<T>> hashy = new HashSet<>();
        Queue<Node<T>> cubert = new LinkedList<>();
        ArrayList<String> result = new ArrayList<>();
        cubert.add(node);
        result.add(node.value.toString());
        hashy.add(node);

        while(!cubert.isEmpty()){

            Node<T> temp = cubert.remove();
            ArrayList<Edge<T>> neighbors = temp.edges;

            for(Edge<T> neighbor : neighbors){
                if(!hashy.contains(neighbor.node)){
                    cubert.add(neighbor.node);
                    hashy.add(neighbor.node);
                    result.add(neighbor.node.value.toString());
                }
            }
        }
        return result;
    }
}
