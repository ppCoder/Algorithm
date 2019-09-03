package JZOffer;

import java.util.Scanner;

public class BlackAndWhiteRectangle {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int [][] a = new int[n][m];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                a[i][j] = scanner.nextInt();
            }
        }
        //if(n == 2 || m == 2)暂不判断错误信息
        //判断每行偶数项相等，奇数项相等
        //四个边界结点不考虑
        //统计每行最大相等的个数，判断所有行的最大相等个数是否相同，相同则累加
        for(int i = 1; i < m; i = i+2){

        }
        for(int i = 0; i < n; i = i+2){
            if(i==0||i==(n-1)){

            }
            else{

            }
        }

    }
}
