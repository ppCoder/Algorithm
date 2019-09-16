package A;

import java.util.Scanner;

/**
 * @Title
 * @Description 路由ip拦截
 * @Author ppgoder
 * @Date 2019-09-16 19:13
 * @Version V1.0
 **/
public class Main {

    //100%
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] str = in.nextLine().split(" ");
        int n = Integer.parseInt(str[0]);
        int m = Integer.parseInt(str[1]);
        //放行规则
        String[] rule = new String[n];
        String[][] rul = new String[n][4];
        for (int i = 0; i < n; i++) {
            rule[i] = in.nextLine();
            String[] r = rule[i].split("\\.");
            int len = r.length;
            for (int j = 0,k=0; j < 4; j++) {
                if(r[k].equals("*")&&len<4) {rul[i][j] = r[k];len++;}
                else rul[i][j] = r[k++];
            }
        }
        String[] refer = new String[m];
        String[][] ref = new String[m][4];
        for (int i = 0; i < m; i++) {
            refer[i] = in.nextLine();
            ref[i] = refer[i].split("\\.");
        }
        int[] result = new int[m];
        for (int i = 0; i < m; i++) {
            boolean success = false;
            for (int j = 0; j < n; j++) {
                result[i] = 1;
                for (int k = 0; k < 4; k++) {
                    if(!ref[i][k].equals(rul[j][k])&&!rul[j][k].equals("*")){
                        result[i] = 0;
                        break;
                    }
                    if(k == 3&&result[i] == 1) success = true;
                }
                if(success)break;
            }
        }
        for (int i = 0; i < m; i++) {
            System.out.printf("%d ",result[i]);
        }
    }
}
