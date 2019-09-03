package A;

import java.util.Scanner;

/**
 * @Title 万万没想到之聪明的编辑
 * @Description AAA➡AA，AABB➡AAB
 * @Author ppgoder$
 * @Date 2019-09-02$ 15:59$
 * @Version V1.0
 **/
public class Main {

    public static String fixStr(String s){
        char[] strs = s.toCharArray();
        char m = '\0';
        for (int i = 0; i < strs.length; i++) {
            if(m=='\0'&&i+1<strs.length&&strs[i]==strs[i+1])
                m = strs[i++];
            else if(m!='\0'&&strs[i]==m){
                strs[i-2] = '\0';
            }
            else if(m!='\0'&&i+1<strs.length&&strs[i]!=m&&strs[i]==strs[i+1]) {
                strs[i] = '\0';
            }
            else if(m!='\0'&&i+1<strs.length&&strs[i]!=m&&strs[i]!=strs[i+1]){
                m = '\0';
            }
        }
        StringBuffer newS = new StringBuffer();
        for (int i = 0; i < strs.length; i++) {
            if(strs[i]!='\0')newS.append(strs[i]);
        }
        String newStr = new String(newS);
        return newStr;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String N = in.nextLine();
        int n = Integer.parseInt(N);
        String[] str = new String[n];
        for (int i = 0; i < n; i++) {
            str[i] = in.nextLine();
        }
        for (int i = 0; i < n; i++) {
            System.out.println(fixStr(str[i]));
        }
    }
}
