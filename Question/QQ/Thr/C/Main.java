package Thr.C;

import java.util.Scanner;

/**
 * @Title
 * @Description 0% pass, but i test lots of cases what's the answer is right.
 * @Author ppgoder
 * @Date 2019-09-20 21:03
 * @Version V1.0
 **/
public class Main {

    /* 将所有员工平均分成两组，且战力不能相差太大*/

    /**
     * created by dongml at 2019-09-20 22:09
     *
     * @param n 每组员工数量
     * @param a 所有员工的战力数组
     */
    static void sum(int n,int[] a){
        //员工战力排序
        for (int k = 0; k < n-1; k++) {
            for (int j = 0; j < n-k-1; j++) {
                if(a[j] > a[j+1]){
                    int te = a[j];
                    a[j] = a[j+1];
                    a[j+1] = te;
                }
            }
        }
        //分组并叠加战力
        int c = 0,b=0;
        if(n==2){
            c = a[0];
            b = a[1];
        }
        else if(n==3){
            c = a[0]+a[1];
            b = a[2];
        }
        else {
            for (int j = 0; j < n / 2; j = j + 2) {
                c = c + a[j] + a[n - 1 - j];
                if (j + 1 < n / 2) b = b + a[j + 1] + a[n - 2 - j];
            }
            if (c > b && n % 2 == 1) b += a[n/2];
            else if (c <= b && n % 2 == 1) c += a[n/2];
        }
        if(c > b){
            int t = c;
            c = b;
            b = t;
        }
        System.out.printf("%d %d\n",c,b);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = Integer.parseInt(in.nextLine());
        int[] n = new int[t];
        String[] s = new String[t];
        for (int i = 0; i < t; i++) {
            n[i] = Integer.parseInt(in.nextLine());
            s[i] = in.nextLine();
        }
        for (int i = 0; i < t; i++) {
            String[] ch = s[i].split(" ");
            int[] a = new int[n[i]];
            for (int j = 0; j < n[i]; j++) {
                a[j] = Integer.parseInt(ch[j]);
            }
            sum(n[i],a);
        }
    }
}
