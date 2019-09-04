package A;

import java.util.Scanner;
import java.util.Stack;

/**
 * @Author dongml
 * @Date 2019/8/27 19:58
 * @Description 2020校招滴滴工程a卷
 **/
public class Main {
    /**
     * @author: dongml
     * @date: 2019/8/29 14:13
     * @desciption 将相邻的两个数字尽可能的以字典序排序，运算符位置不变
     * @param n 运算式长度，即，数字个数
     * @param str 运算式
     * @return 排序好的字符串
     */
    public static  String sortArith(int n, String str){
        String[] strs = str.split(" ");

        /*左匹配*/
        for (int i = 1; i < 2*n-1; i += 2) {
            //左右互换不影响结果类型，优先级最大则交换，优先级小遇到优先级大的要让步
            if((strs[i].equals("+")&&((i+2)<(2*n-1))&&strs[i+2].equals("+")&&strs[i+2].equals("-"))
            || strs[i].equals("*")){
                if(Integer.parseInt(strs[i-1]) > Integer.parseInt(strs[i+1])){
                    String t = strs[i-1];
                    strs[i-1] = strs[i+1];
                    strs[i+1] = t;
                    i = -1;
                }
            }
            //左右互换影响结果类型，同类型交换，优先级小的遇到优先级大的要让步
            else if((strs[i].equals("-")&&((i+2)<(2*n-1))&&strs[i+2].equals("-"))
            || (strs[i].equals("/")&&((i+2)<(2*n-1))&&strs[i+2].equals("/"))){
                if(Integer.parseInt(strs[i+1]) > Integer.parseInt(strs[i+3])){
                    String t = strs[i+1];
                    strs[i+1] = strs[i+3];
                    strs[i+3] = t;
                    i = -1;
                }
            }
            //优先级大的遇上优先级小的要覆盖
            if(i!=-1&&(strs[i].equals("*")||strs[i].equals("/"))&&((i+2)<(2*n-1))&&(strs[i+2].equals("+")||strs[i+2].equals("-"))) i += 2;
        }

        StringBuffer newS = new StringBuffer();
        for (int i = 0; i < strs.length; i++) {
            newS.append(strs[i]);
        }
        return new String(newS);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        int n = Integer.parseInt(s);
        String str = in.nextLine();

        System.out.println(sortArith(n,str));
    }
}
