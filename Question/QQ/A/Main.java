package QQ.A;

import java.util.Scanner;

/**
 * @Author dml
 * @Date 2019/9/1 20:03
 * @Description 宝藏
 **/
public class Main {

    /**
     * @author: dml
     * @date: 2019/9/1 20:21
     * @param m 宝箱的数量
     * @param n 钥匙的数量
     * @param a 宝箱数字组
     * @param b 钥匙数字组
     * @return 最多打开宝箱数量
     */
    public static int maxKey(int m,int n,int[] a,int[] b){
        int max=0;
        for (int i = 0,j = 0; i < m && j < n; i++) {
            while(j<n&&b[j]==-1)j++;
            if(j>=n)break;
            int k = j;
            while(a[i]!=-1&&k<n){
                if((b[k]!=-1)&&((a[i]+b[k])%2!=0)){
                    max++;
                    a[i]=-1;
                    b[k]=-1;
                }
                k++;
            }
        }
        return max;
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();

        int[] a = new int[m];
        for (int i = 0; i < m; i++) {
            a[i] = in.nextInt();
        }

        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            b[i] = in.nextInt();
        }

        System.out.println(maxKey(m,n,a,b));
    }
}
