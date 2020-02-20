package treeintersection;

import codechallenges.tree.*;

import java.util.*;

public class TreeIntersection {

    public static HashSet treeIntersection(BinaryTree treeOne , BinaryTree treeTwo){

        HashSet hashy = new HashSet();
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
            removeSingularValues(rootOne.value,hashy);

            if(rootOne.left != null){
                cubert.add(rootOne.left);
            }
            if(rootOne.right != null){
                cubert.add(rootOne.right);
            }

        }
        return hashy;
    }

    private static void removeSingularValues(int value, HashSet hashy){
        if(!hashy.contains(value)){
            hashy.remove(value);
        }
    }
}
