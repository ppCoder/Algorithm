package Basic.链式.单链表;

import java.util.Map;
import java.util.Scanner;

/**
 * @Author dml
 * @Date 2020/3/1 15:23
 * @Description
 **/
class LNode{
    int n;
    LNode next;
}
public class Main {

    public void print(LNode head){
        while(head.next!=null){
            head = head.next;
            System.out.print(head.n);
            if(head.next!=null)System.out.print(" ");
        }
        System.out.print("\n");
    }

    public void split(LNode head){
        LNode positive = null,negative = null;
        LNode pos=null,neg=null;
        while(head.next!=null){
            if(head.next.n>0){
                if(positive==null) {
                    positive = head.next;
                    pos = positive;
                    head.next = head.next.next;
                    pos.next = null;
                }
                else {
                    LNode p = head.next;
                    head.next = head.next.next;
                    p.next = null;
                    pos.next = p;
                    pos = pos.next;
                }
            }
            else if(head.next.n<0){
                if(negative==null) {
                    negative = head.next;
                    neg = negative;
                    head.next = head.next.next;
                    neg.next = null;
                }
                else{
                    LNode p = head.next;
                    head.next = head.next.next;
                    p.next = null;
                    neg.next = p;
                    neg = neg.next;
                }
            }
        }
        print(negative);
        print(positive);
    }

    public int getMax(LNode head){
        int max = head.next.n;
        while(head.next!=null){
            head = head.next;
            if(head.n>max) max = head.n;
        }
        return max;
    }

    public void convert(LNode head){
        LNode h = head;
        head = head.next;
        h.next = null;
        while(head!=null){
            LNode p = head;
            head = head.next;
            p.next = h.next;
            h.next = p;
        }
    }

    public void delRange(LNode head,int a,int b){
        while(head.next!=null){
            if(head.next.n<=b&&head.next.n>=a){
                head.next = head.next.next;
            }
            else head = head.next;
        }
    }

    //查找链表中倒数第五个节点：思考新的思路
    public LNode getLNode(LNode head,int n){
        int i = 0;
        for (int j = 0; j <= n; j++) {
            head = head.next;
        }
        return head;
    }

    //删除链表中绝对值相等的结点：如果不开这么大的空间应该怎么做
    public void deduplicate(LNode head){
        int[] i = new int[10000];
        while(head.next!=null){
            LNode pre = head;
            head = head.next;
            if(head.n>0&&i[head.n]==0) i[head.n]++;
            else if(head.n<0&&i[-head.n]==0) i[-head.n]++;
            else {
                pre.next = pre.next.next;
                head = pre;
            }
        }
    }

    public static void main(String[] args) {
        Main mi = new Main();

        Scanner in = new Scanner(System.in);
        int n;
        while((n = in.nextInt())!=0){
            LNode head= new LNode();
            LNode h = head;
            for (int i = 0; i < n; i++) {
                LNode p = new LNode();
                p.n = in.nextInt();
                h.next = p;
                h = h.next;
            }
            mi.deduplicate(head);
            mi.print(head);

//            int a = in.nextInt();

//            System.out.println(mi.getLNode(head,n-a).n);
//            mi.delRange(head,a,b);
//            mi.print(head);
//            mi.split(head);
//            System.out.println(mi.getMax(head));
//            mi.convert(head);
//            mi.print(head);
        }
    }
}
