package Thr.B;

import java.util.Scanner;

/**
 * @Title
 * @Description 10%，the problem is array out of boundary
 * @Author ppgoder
 * @Date 2019-09-20 20:25
 * @Version V1.0
 **/
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] x = new int[n];
        int[] y = new int[n];
        int m = 0;
        for (int i = 0; i < n; i++) {
            x[i] = in.nextInt();
            y[i] = in.nextInt();
            m+=x[i];
        }
        //所有员工拖延时间的辅助数组
        int[] z = new int[m];
        for (int i = 0,j=0,k=0; i < m;) {
            if(x[j]>k) {
                z[i] = y[j];
                k++;
                i++;
            }
            else {
                k = 0;
                j++;
            }
        }
        for (int i = 0; i < m; i++) {
            System.out.printf("%d ",z[i]);
        }
        System.out.printf("\n");
        //辅助数组的排序
        for (int i = 0; i < m-1; i++) {
            for (int j = 0; j < m-i-1; j++) {
                if(z[j] > z[j+1]){
                    int te = z[j];
                    z[j] = z[j+1];
                    z[j+1] = te;
                }
            }
        }
        for (int i = 0; i < m; i++) {
            System.out.printf("%d ",z[i]);
        }
        System.out.printf("\n");
        //辅助数组对折
        for (int i = 0; i < m / 2; i++) {
            z[i] += z[m-1-i];
        }
        for (int i = 0; i < m/2; i++) {
            System.out.printf("%d ",z[i]);
        }
        //寻找所有组合中最后完成的时间
        int max = z[0];
        for (int i = 0; i < m / 2; i++) {
            if(z[i]>max){
                max = z[i];
            }
        }
        System.out.println(max);
    }
}
