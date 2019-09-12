package A;

import java.util.Scanner;

/**
 * @Author dml
 * @Date 2019/9/11 19:32
 * @Description 最小移动距离，即相邻数字的差。
 **/
public class Main {
    //移动距离最小，即数组有序（正序或者倒序）
    static int solution(int[] arr){
        int ma = 0,mb = 0;
        int[] b = arr.clone();
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i]>arr[i+1]){
                int r = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = r;
                ma++;
                i = -1;
            }
        }
        for (int i = 0; i < arr.length-1; i++) {
            if(b[i]<b[i+1]){
                int r = b[i];
                b[i] = b[i+1];
                b[i+1] = r;
                mb++;
                i = -1;
            }
        }
        for (int k:arr) {
            System.out.printf("%d ",k);
        }
        System.out.println(ma);
        for (int k:b) {
            System.out.printf("%d ",k);
        }
        System.out.println(mb);
        if(ma>mb)return mb;
        else return ma;
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
