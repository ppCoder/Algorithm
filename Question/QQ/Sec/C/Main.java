package QQ.C;

import java.util.Scanner;

/**
 * @Author dml
 * @Date 2019/9/1 21:25
 * @Description 搬运工
 **/
public class Main {

    /**
     * @author: dml
     * @date: 2019/9/1 21:56
     * @param n 办公室的数量
     * @param m 搬运工的数量
     * @param a 办公室箱子数组
     * @return 最少时间
     */
    public static int minTime(int n, int m, int[] a){
        int t = 0;
        int con = m;
        if(n==0||m==0)return 0;
        for (int i = 0; i < n;t++) {
            if(a[i]>con){
                a[i] -= con;
                con = 0;
            }
            else {
                con -= a[i];
                i++;
            }
            if(con == 0) {
                con = m;
                t++;
            }
        }
        return t+1;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();

        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }

        System.out.println(minTime(n,m,a));
    }
}
