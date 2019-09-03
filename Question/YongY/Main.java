package YongY;

import java.util.Scanner;

/**
 * @Author dml
 * @Date 2019/8/25 13:46
 * @Description 用友集团2020届秋招笔试-试题A
 **/
public class Main {
    /**
     * @Title 1
     * @Description 查询单笔订单总金额>100元的订单号，订单总价和用户名称，以及订单总金额降序排列
     */
    //TODO

    /**
     * @author: dml
     * @date: 2019/8/25 14:43
     * @Title 2
     * @Description 将两个代表正整数的字符串的乘积结果输出，不能将字符串转化为数字
     */
    public static int main(){
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String[] number = str.split(",");
        System.out.println(number[0]+","+number[1]);

        if(number[0]=="0")throw new RuntimeException();
        if(number[1]=="0")return 0;

        char[] first = number[0].toCharArray();
        char[] second = number[1].toCharArray();

        int f = Integer.parseInt(number[0]);
        int sum = 0;
        for (int i = 0; i < second.length; i++) {
            f <<= i;
            //TODO
            //f *= Integer.parseInt(String.valueOf(second[i]));
            sum += f;
        }
        return sum;
    }

//    public static void main(String[] args) {
//        System.out.println(main());
//    }
}
