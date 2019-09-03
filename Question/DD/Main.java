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
    public String main(){
        //Scan
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        int n = Integer.parseInt(s);
        String str = in.nextLine();
        String[] strs = str.split(" ");

        //judge
        for (int i = 1; i < 2*n-1; i=i+2) {
            if(strs[i].equals("*")||strs[i].equals("/")){
                if(Integer.parseInt(strs[i-1]) > Integer.parseInt(strs[i+1])){
                    String t = strs[i-1];
                    strs[i-1] = strs[i+1];
                    strs[i+1] = t;
                }
            }
            else {
                if(!strs[i+2].equals("*")&&!strs[i+2].equals("/")){
                    if(Integer.parseInt(strs[i-1]) > Integer.parseInt(strs[i+1])){
                        String t = strs[i-1];
                        strs[i-1] = strs[i+1];
                        strs[i+1] = t;
                    }
                }
            }
        }

        StringBuffer newS;

        return str;
    }
}
