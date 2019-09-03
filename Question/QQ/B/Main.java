package QQ.B;

import java.util.Scanner;

/**
 * @Author dml
 * @Date 2019/9/1 20:24
 * @Description 排队
 **/
public class Main {

    /*冒泡排序*/
    public static void sort(int n,int[] c){
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-1-i; j++) {
                if(c[j] < c[j+1]){
                    int t = c[j];
                    c[j] = c[j+1];
                    c[j+1] = t;
                }
            }
        }
    }

    /*快速排序*/
    public static void quickSort(int n,int[] c){
        int i = 0;
        while (i < n) {
            i=0;
            while((i+1<n)&&(c[i]>c[i+1])){
                i++;
            }
            if(i>=n-1)break;
            int low = i;
            int high = n-1;
            int t = c[i];
            while(low <= high) {
                if (c[high] < t) {
                    high--;
                }
                else if(c[high] >= t){
                    int temp = c[high];
                    c[high] = c[low];
                    c[low] = temp;
                    low++;
                }
            }
        }
    }

    /**
     * @author: dml
     * @date: 2019/9/1 20:54
     * @param n 顾客的数量
     * @param a ai数组
     * @param b bi数组
     * @param c 建模分析的一个中间数组，保存ai-bi
     * @return 最小不满意度的总和
     */
    public static int minSatisfy(int n, int[] a, int[] b, int[] c){
        int minSum = 0;
        if(n < 20) sort(n,c);
        else quickSort(n,c);

        for (int i = 0; i < n; i++) {
            minSum = minSum + c[i] * (i+1) - (a[i] - n*b[i]);
        }
        return minSum;
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int[] a = new int[n];
        int[] b = new int[n];
        int[] c = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
            b[i] = in.nextInt();
            c[i] = a[i]-b[i];
        }

        System.out.println(minSatisfy(n,a,b,c));
    }
}
