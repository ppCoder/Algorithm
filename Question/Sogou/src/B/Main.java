package B;

import java.util.Scanner;

/**
 * @Title
 * @Description
 * @Author ppgoder$
 * @Date 2019-09-16$ 20:16$
 * @Version V1.0
 **/
public class Main {

    //run a 0%?? but the answer is right in compiler
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();//槽位个数
        int n = in.nextInt();//计算轮数
        int a,b;
        int[] c = new int[m];
        for (int i = 1; i <= n; i++) {
            a = in.nextInt();
            b = in.nextInt();
            for (int j = a; j <= b; j++) {
                c[j] = i;
            }
        }
        int sum = 0;
        for (int i = 0; i < m; i++) {
            sum += i*c[i];
        }
        sum = sum % 100000009;
        System.out.println(sum);
    }
}
