package KS;

import java.util.Scanner;

/**
 * @Author dml
 * @Date 2019/8/25 17:01
 * @Description
 **/
public class Main {

    /**
     * @author: dml
     * @date: 2019/8/25 17:02
     * @return
     */
    public static boolean main(Scanner in){
        String s = in.nextLine();
        String[] str = s.split(" ");
        System.out.println(str[0]+","+str[1]);

        char[] A = str[0].toCharArray();
        char[] B = str[1].toCharArray();
        for (int j = 0; j < Math.min(A.length,B.length); j++) {
            if(A[j]!='\0' &&B[j]!='\0' && A[j] < B[j])
                return true;
            if(A[j]=='\0'&&B[j]!='0')
                return true;
        }
        if((A.length<B.length)&&(B[A.length+1]!='0'))return true;
        return false;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String N = in.nextLine();//迭代次数
        int n = Integer.parseInt(N);
        for (int i = 0; i < n; i++) {
            if(main(in))System.out.println("true");
            else System.out.println("false");
        }
    }
}
