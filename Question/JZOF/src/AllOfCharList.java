package JZOffer;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 题目描述：
 *          输入一个字符串,按字典序打印出该字符串中字符的所有排列。
 *          例如输入字符串abc,则打印出由字符a,b,c所能排列出来的所有字符串abc,acb,bac,bca,cab和cba。
 * 解题思路：
 *          1.得到字符串的chars序列
 *          2.根据字典序排列:冒泡排序
 *          3.从尾到头扫描
 *          4.如果后面没有字符则输出chars，当前栈帧的字符往前走一个
 *          5.如果后面有字符则在当前字符串中继续递归第3步
 *          6.当扫描到头部则退出
 */
public class AllOfCharList {
    public ArrayList<String> Permutation(String str) {
        //将字符串转化为chars数组
        char[] chars = str.toCharArray();
        //将chars数组字典序实现冒泡排序
        for (int j = 0; j < chars.length; j++) {
            for(int i = 0;i < chars.length-j-1;i++){
                if(chars[i]>chars[i+1]){
                    char temp = chars[i];
                    chars[i] = chars[i+1];
                    chars[i+1] = temp;
                }
            }
        }

        ArrayList<String> strList = new ArrayList<>();
        char[] exchange = chars;
        //从尾到头扫描
        for (int i = chars.length-1; i >= 0; i--) {
            //从当前位置向后扫描
            for (int j = i; j < chars.length; j++) {
                //扫描结束则添加
                if(j == chars.length)strList.add(String.valueOf(exchange));
                else{
                    char temp = chars[i];
                    chars[i] = chars[j+1];
                    chars[j+1] = temp;

                }
            }
        }
        return strList;
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        AllOfCharList allOfCharList =  new AllOfCharList();
        allOfCharList.Permutation(reader.nextLine());
    }
}
