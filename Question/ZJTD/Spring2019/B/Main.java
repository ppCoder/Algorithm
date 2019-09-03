package B;

import java.util.Scanner;

/**
 * @Title 万万没想到之抓捕孔连顺
 * @Description
 * @Author ppgoder$
 * @Date 2019-09-02$ 16:43$
 * @Version V1.0
 **/
public class Main {

    public static int sum(int n, int d, int[] a){
        int sum = 0;
        for (int i = 0; i < n; i++) {

        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int d = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        System.out.println(sum(n,d,a));
    }
}
