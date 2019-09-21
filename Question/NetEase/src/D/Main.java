package D;

import java.util.Scanner;

/**
 * @Title
 * @Description 向前跳台阶，可以跳到k以内的任意一块更低的台阶，有一次机会无视台阶高度
 * @Author ppgoder
 * @Date 2019-09-21 16:53
 * @Version V1.0
 **/
public class Main {

    static String judge(int n,int k,int[] h){
        for (int i = 0; i < n; i++) {

        }
        return "";
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int n = in.nextInt();
            int k = in.nextInt();
            int[] h = new int[n];
            for (int j = 0; j < n; j++) {
                h[j] = in.nextInt();
            }
            System.out.println(judge(n,k,h));
        }
    }
}
