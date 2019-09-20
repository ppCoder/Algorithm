package Thr.A;

import java.util.Scanner;

/**
 * @Title
 * @Description 90% pass，
 * @Author ppgoder
 * @Date 2019-09-20 20:05
 * @Version V1.0
 **/
public class Main {
    /* 企鹅号码：1、11位；2、第一个数字是8*/
    static String judge(int n,String s){
        char[] strs = s.toCharArray();
        for (int i = 0; i < n-10; i++) {
            if(strs[i]=='8'){
                return "YES";
            }
        }
        return "NO";
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = Integer.parseInt(in.nextLine());
        int[] n =  new int[t];
        String[] s =  new String[t];
        for (int i = 0; i < t; i++) {
            n[i] = Integer.parseInt(in.nextLine());
            s[i] = in.nextLine();
        }
        for (int i = 0; i < t; i++) {
            System.out.println(judge(n[i],s[i]));
        }
    }
}
