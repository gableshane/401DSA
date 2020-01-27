package codechallenges.tree;

public class BinaryTree {

    Node root;

    public void preOrder(Node root){

        if(root == null){
            throw new IllegalArgumentException("Binary tree cannot be empty");
        }

        System.out.println(root.value);

        if(root.left != null){
            preOrder(root.left);
        }
        if(root.right != null){
            preOrder(root.right);
        }
    }

    public void inOrder(Node nodey){

        if(root == null){
            throw new IllegalArgumentException("Binary tree cannot be empty");
        }

        if(nodey.left != null){
            inOrder(nodey.left);
        }

        System.out.println(nodey.value);

        if(nodey.right != null){
            inOrder(nodey.right);
        }
    }

    public void postOrder(Node nodey){

        if(root == null){
            throw new IllegalArgumentException("Binary tree cannot be empty");
        }

        if(nodey.left != null){
            postOrder(nodey.left);
        }

        if(nodey.right != null){
            postOrder(nodey.right);
        }

        System.out.println(nodey.value);
    }
}
