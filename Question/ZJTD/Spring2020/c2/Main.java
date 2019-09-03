//package ZJTD.c2;
//
//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        int k = scanner.nextInt();
//        scanner.nextInt();
//        String b = scanner.nextLine();
//        char[] s = b.toCharArray();
//        char[] key = new char[n];
//        int len = n+k;
//        char t1 = '0';
//        char t2 = '0';
//        for (int i = 0; i <= n/2; i++) {
//            int ini=0;
////            if(s[0]=='1')ini=1;
//            if(s[len-1-i]!=t1){
//                ini=1;
//                t1=s[len-1-i];
//            }
//            if(ini==0)key[n-1-i]='0';
//            else {
//                key[n-1-i]='1';
//            }
//
//            int init = 0;
////            if(s[1]=='1')init=1;
//            if(s[i+1]!=t2){
//                init =1;
//                t2=s[i+1];
//            }
//            if(init==0)key[i]='0';
//            else {
//                key[i]='1';
//            }
//        }
//        System.out.println(key);
//
//    }
//}
