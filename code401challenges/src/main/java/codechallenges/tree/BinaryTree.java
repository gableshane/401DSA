package codechallenges.tree;

import org.checkerframework.checker.units.qual.*;

import java.lang.reflect.*;
import java.util.*;

// LEARNED HOW TO FINISH THIS FROM CODE REVIEW. CREDIT TO CRYSTAL/NICHOLAS
public class BinaryTree {

    Node root;

    public ArrayList<Integer> preOrder(Node root){
        ArrayList<Integer> listy = new ArrayList<>();
        if(root != null) {

            listy.add(root.value);

            ArrayList<Integer> lefty = preOrder(root.left);
            listy.addAll(lefty);


            ArrayList<Integer> righty = preOrder(root.right);
            listy.addAll(righty);


        }
        return listy;
    }

    public ArrayList<Integer> inOrder(Node nodey){

        ArrayList<Integer> listy = new ArrayList<>();
        if(nodey != null){

            ArrayList<Integer> lefty = inOrder(nodey.left);
            listy.addAll(lefty);

            listy.add(nodey.value);

            ArrayList<Integer> righty = inOrder(nodey.right);
            listy.addAll(righty);
        }
        return listy;
    }

    public ArrayList<Integer> postOrder(Node nodey){

        ArrayList<Integer> listy = new ArrayList<>();
        if(nodey != null){

            ArrayList<Integer> lefty = postOrder(nodey.left);
            listy.addAll(lefty);

            ArrayList<Integer> righty = postOrder(nodey.right);
            listy.addAll(righty);

            listy.add(nodey.value);
        }
        return listy;
    }
}
