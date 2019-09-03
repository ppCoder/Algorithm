//package ZJTD.c1;
//
//import java.util.Scanner;
//
//public class Main {
//
//    public static void main(String[] args) {
//        /**
//         * 输入区间
//         */
//        Scanner scanner = new Scanner(System.in);
//        int m = scanner.nextInt();
//        int[][] a = new int[m][2];
//        for (int i = 0; i < m; i++) {
//            a[i][0]= scanner.nextInt();
//            a[i][1]= scanner.nextInt();
//        }
//        //到达教室所需的时间
//        int n = scanner.nextInt();
//        int hour = scanner.nextInt();
//        int min = scanner.nextInt();
//        /**
//         * 条件判断区间：m<=100,0<=a1<24,0<=a2<60,0<=x<=100,0<=hour<24,0<=min<60
//         * 且,数据保证至少有一个闹钟可以让牛牛赶到教室
//         */
//        //TODO
//        /**
//         * 算法区间
//         */
//        int n_h = n/60;System.out.println(n_h);
//        int n_m = n%60;System.out.println(n_m);
//        for (int i = 0; i < m; i++) {
//            if(a[i][0]+n_h>hour) {
//                System.out.println(a[i-1][0]+" "+a[i-1][1]);break;
//            }
//            if(a[i][0]+n_h==hour){
//                if(a[i][1]+n_m>min) {
//                    System.out.println(a[i-1][0]+" "+a[i-1][1]);
//                    break;
//                }
//            }
//            if(i==m-1)System.out.println(a[m-1][0]+" "+a[m-1][1]);
//        }
//    }
//}
