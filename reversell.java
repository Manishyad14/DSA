class Node5{
     int data ;
     Node5  next ;

     //creation of the constructor
    Node5(int data){
        this.data = data ;
        this.next = null ;
    }

}

public class reversell {

    Node5 head = null ;


    public void reverse(){
        //here i am going to initalize the three variable  Node next , current , previous -->>>>
        Node5 prev = null ;
        Node5 current = head ;
        Node5 next = null;


        //now i will traverse the linked list--->>>>
        while(current!=null){
            next = current.next; // Save the next node
            current.next = prev; // Reverse the link
            prev = current; // Move prev to the current node
            current = next; // Move current to the next node



        }

     head = prev ; //updating the head to the previous


    }





    //basic method to add the node to the linked list
    public void push(int new_data){
        //creation of the new node
        Node5  new_node = new Node5(new_data);
        new_node.next = head ;
        head = new_node;



    }


    //basic method to print the linked list

    public void printlist(){
        Node5 temp = head ;
        while(temp!=null){
            System.out.println(temp.data + " ");
            temp = temp.next ;
        }

        System.out.println();
    }






    public static void main(String[] args) {

        //creation off the linked list----->>>>
        reversell linkedlist = new reversell();

        linkedlist.push(6);
        linkedlist.push(63);
        linkedlist.push(76);
        linkedlist.push(16);
        System.out.println("printing the ll");
        linkedlist.printlist();
        System.out.println("printing the reversed  ll");
        linkedlist.reverse();
        linkedlist.printlist();

    }
}
