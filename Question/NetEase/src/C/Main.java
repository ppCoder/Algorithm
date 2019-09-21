package C;

import java.util.Scanner;

/**
 * @Title
 * @Description 保证积木序列h绝对递增，操作：1 给一块积木。2 拿走一块积木。3 走到下一块积木
 * @Author ppgoder
 * @Date 2019-09-21 16:13
 * @Version V1.0
 **/
public class Main {
    static String judge(int n,int m,int[] h){
        int pack = m;
        for (int j = 0,tag=0; j < n; j++) {
            if(j==0&&h[j]!=0) {
                pack++;h[j]--;tag = h[j];
            }
            else if(pack>0&&h[j]==tag){
                pack--;h[j]++;tag = h[j];
            }
            else if(h[j]+1>tag){
                pack++;h[j]--;tag = h[j];
            }
            else return "NO";
        }
        return "YES";
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int n = in.nextInt();
            int m = in.nextInt();
            int[] h = new int[n];
            for (int j = 0; j < n; j++) {
                h[j] = in.nextInt();
            }
            System.out.println(judge(n,m,h));
        }
    }
}
