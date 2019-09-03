package JZOffer;

public class AddListAToListB {
    public ListNode Merge(ListNode list1,ListNode list2) {
        ListNode targetNode1 = list1;
        ListNode targetNode2 = list2;

        ListNode newNode = new ListNode(0);//新链表首结点
        newNode.next = list2;
        ListNode head = newNode;//返回结点

        /*while(targetNode1 != null) {
            while (targetNode2 != null && targetNode2.val < targetNode1.val) {//查找list2中比list1小的链
                targetNode2 = targetNode2.next;
                newNode = newNode.next;
            }
            newNode.next = targetNode1;
            if(targetNode2 == null)break;
            while (targetNode1 != null && targetNode1.val < targetNode2.val) {//查找list2中比list1大的链
                targetNode1 = targetNode1.next;
                newNode = newNode.next;
            }
            newNode.next = targetNode2;
        }*/

        while(targetNode1 != null&&targetNode2 != null){
            if(targetNode1.val > targetNode2.val){
                newNode.next = targetNode2;
                targetNode2 = targetNode2.next;
            }
            else{
                newNode.next = targetNode1;
                targetNode1 = targetNode1.next;

            }
            newNode = newNode.next;
        }
        if(targetNode2 == null) newNode.next = targetNode1;
        else newNode.next = targetNode2;

        return head.next;
    }

    public static void main(String[] args) {
        AddListAToListB sum = new AddListAToListB();
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(9);
        ListNode c = new ListNode(20);
        ListNode d = new ListNode(2);
        ListNode e = new ListNode(4);
        ListNode f = new ListNode(6);
        a.next = b;b.next = c;
        d.next = e;e.next = f;
        ListNode s = sum.Merge(a,d);
        while(s != null){
            System.out.printf("%d ",s.val);
            s = s.next;
        }
    }
}
