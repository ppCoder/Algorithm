package test.JDtest.Nowcodertest;

import java.util.Scanner;

//public class JDTest{
//    /**
//     *
//     * @param args
//     */
//    public static void main(String[] args) {
//        /**
//         * 此乃输入
//         * 同理，输入范围暂时不做控制，(●'◡'●)
//         */
//        Scanner reader = new Scanner(System.in);
//        int n = reader.nextInt();//图上结点数量
//        int m = reader.nextInt();//有向边的数量
//        int[][] array = new int[m][2];
//        int[] p = new int[n+1];
//        for (int i = 0; i < m; i++) {
//            array[i][0] = reader.nextInt();
//            p[array[i][0]]--;
//            array[i][1] = reader.nextInt();
//            p[array[i][1]]++;
//        }
//        /**
//         * 因不记得全排列是何
//         * 故根据样例猜测，是从1然后遍历完所有序列的一个序列
//         * 使得权值最小(●'◡'●)
//         *
//         * 呃，猜不出来全排练是啥- -！我觉得我找不到逻辑，无法下手
//         * 再见
//         */
//        System.out.println(1+" "+2+" "+3);
//    }
//}





/*
public class test.JDTest {
    *//**
     * 饮料体积=原料体积*原料比例
     * 求出每个原料可以制作的饮料体积
     * 求最小原料体积
     * @param args
     *//*
    public static void main(String[] args) {
        *//**
         * 输入范围的控制：因为不能输出错误信息
         * 而void没有返回值，则暂不判断范围
         *//*
        Scanner reader = new Scanner(System.in);
        int n = reader.nextInt();//原料种类
        int V = reader.nextInt();//容器容积
        double[] a = new double[n];//原料配比
        double[] b = new double[V];//原料体积

        *//**
         * Step1:求原料总占比
         *//*
        double sum = 0;//总配比数
        for (int i = 0; i < n; i++) {
            a[i] = reader.nextInt();
            sum += a[i];
        }
        *//**
         * step2：求各个原料可制作的饮料体积
         * step3:求最小的可制作饮料体积
         * 如果超过V，则替换为V
         *//*
        double min = V;
        for (int i = 0; i < n; i++) {
            b[i] = reader.nextInt();
            a[i] = a[i]/sum;//将原料配比替换为原料总占比
            b[i] = b[i]/a[i];//将原料体积替换为可制作饮料体积
            if(b[i] < min){
                min = b[i];
            }
        }
        System.out.printf("%.4f",min);
    }
}*/
