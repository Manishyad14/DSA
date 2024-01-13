import java.util.*;

//In this  code page  it has the method to search the element in the linked list--->>>

//creating the node for the linked list--

class Node1{
    int data ;
    Node1 next ;

    Node1(int data ){
        this.data = data;
        this.next = null ;
    }


}

public class searchLl {
       Node1 head = null ;


       public void push(int new_data){
           //creating of the new node
           Node1 new_node = new Node1(new_data);

           new_node.next = head ;
            head = new_node;



       }



       public boolean search(Node1 head , int key){
           //now i am creating the temporary  pointer typr thing which is pointing towards the head
           Node1 temp = head ;
           while(temp !=null){
               if(temp.data == key ){
                   return true ;
               }

               temp = temp.next ;
           }
     return false ;

       }


    public void display(){
        Node1 current  = head ;
        while(current!=null){
            System.out.println(current.data + " ");
            current = current.next;

        }
        System.out.println();
    }




//drivers code---------------->>>>>>>>>>>>>
    public static void main(String[] args) {
    //creation of the object---->>>
        searchLl linkedlist1 = new searchLl();

        int key = 14 ;


        linkedlist1.push(5);
        linkedlist1.push(6);
        linkedlist1.push(68);
        linkedlist1.push(54);
        linkedlist1.push(45);
        linkedlist1.push(474);
        linkedlist1.push(36);
        System.out.println("the linked list is being printed");
        linkedlist1.display();
       if(linkedlist1.search(linkedlist1.head,key)){
           System.out.println("yes");
       }
       else{
           System.out.println("NO");
       }








    }
}
