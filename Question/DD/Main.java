package DD;

import java.util.Scanner;
import java.util.Stack;

/**
 * @Author dml
 * @Date 2019/8/27 19:58
 * @Description 2020校招滴滴工程a卷
 **/
public class Main {
    /**
     * @author: dml
     * @date: 2019/8/29 14:13
     * @desciption 将相邻的两个数字尽可能的以字典序排序，运算符位置不变
     * @return newS 排序好的字符串
     */
    public static  String sortArith(){
        //Scan
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        int n = Integer.parseInt(s);
        String str = in.nextLine();
        String[] strs = str.split(" ");

        /*！！！逻辑出大问题，兄弟！！！！*/
        for (int i = 1; i < 2*n-1; i += 2) {
            if((strs[i].equals("/")&&((i+2)<(2*n-1))&&!strs[i+2].equals("/"))) i += 2;
            else if(strs[i].equals("*")
                    || ((strs[i].equals("+") || strs[i].equals("-")) && ((i+2 == 2*n-1) || ((i+2)<(2*n-1)) && !strs[i+2].equals("*") && !strs[i+2].equals("/")))){
                if(Integer.parseInt(strs[i-1]) > Integer.parseInt(strs[i+1])){
                    String t = strs[i-1];
                    strs[i-1] = strs[i+1];
                    strs[i+1] = t;
                    i = -1;
                }
                if(i!=-1&&strs[i].equals("*")&&((i+2)<(2*n-1))&&!strs[i+2].equals("*")) i += 2;
            }
            else if((strs[i].equals("/"))&&((i+2)<(2*n-1))&&(strs[i+2].equals("/"))){
                if(Integer.parseInt(strs[i+1]) > Integer.parseInt(strs[i+3])){
                    String t = strs[i+1];
                    strs[i+1] = strs[i+3];
                    strs[i+3] = t;
                    i = -1;
                }
            }
        }

        StringBuffer newS = new StringBuffer();
        for (int i = 0; i < strs.length; i++) {
            newS.append(strs[i]);
        }
        return new String(newS);
    }

    public static void main(String[] args) {
        System.out.println(sortArith());
    }
}
