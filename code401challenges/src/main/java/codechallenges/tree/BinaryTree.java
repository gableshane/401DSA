package codechallenges.tree;

import org.checkerframework.checker.units.qual.*;

import java.lang.reflect.*;
import java.util.*;

// LEARNED HOW TO FINISH THIS FROM CODE REVIEW. CREDIT TO CRYSTAL/NICHOLAS
public class BinaryTree<E> {

    public Node root;

    public ArrayList<E> preOrder(Node<E> root){
        ArrayList<E> listy = new ArrayList<>();
        if(root != null) {

            listy.add(root.value);

            ArrayList<E> lefty = preOrder(root.left);
            listy.addAll(lefty);


            ArrayList<E> righty = preOrder(root.right);
            listy.addAll(righty);


        }
        return listy;
    }

    public ArrayList<E> inOrder(Node<E> nodey){

        ArrayList<E> listy = new ArrayList<>();
        if(nodey != null){

            ArrayList<E> lefty = inOrder(nodey.left);
            listy.addAll(lefty);

            listy.add( nodey.value);

            ArrayList<E> righty = inOrder(nodey.right);
            listy.addAll(righty);
        }
        return listy;
    }

    public ArrayList<E> postOrder(Node<E> nodey){

        ArrayList<E> listy = new ArrayList<>();
        if(nodey != null){

            ArrayList<E> lefty = postOrder(nodey.left);
            listy.addAll(lefty);

            ArrayList<E> righty = postOrder(nodey.right);
            listy.addAll(righty);

            listy.add(nodey.value);
        }
        return listy;
    }

}
