import java.util.*;
//In this code page we have some basic operations of linked list like
//--Insertion of linked list at the starting of the linked list
//--Insertion of linked list in the middle  of the linked list
//--Insertion of linked list in the end  of the linked list
//--Display of the linked list--


class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null ;
    }


}

public class linked_listbasicop {
    Node head = null ;
    public void push (int new_data){

        Node new_node = new Node(new_data);  //This is the method to insert the linked list at the
        //starting of the linked list
        new_node.next = head;
        head = new_node;



    }


    public void inset (Node prev_node,int New_data){
        //Here we are checking if the given prev node is null or not!!!
        if(prev_node==null){
            System.out.println("the given previous node cant be null");
            return ;
        }

         //Creation of new node and giving it the value of the node
        Node new_node = new Node(New_data);
        new_node.next  = prev_node.next ; //IN this method we have added the node after the given node
        //
        prev_node.next = new_node;//the next of the given  previous node will be equal to the new node



    }



    public void insert_at_end(int new_data){

        //Creating the new node
        Node new_node = new Node(new_data);


        //Now we will check if the given linked is empty or not and if its empty or not
        if(head==null){
            head  = new_node;
            return;
        }

        //since the given new NOde is going to be the last node we have to mark the next of this node as NULL
        new_node.next = null;

        Node temp = head ;
        while(temp.next!=null){
            temp = temp.next ;
        }

        temp.next= new_node;
             return ;


    }


    public void display(){
        Node current  = head ;
        while(current!=null){
            System.out.println(current.data + " ");
            current = current.next;

        }
      System.out.println();
    }






    public static void main(String[] args) {

        linked_listbasicop linkedlist = new linked_listbasicop();


        linkedlist.push(5);
        linkedlist.push(6);

        System.out.println("the linked list is being printed");
        linkedlist.display();


    }
}


//By Manish Yadav