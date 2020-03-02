package Basic.链式.单词的共同后缀;

import java.util.Scanner;

/**
 * @Author dml
 * @Date 2020/3/2 11:26
 * @Description
 **/
class LNode{
    String ch;
    LNode next;
}
public class Main {

    public LNode getSameStr(LNode aHead,LNode bHead,int al,int bl){
        if(al<=0||bl<=0) return null;
        if(al>bl)
            return getSameStr(aHead.next,bHead,al-1,bl);
        else if(al<bl)
            return getSameStr(aHead,bHead.next,al,bl-1);
        else{
            if(aHead.ch.equals(bHead.ch)) return aHead;
            else
                return getSameStr(aHead.next,bHead.next,al-1,bl-1);
        }
    }

    public static void main(String[] args) {
        Main mi = new Main();
        Scanner in = new Scanner(System.in);
        int m,n;
        while((m=in.nextInt())!=0&&(n=in.nextInt())!=0){
            LNode aHead = new LNode();
            LNode ah = aHead;
            for (int i = 0; i < m; i++) {
                LNode p = new LNode();
                p.ch = in.next();
                ah.next = p;
                ah = ah.next;
            }
            LNode bHead = new LNode();
            LNode bh = bHead;
            for (int i = 0; i < n; i++) {
                LNode p = new LNode();
                p.ch = in.next();
                bh.next = p;
                bh = bh.next;
            }
            System.out.println(mi.getSameStr(aHead.next,bHead.next,m,n).ch);
        }
    }
}
