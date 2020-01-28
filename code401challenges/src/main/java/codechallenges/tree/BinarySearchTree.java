package codechallenges.tree;

public class BinarySearchTree extends BinaryTree<Integer>{

    public Node add(int value, Node<Integer> node){

        if(node == null){
            node = new Node(value);
            return node;
        }

        if(value < node.value){
            node.left = add(value,node.left);
        } else if(value > node.value){
            node.right = add(value,node.right);
        } else {
            return node;
        }
        return node;
    }

    public boolean contains(int value){

        Node<Integer> current = this.root;

        while(current != null && value != current.value){
            if(value < current.value){
                current = current.left;
            } else {
                current = current.right;
            }
        }
        if(current != null && value == current.value){
            return true;
        }
        return false;
    }
}
