package Basic.链式.一元多项式的运算;

import java.util.Scanner;

/**
 * @Author dml
 * @Date 2020/2/29 13:04
 * @Description 题库http://www.bjfuacm.com/problem/224
 **/
class LNode{
    int coe; //系数
    int index;//指数
    LNode next;
    LNode(){}
    LNode(LNode p){
        this.coe = p.coe;
        this.index = p.index;
    }
}
public class Main {
    public void clean(LNode Head){
        LNode h = Head;
        while(h.next!=null){ h = h.next;
            LNode he = h;
            while(he.next!=null){
                LNode pre = he;
                he = he.next;
                if(h.index==he.index){
                    h.coe += he.coe;
                    pre.next = he.next;
                }
            }
        }
    }

    public LNode plus(LNode aHead, LNode bHead){
        LNode cHead = new LNode();
        LNode ah = aHead,bh = bHead,ch = cHead;
        clean(ah);
        clean(bh);
        while(ah.next!=null){
            LNode ap = ah;
            ah =ah.next;
            bh = bHead;
            while(bh.next!=null){
                LNode bp = bh;
                bh = bh.next;
                if(ah.index==bh.index){
                    LNode p = new LNode();
                    p.coe = ah.coe+bh.coe;
                    if(p.coe!=0){
                        p.index = ah.index;
                        ch.next = p;
                        ch = ch.next;
                    }
                    ap.next = ah.next;
                    ah.next = null;
                    ah = ap;
                    bp.next = bh.next;
                    bh.next = null;
                    bh = bp;
                }
            }
        }
        ah = aHead;bh = bHead;
        ch.next = ah.next;
        while(ch.next!=null){
            ch = ch.next;
        }
        ch.next = bh.next;
        sortIndex(cHead);
        return cHead;
    }

    public LNode minus(LNode aHead, LNode bHead){
        LNode cHead = new LNode();
        LNode ah = aHead,bh = bHead,ch = cHead;
        clean(ah);
        clean(bh);
        while(ah.next!=null){
            LNode ap = ah;
            ah =ah.next;
            bh = bHead;
            while(bh.next!=null){
                LNode bp = bh;
                bh = bh.next;
                if(ah.index==bh.index||ah.coe==0){
                    LNode p = new LNode();
                    p.coe = ah.coe-bh.coe;
                    if(p.coe!=0){
                        p.index = bh.index;
                        ch.next = p;
                        ch = ch.next;
                    }
                    ap.next = ah.next;
                    ah.next = null;
                    ah = ap;
                    bp.next = bh.next;
                    bh.next = null;
                    bh = bp;
                }
            }
        }
        ah = aHead;bh = bHead;
        ch.next = ah.next;
        while(ch.next!=null){
            ch = ch.next;
        }
        ch.next = bh.next;
        sortIndex(cHead);
        return cHead;
    }

    public LNode multiply(LNode aHead, LNode bHead){
        LNode cHead = new LNode();
        LNode ah = aHead,bh = bHead,ch = cHead;
        clean(ah);
        clean(bh);
        while(ah.next!=null){
            LNode ap = ah;
            ah =ah.next;
            bh = bHead;
            while(bh.next!=null){
                LNode bp = bh;
                bh = bh.next;
                if(ah.index==bh.index||ah.coe==0||bh.coe==0){
                    LNode p = new LNode();
                    p.coe = ah.coe*bh.coe;
                    if(p.coe!=0){
                        p.index = ah.index;
                        ch.next = p;
                        ch = ch.next;
                    }
                    ap.next = ah.next;
                    ah.next = null;
                    ah = ap;
                    bp.next = bh.next;
                    bh.next = null;
                    bh = bp;
                }
            }
        }
        ah = aHead;bh = bHead;
        ch.next = ah.next;
        while(ch.next!=null){
            ch = ch.next;
        }
        ch.next = bh.next;
        sortIndex(cHead);
        return cHead;
    }

    public void derivative(LNode head){
        LNode h = head;
        clean(h);
        while(h.next!=null){
            h = h.next;
            h.coe *= h.index;
            h.index--;
        }
        sortIndex(head);
    }

    public void sortIndex(LNode Head){
        LNode head = Head;
        while(head.next!=null){
            LNode max = head.next;
            LNode pre = head.next;
            LNode point = head.next;
            while(point.next!=null){
                if(point.next.index>max.index){
                    pre = point;
                    max = point.next;
                }
                point = point.next;
            }
            if(max!=head.next) {
                pre.next = max.next;
                max.next = head.next;
                head.next = max;
            }
            head = head.next;
        }
    }

    public void print(LNode head){
        if(head.next==null){
            System.out.println(0);
            return;
        }
        while(head.next!=null){
            head = head.next;
            if(head.index!=0&&head.coe!=0) System.out.printf("%dx^%d",head.coe,head.index);
            else if(head.index==0&&head.coe!=0) System.out.printf("%d",head.coe);
            if(head.next!=null&&head.next.coe!=0){
                if(head.next.coe<0) {
                    head.next.coe = -head.next.coe;
                    if(head.next.index%2!=0)System.out.print("-");
                    else System.out.print("+");
                }
                else System.out.print("+");
            }
        }
        System.out.printf("\n");
    }

    public static void main(String[] args){
        Main m = new Main();

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            LNode aHead = new LNode();LNode ah = aHead;
            for (int j = 0; j < a; j++) {
                LNode p = new LNode();
                p.coe = in.nextInt();
                p.index = in.nextInt();
                ah.next = p;
                ah = ah.next;
            }
            LNode bHead = new LNode();LNode bh = bHead;
            for (int j = 0; j < b; j++) {
                LNode p = new LNode();
                p.coe = in.nextInt();
                p.index = in.nextInt();
                bh.next = p;
                bh = bh.next;
            }
            String c = in.next();
            LNode cHead=null;
            if(c.equals("+"))  {cHead = m.plus(aHead,bHead);m.print(cHead);}
            else if(c.equals("-")) {cHead = m.minus(aHead,bHead);m.print(cHead);}
            else if(c.equals("*")) {cHead = m.multiply(aHead,bHead);m.print(cHead);}
            else if(c.equals("'")) {
                m.derivative(aHead);m.print(aHead);
                m.derivative(bHead);m.print(bHead);
            }
        }
    }
}
