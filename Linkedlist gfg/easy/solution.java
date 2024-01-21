//first approach using arraylist-->



int getMiddle(Node head)
{
    // Your code here.
    ArrayList<Integer> list=new ArrayList<>();
    Node temp=head;

    while(temp!=null){
        list.add(temp.data);
        temp=temp.next;
    }

    return list.get(list.size()/2);
}
//
//------------------------------------------------->>>>>>>>>>>>>..second approach
class Solution
{
    int getMiddle(Node head)
    {
        // Your code here.
        int count=0;
        Node currNode=head;
        while(currNode != null){
            currNode = currNode.next;
            count++;
        }
        int i=1;
        currNode=head;
        while(i < (count/2)+1){
            currNode=currNode.next;
            i++;
        }

        return currNode.data;
    }
