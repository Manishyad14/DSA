package BinaryTree;
import java.util.*;


class Node{
    int data ;

    Node left ;
    Node right ;

    //creating the constructor for the tree
    Node(int data ){
        this.data = data ;
        left = right = null ;
    }


}



public class BinarytreeHeight {

    //creating the root node for the tree
    Node root ;


    public int maxdepth(Node node){
        if(node == null){
            return 0 ;

        }
        int leftdepth = maxdepth(node.left);
        int rightdepth = maxdepth(node.right);
        int total = Math.max(leftdepth,rightdepth) + 1 ;
        return total ;







    }




    public static void main(String[] args) {
      //now here we are going to create a binary tree
        BinarytreeHeight tree = new BinarytreeHeight();

        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        System.out.println("Height of tree is "
                + tree.maxdepth(tree.root));





    }
}
