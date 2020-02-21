package treeintersection;

import codechallenges.tree.*;

import java.util.*;

public class TreeIntersection {

    public static ArrayList treeIntersection(BinaryTree treeOne , BinaryTree treeTwo){

        HashSet hashy = new HashSet();
        ArrayList arr = new ArrayList();
        Queue<Node<Integer>> cubert = new LinkedList<>();
        cubert.add(treeOne.root);

        while(!cubert.isEmpty()){

            Node<Integer> rootOne = cubert.remove();
            hashy.add(rootOne.value);

            if(rootOne.left != null){
                cubert.add(rootOne.left);
            }
            if(rootOne.right != null){
                cubert.add(rootOne.right);
            }

        }

        cubert.add(treeTwo.root);

        while(!cubert.isEmpty()){

            Node<Integer> rootOne = cubert.remove();
            addDuplicates(rootOne.value,arr,hashy);

            if(rootOne.left != null){
                cubert.add(rootOne.left);
            }
            if(rootOne.right != null){
                cubert.add(rootOne.right);
            }

        }
        return arr;
    }

    private static void addDuplicates(int value, ArrayList arr,HashSet hashy){
        if(hashy.contains(value)){
            arr.add(value);
        }
    }
}
