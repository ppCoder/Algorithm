package Basic.链式.有序序列的合并;

import java.util.Scanner;

/**
 * @Author dml
 * @Date 2020/3/1 14:05
 * @Description
 **/
class LNode{
    int num;
    LNode next;
}
public class Main {

    public void merge(LNode aHead,LNode b){
        LNode a = aHead;
        while(a.next!=null&&b.next!=null){
            if(a.next.num>b.next.num){
                LNode p = b.next;
                b.next = b.next.next;
                p.next = a.next;
                a.next = p;
            }
            a = a.next;
        }
        if(b.next!=null) {a.next = b.next;b.next=null;}
    }

    public void convert(LNode a,LNode b){
        while(a.next!=null){
            LNode p = a.next;
            a.next = a.next.next;
            p.next = b.next;
            b.next = p;
        }
    }

    public void InterSec(LNode aHead,LNode b){
        LNode a = aHead;
        while(a.next!=null&&b.next!=null){
            if(a.next.num>b.next.num){
                b.next = b.next.next;
            }
            if(a.next.num == b.next.num){
                b.next = b.next.next;
                a = a.next;
            }
            else a.next = a.next.next;
        }
        if(a.next!=null) {a.next = null;}
    }

    public void diffSec(LNode aHead,LNode b){
        LNode a = aHead;
        while(a.next!=null&&b.next!=null){
            if(a.next.num>b.next.num){
                b.next = b.next.next;
            }
            if(a.next.num == b.next.num){
                b.next = b.next.next;
                a.next = a.next.next;
            }
            else a = a.next;
        }
    }

    public void print(LNode head){
        int num=0;
        while(head.next!=null){
            head = head.next;num++;
            System.out.print(head.num);
            if(head.next!=null) System.out.print(" ");
        }
        System.out.printf("\n%d\n",num);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m,n;
        while((m=in.nextInt())!=0&&(n=in.nextInt())!=0){
            LNode aHead = new LNode();
            LNode a = aHead;
            for (int i = 0; i < m; i++) {
                LNode p = new LNode();
                p.num = in.nextInt();
                a.next = p;
                a = a.next;
            }
            LNode bHead = new LNode();
            LNode b = bHead;
            for (int i = 0; i < n; i++) {
                LNode p = new LNode();
                p.num = in.nextInt();
                b.next = p;
                b = b.next;
            }
            Main mi = new Main();
//            mi.merge(aHead,bHead);
//            mi.convert(aHead,bHead);
//            mi.InterSec(aHead,bHead);
            mi.diffSec(aHead,bHead);
            mi.print(aHead);
        }
    }
}
