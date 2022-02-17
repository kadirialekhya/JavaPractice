package LinkedList_FTPrep;

public class CountNodes_LL<T extends Comparable>implements Cloneable {
private Node head=null;
    public int countNodes() {
        if (head == null) {
            return 0;
        }
        else
        {
            Node current=head;
            int count= 0;
            while (current!=null)
            {
                current=current.getNext();
                count++;
            }
            return count;
        }
    }
}
