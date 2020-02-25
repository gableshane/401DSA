package graph;

public class Edge<T> {

    int weight;
    Node<T> node;

    public Edge(int weight, Node<T> node){
        this.weight = weight;
        this.node = node;
    }
}
