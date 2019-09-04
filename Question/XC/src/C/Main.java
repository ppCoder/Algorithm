package C;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


/**
 * @Author dml
 * @Date 2019/9/4 20:45
 * @Description
 **/

public class Main {

    static void sort(int[] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if(array[j] < array[j+1]){
                    int t = array[j];
                    array[j] = array[j+1];
                    array[j+1] = t;
                }
            }
        }
    }
    /*请完成下面这个函数，实现题目要求的功能
    当然，你也可以不按照下面这个模板来作答，完全按照自己的想法来 ^-^
    ******************************开始写代码******************************/
    static int schedule(int m,int[] array) {
        int[] point = new int[m];
        sort(array);//从大到小
        int k=m-1;
        for (int i = 0; i < m; i++) {
            point[i] = 0;
        }
        for (int i = 0; i < array.length; i++) {
            if(k < 0){
                sort(point);//从大到小
                k = m-1;
            }
            else point[k--] += array[i];
        }
        sort(point);
        return point[point.length-1];
    }
    /******************************结束写代码******************************/


    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int size  = in.nextInt();
        int[] array = new int[size];
        for(int i = 0; i < size; i++) {
            array[i] = in.nextInt();
        }
        int res = schedule(m,array);
        System.out.println(String.valueOf(res));
    }
}

