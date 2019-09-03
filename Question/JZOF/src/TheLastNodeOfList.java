package JZOffer;

class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}

public class TheLastNodeOfList {
    public ListNode FindKthToTail(ListNode head,int k) {
        int length = 1;
        ListNode q = head;
        while(q.next != null){
            q = q.next;
            length++;
        }
        System.out.println(length);
        ListNode p = head;
        for (int i = 1; i < length - k + 1; i++) {
            p = p.next;
        }
        return p;
    }

    public static void main(String[] args) {
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);
        ListNode n4 = new ListNode(4);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        int k = 1;
        TheLastNodeOfList t = new TheLastNodeOfList();
        ListNode n0 = t.FindKthToTail(n1,k);
        System.out.println(n0.val);
    }
}
