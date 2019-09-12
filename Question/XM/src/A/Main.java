package A;

import java.util.Scanner;

/**
 * @Author dml
 * @Date 2019/9/11 19:32
 * @Description 最小移动距离，即相邻数字的差。
 **/
public class Main {
    //移动距离最小，即数组有序（正序或者倒序）
    //可以和任意数字交换，所以只要排好位置，填空
    static int solution(int[] arr){
        int ma = 0,mb = 0,mc=0;
        int[] a = arr.clone(),b = arr.clone(),c;
        for (int i = 0; i < a.length-1; i++)
            if(a[i]>a[i+1]){
                int r = a[i];
                a[i] = a[i+1];
                a[i+1] = r;
                ma++;
                i = -1;
            }
        for (int i = 0; i < b.length-1; i++)
            if(b[i]<b[i+1]){
                int r = b[i];
                b[i] = b[i+1];
                b[i+1] = r;
                mb++;
                i = -1;
            }

        if(ma>mb) c = b;
        else c = a;
        for (int i = 0; i < c.length; i++)
            if(arr[i]!=c[i])
                for (int j = i+1; j < c.length; j++)
                    if(arr[j]==c[i]){
                        int t = arr[j];
                        arr[j] = arr[i];
                        arr[i] = t;
                        mc++;
                        break;
                    }

        return mc;
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int res;

        int _arr_size = 0;
        _arr_size = Integer.parseInt(in.nextLine().trim());
        int[] _arr = new int[_arr_size];
        int _arr_item;
        for(int _arr_i = 0; _arr_i < _arr_size; _arr_i++) {
            _arr_item = Integer.parseInt(in.nextLine().trim());
            _arr[_arr_i] = _arr_item;
        }

        res = solution(_arr);
        System.out.println(String.valueOf(res));

    }
}
