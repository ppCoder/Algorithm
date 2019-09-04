package B;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 * @Author dml
 * @Date 2019/9/4 20:10
 * @Description
 **/
public class Main {


    /*70*/
    /*请完成下面这个函数，实现题目要求的功能
    当然，你也可以不按照下面这个模板来作答，完全按照自己的想法来 ^-^
    ******************************开始写代码******************************/
    static String resolve(String expr) {
        char[] strs = expr.toCharArray();
        Stack exp = new Stack();
        StringBuffer s = new StringBuffer();
        String newS = "";
        for (int i = 0; i < strs.length; i++) {
            if(strs[i] == ')'){
                char t = (char)exp.pop();
                while(!exp.empty()&&t != '(') {
                    s.append(t);
                    t = (char)exp.pop();
                }
                if(exp.empty()&&t != '(')return "";
                newS = new String(s);
                if(!exp.empty()){
                    if(!exp.empty()) s = new StringBuffer();
                    char[] ns = newS.toCharArray();
                    for (int j = 0; j < ns.length; j++) {
                        exp.push(ns[j]);
                    }
                }
            }
            else {
                exp.push(strs[i]);
            }
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
