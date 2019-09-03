package Weibo.A;

import java.util.Scanner;

/**
 * @Author dml
 * @Date 2019/8/31 17:00
 * @Description
 **/
public class Main {

    /**
     * @author: dml
     * @date: 2019/8/31 17:27
     * @param list
     * @return
     */
    public static String getMinVersion(String[] list) {
        String Min = list[0];
        for (int i = 1; i < list.length; i++) {
            /*不使用转义字符，通过率80%*/
//            char[] num = list[i].toCharArray();
//            char[] min = Min.toCharArray();
//            for (int j = 0; j < num.length && j < min.length; j++) {
//                if(num[j] < min[j]){
//
//                    Min = list[i];
//                    break;
//                }
//                else{
//                    if(j+1<min.length&&min[j+1]!='.'&&(j+1>=num.length||num[j+1]=='.')){
//                        Min = list[i];
//                    }
//                }
//            }

            /*使用转义字符*/
            String[] num = list[i].split("\\.");
            String[] min = Min.split("\\.");
            for (int j = 0; j < num.length && j < min.length; j++) {
                if(Integer.parseInt(num[j])<Integer.parseInt(min[j])){
                    Min = list[i];
                    break;
                }
            }
        }
        return Min;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        String[] strs = s.split(", ");
        System.out.println(getMinVersion(strs));
    }

}
