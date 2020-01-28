package codechallenges.utilities;

import codechallenges.tree.*;

public class FizzBuzzTree {

    public static BinaryTree<String> fizzBuzz(BinaryTree<String> inputTree){

        Node<String> root = inputTree.root;

        BinaryTree<String> result = new BinaryTree<>();
        result.root = new Node<String>();
        fizzHelp(root,result.root);
        return result;
    }

    public static void fizzHelp(Node<String> inputRoot,Node<String> result){

        if(Integer.parseInt( inputRoot.value) % 3 == 0 && Integer.parseInt( inputRoot.value) % 5 == 0){
            result.value = "FizzBuzz";
        } else if(Integer.parseInt(inputRoot.value) % 3 == 0){
            result.value = "Fizz";
        } else if(Integer.parseInt(inputRoot.value) % 5 == 0){
            result.value = "Buzz";
        } else {
            result.value = inputRoot.value;
        }
        if(inputRoot.left != null){
            result.left = new Node<String>();
            fizzHelp(inputRoot.left,result.left);
        }
        if(inputRoot.right != null){
            result.right = new Node<String>();
            fizzHelp(inputRoot.right,result.right);
        }
    }
}
