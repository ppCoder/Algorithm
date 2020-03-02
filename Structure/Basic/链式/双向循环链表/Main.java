package Basic.链式.双向循环链表;

import java.util.Scanner;

/**
 * @Author dml
 * @Date 2020/3/2 16:55
 * @Description
 **/
class RNode {
    int n;
    RNode pre;
    RNode next;
}
public class Main {

    public void print(RNode head,int n){
        for (int i = 0; i < n; i++) {
            head = head.next;
            System.out.print(head.n);
            if(i!=n-1) System.out.print(" ");
        }
        System.out.print("\n");
    }

    public void exchange(RNode head,int m){
        RNode pre = null;
        for (int i = 0; i < m - 1; i++) {
            pre = head;
            head = head.next;
        }
        RNode p = head.next;
        head.next = head.next.next;
        head.next.pre = head;
        p.next = head;
        pre.next = p;
        p.pre = pre;
        head.pre = p;
    }

    public static void main(String[] args) {
        Main mi = new Main();
        Scanner in = new Scanner(System.in);
        int n;
        while((n = in.nextInt())!=0){
            RNode head = new RNode();
            RNode h = head;
            for (int i = 0; i < n; i++) {
                RNode p = new RNode();
                p.n = in.nextInt();
                h.next = p;
                p.pre = h;
                p.next = head.next;
                head.next.pre = p;
                h = h.next;
            }
            int m = in.nextInt();
            mi.exchange(head,m);
            mi.print(head,n);
        }
    }
}
