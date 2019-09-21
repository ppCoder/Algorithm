package B;

import java.util.Scanner;

/**
 * @Title
 * @Description 三堆苹果，分三个人吃，a吃1，2堆苹果，b吃2，3堆，c吃1，3堆，两两差值尽量小
 * @Author ppgoder
 * @Date 2019-09-21 16:01
 * @Version V1.0
 **/
public class Main {
    static void sort(int[] num){
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num.length - 1 - i; j++) {
                if(num[j]>num[j+1]){
                    int t = num[j];
                    num[j] = num[j+1];
                    num[j+1] = t;
                }
            }
        }
    }

    static int eat(int[] num){
        return 0;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int[][] pre_input = new int[t][3];
        for (int i = 0; i < t; i++) {
            pre_input[i][0] = in.nextInt();
            pre_input[i][1] = in.nextInt();
            pre_input[i][2] = in.nextInt();
        }

    }
}
