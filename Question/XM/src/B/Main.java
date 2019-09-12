package B;

import java.util.Scanner;

/**
 * @Author dml
 * @Date 2019/9/11 20:00
 * @Description 模拟2048的一次变换
 **/
public class Main {

    /**
     * @author: dml
     * @date: 2019/9/11 20:01
     * @param input 一个字符串数组，代表一个数字矩阵，每行中空格分割数字
     * @return 矩阵向左移动一次之后的新矩阵
     */
    static String solution(String[] input) {
        StringBuffer newS = new StringBuffer();
        for (int i = 0; i < input.length; i++) {
            String[] par = input[i].split(" ");
            int[] a = new int[par.length];
            for (int j = 0; j < par.length; j++) {
                a[j] = Integer.parseInt(par[j]);
            }

            int insert = 0,point = 0;
            while(insert<a.length){
                if(point<a.length&&a[point]!=0){
                    if(point<a.length-1&&a[point]==a[point+1]){
                        int sum = a[point]*2;
                        a[point++] = 0;a[point++] = 0;
                        a[insert++] = sum;
                    }
                    else a[insert++] = a[point++];
                }
                else if(point>=a.length) a[insert++]=0;
                else point++;
            }

            for (int j = 0; j < a.length; j++) {
                newS.append(a[j]);
                if(j<a.length-1) newS.append(" ");
            }
            input[i] = new String(newS);
        }
        return new String(newS);
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String res;

        int _input_size = 0;
        _input_size = Integer.parseInt(in.nextLine().trim());
        String[] _input = new String[_input_size];
        String _input_item;
        for(int _input_i = 0; _input_i < _input_size; _input_i++) {
            try {
                _input_item = in.nextLine();
            } catch (Exception e) {
                _input_item = null;
            }
            _input[_input_i] = _input_item;
        }

        res = solution(_input);
        System.out.println(res);
    }
}
