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

    public static class Result {

        boolean isPossible;
        double price;

        public Result(boolean isPossible, double price){
            this.isPossible = isPossible;
            this.price = price;
        }
        public String toString(){
            return this.isPossible + " " + this.price;
        }
    }
    public Result getEdge(String[] cities){

        if(this.adjacencyList.isEmpty()){
            throw new IllegalArgumentException("Graph is empty");
        }

        Node<T> temp = new Node<>();
        Result result = new Result(false,0);
        for(Node<T> node : this.adjacencyList){
            if(node.value == cities[0]){
                temp = node;
            }
        }

        for(int i = 1; i < cities.length; i++){
            result.isPossible = false;
            for(Edge<T> edge : temp.edges){
                if(edge.node.value == cities[i]){
                    result.isPossible = true;
                    result.price += edge.weight;
                    temp = edge.node;
                }
            }
        }
        return result;
    }

    public ArrayList<String> depthFirst(Node node){

        if(node.edges.isEmpty()){
            return null;
        }

        HashSet<Node<T>> hashy = new HashSet<>();
        Stack<Node<T>> zack = new Stack<>();
        ArrayList<String> result = new ArrayList<>();
        zack.add(node);
        hashy.add(node);

        while(!zack.isEmpty()){

            Node<T> temp = zack.pop();
            ArrayList<Edge<T>> neighbors = temp.edges;

            for(Edge<T> neighbor : neighbors){
                if(!hashy.contains(neighbor.node)){
                    zack.add(neighbor.node);
                    hashy.add(neighbor.node);
                }
            }
            result.add(temp.toString());
        }
        return result;
    }
}
