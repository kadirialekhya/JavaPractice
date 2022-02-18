package LinkedList_FTPrep;

import java.util.Stack;

public class ReverseLL {
    public ListNode reverseList(ListNode head) {
        Stack<ListNode> stack=new Stack<>();
        while (head!=null)
        {
            stack.push(head);
            head=head.next;
        }
        ListNode temp=new ListNode(-1);
        head=temp;
        while (!stack.isEmpty())
        {
            ListNode current=stack.pop();
            head.next=new ListNode(current.val);
            head=head.next;
        }
        return temp.next;
    }

}
