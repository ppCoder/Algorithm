package Basic.顺序.删除指定元素;

import java.util.Scanner;

/**
 * @Author dml
 * @Date 2020/3/2 17:19
 * @Description
 **/
class SNode {
    int n;
}
public class Main {

    public void print(SNode[] head,int n){
        for (int i = 0; i < n; i++) {
            if(head[i].n!=0) System.out.print(head[i].n);
            if(i<n-1)System.out.print(" ");
        }
        System.out.print("\n");
    }

    public int delData(SNode[] head,int n,int item){
        int k = -1;
        for (int i = 0; i < n; i++) {
            if(head[i].n==item&&k<0) k = i;
            else if(head[i].n!=item&&k >=0) head[k++].n = head[i].n;
        }
        for (int i = k; i < n; i++) {
            head[i] = null;
        }
        return k;
    }

    public static void main(String[] args) {
        Main mi = new Main();
        Scanner in = new Scanner(System.in);
        int n;
        while((n = in.nextInt())!=0){
            SNode[] list = new SNode[n];
            for (int i = 0; i < n; i++) {
                list[i] = new SNode();
                list[i].n = in.nextInt();
            }
            int item = in.nextInt();
            n = mi.delData(list,n,item);
            mi.print(list,n);
        }
    }
}
