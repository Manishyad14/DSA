import java.util.*;


//this code for the basic linked insertion and givivng out the size of the linked list;;______________________>>


class Node2{
    int data;
    Node2 next ;

    Node2(int data){
        this.data = data ;
        this.next = null;

    }


}



public class linkedlislength {
    Node2 head = null;

    public void push(int new_data){//basic fucntion for inserting into the linked list-->>
        //creating the new node-->>>
        Node2 new_node = new Node2(new_data);



      new_node.next = head ;
      head = new_node;





    }



    public int getcoutn(){
        Node2 current = head ;//this is pointing to the head of the linked list
        int count  = 0;
        while(current!=null){
            count ++ ;
            current = current.next ;


        }

      return  count ;





    }


    public void display(){
        Node2 temp = head ;

        while(temp!=null){
            System.out.println(temp.data + " ");
            temp = temp.next ;

        }
        System.out.println();


    }






    public static void main(String[] args) {
        //creation of the linked list object--->>
        linkedlislength linked_list = new linkedlislength();


        linked_list.push(6);
        linked_list.push(62);
        linked_list.push(86);
        linked_list.push(16);   linked_list.push(69);
        linked_list.push(60);
        System.out.println("the printing of the linked list");
        linked_list.display();
       System.out.println("the size of the linked list " + linked_list.getcoutn());







    }
}
