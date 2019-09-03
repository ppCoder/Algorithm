package JZOffer;

public class ConvertList {
    public ListNode ReverseList(ListNode head) {
        if(head == null || head.next == null)return head;
        ListNode newHead = head;
        ListNode oldHead = head.next;
        newHead.next = null;
        ListNode targetNode = null;
        while(oldHead!=null){
            targetNode = oldHead;
            oldHead = oldHead.next;
            targetNode.next = newHead;
            newHead = targetNode;
        }
        return newHead;
    }
}
