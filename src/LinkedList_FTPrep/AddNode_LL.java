package LinkedList_FTPrep;

public class AddNode_LL {
    private Node head=null;
    public void addNode( int data)
    {
        if (head==null)
        {
            head=new Node(data);
        }
        else
        {
            Node curr=head;
            while (curr.getNext()!=null)
            {
                curr=curr.getNext();
            }
            curr.setNext(new Node(data));
        }
    }
}
