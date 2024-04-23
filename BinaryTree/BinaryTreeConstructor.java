//package BinaryTree;
//import java.util.*;
//
//
//public class BinaryTreeConstructor {
//    //creation of the Nodes of the tree
//    public static class Node{
//        int data ;
//        Node left;
//        Node right;
//
//
//        //creation of the constructor
//        Node(int data , Node left , Node right ){
//            this.data = data;
//            this.right = right;
//            this.left=left;
//
//
//        }
//
//
//
//
//    }
//
//    public static class pair{
//        Node node ;
//        int state ;
//
//        //this is a pair class  to keep track for the state of the Node
//        //creating the constructor
//        pair(Node node , int state){
//            this.node=node;
//            this.state=state;
//
//        }
//
//
//
//
//
//    }
//
//
//
//
//
//    public static void main(String[] args) {
//      int []arr = { 50,25,12, Integer.parseInt(null),};
//        Stack<pair> st = new Stack<>();
//        //creating the root Node-->>
//        Node root = new Node(arr[0],null,null);
//
//        //creating the pairs for the
//        pair rtp = new pair(root,1);//initializing the initial state as 1-->>
//        st.push(rtp);
//
//        //initializing the the index variable
//        int index = 0 ;
//
//
//        while(st.size()>0){
//            pair top = st.peek();
//
//            if(top.state==1){
//
//                index++;
//
//                if((arr[index] == null)){
//
//
//                }
//
//
//
//            }
//
//        }
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//       // root Node--->>
//
//
//
//
//
//    }
//}
