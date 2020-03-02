package Basic.顺序.中位数;

import java.util.Scanner;

/**
 * @Author dml
 * @Date 2020/3/2 18:29
 * @Description
 **/
public class Main {

    public int getMedian(int[] a,int[] b,int n){
        int ai=0,bi=0;
        for (int i = 0; i < n; i++) {
            if(a[ai]>b[bi]) bi++;
            else ai++;
        }
        if(ai-1>=0&&bi-1>=0&&a[ai-1]>b[bi-1]) return a[ai-1];
        else if(bi-1<0) return a[ai-1];
        else return b[bi-1];
    }

    public static void main(String[] args) {
        Main mi = new Main();
        Scanner in = new Scanner(System.in);
        int n;
        while((n = in.nextInt())!=0){
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = in.nextInt();
            }
            int[] b = new int[n];
            for (int i = 0; i < n; i++) {
                b[i] = in.nextInt();
            }
            System.out.println(mi.getMedian(a,b,n));
        }
    }
}
