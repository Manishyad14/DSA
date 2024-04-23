package BinaryTree;
import java.util.* ;

class Node {
    int data ;
    Node left ;
    Node right ;

    Node (int data){
        this.data = data ;
        right = left = null;
    }



}



public class Binarytreesum {
    //Initialzing the root of the tree
    Node root  ;


    public int sum(Node node){

        if(node == null){
            return 0 ;


        }


        int leftsum = sum(node.left) ;
        int rightsum = sum(node.right) ;
        int totasum = leftsum + rightsum + node.data ;
        return totasum ;








    }







    public static void main(String[] args) {

        Binarytreesum tree = new Binarytreesum();

        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        System.out.println("sum  of each node of the  tree is "
                + tree.sum(tree.root));






    }
}
