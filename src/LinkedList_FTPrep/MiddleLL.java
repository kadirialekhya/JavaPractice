package LinkedList_FTPrep;



public class MiddleLL {
    public ListNode middleNode(ListNode head)
    {
        ListNode current=head;
        ListNode slow=head;
        ListNode fast=head;
        if (current!=null)
        {
            while (fast!=null && fast.next!=null)
            {
                slow=slow.next;
                fast=fast.next.next;
            }
        }
        return slow;
    }
}
