package FullTimePrep;

public class DeleteNodeLL {
    public void deleteNode(ListNode node) {
        node.val=node.next.val;
        node.next=node.next.next;
    }


    /**
     * comments
     */
}
