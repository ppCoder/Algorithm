package B;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 * @Author dml
 * @Date 2019/9/4 20:10
 * @Description 将括号里的字符翻转,不匹配的输出空字符
 **/
public class Main {

    /*请完成下面这个函数，实现题目要求的功能
    当然，你也可以不按照下面这个模板来作答，完全按照自己的想法来 ^-^
    ******************************开始写代码******************************/

    /**
     * created by dongml at 2019-09-05 14:44
     * @description 1.reverse the character in brackets
     *              2.just fixed the character out of brackets
     *              3.Output blanket character if not match
     * @param expr
     * @return
     */
    static String resolve(String expr) {
        char[] strs = expr.toCharArray();
        Stack exp = new Stack();
        StringBuffer s = new StringBuffer();
        String newS = expr;
        int start = 0;
        for (int i = 0; i < strs.length; i++) {
            //controller
            if(strs[i] == '(') start++;
            else if(strs[i]==')') start--;
            //read and reverse
            if(start<0&&strs[i]==')') return "";
            else if(start>0&&strs[i]!=')') exp.push(strs[i]);
            else if(start>=0&&strs[i]==')'){
                while(!exp.empty()) {
                    char t = (char)exp.pop();
                    if(t == '(')break;
                    else if(exp.empty())return "";
                    s.append(t);
                }
                newS = new String(s);
                if(!exp.empty()){
                    s.delete(0,s.length());
                    char[] ns = newS.toCharArray();
                    for (int j = 0; j < ns.length; j++) {
                        exp.push(ns[j]);
                    }
                }
            }
            else if(start==0&&strs[i]!='('&&strs[i]!=')') s.append(strs[i]);
        }
        if(!exp.empty()) return "";
        return newS;
    }
    /******************************结束写代码******************************/


    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String res;

        String _expr;
        try {
            _expr = in.nextLine();
        } catch (Exception e) {
            _expr = null;
        }

        res = resolve(_expr);
        System.out.println(res);
    }
}
