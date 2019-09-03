package Alibaba.B;

import java.util.Scanner;

/**
 * @Author dml
 * @Date 2019/8/30 20:34
 * @Description
 **/
public class Main {

    /**
     * @author: dml
     * @date: 2019/8/30 20:50
     * @param users 输入的bg字符串，b代表男生，g代表女生
     * @return 返回最幸福的男生位置，返回男生人数最多的数量
     */
    static String getIndexAndLongest(String users) {
        Scanner in = new Scanner(System.in);
        int k = in.nextInt();

        int maxFemale = 0;
        int maxMale = 0;
        int MaleA = 0;
        char[] us = users.toCharArray();
        for (int j = 0; j < k; j++) {
            if(us[j]=='b'){
                maxMale++;
                MaleA = j;
            }
            if(us[j]=='g')maxFemale++;
        }
        for (int i = 0; i < users.length()-k; i++) {
            int maxM = maxMale;
            int maxF = maxFemale;
            if(us[i+k]=='b')maxM++;
            if(us[i+k]=='g')maxF++;
            if(us[i]=='b')maxM--;
            if(us[i]=='g')maxF--;
            if(maxM>maxMale){
                MaleA = i+k;
                maxMale = maxM;
            }
            if(maxF>maxFemale)maxFemale = maxF;
        }
        return MaleA + "," +maxMale;
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String res;

        String _users;
        try {
            _users = in.nextLine();
        } catch (Exception e) {
            _users = null;
        }

        res = getIndexAndLongest(_users);
        System.out.println(res);
    }
}
