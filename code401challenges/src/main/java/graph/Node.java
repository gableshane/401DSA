package graph;

import java.util.*;

public class Node<T> {

    T value;
    ArrayList<Edge<T>> edges;

    public Node(T value){
        this.value = value;
        this.edges = new ArrayList<>();
    }
    public Node(){

    }

    public String toString(){
        String result = (String)this.value;
        return result;
    }
}
