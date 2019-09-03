package Alibaba.A;

import java.util.Scanner;

/**
 * @Author dml
 * @Date 2019/8/30 19:36
 * @Description 阿里巴巴JAVA附加卷
 **/
public class Main {

    /**
     * @author: dml
     * @date: 2019/8/30 19:43
     * @param n 区域大小
     * @param area 方格中数字
     * @return 最快时间通过区域到达对边所需要的时间
     */
    private static int getMinimumTimeCost(int n, int[][] area) {
        //寻找一条最短路径，偶数行的路径
        //每条路径必须满足：长+2||宽+2，和最小
        int minLine = 999999;
        //i=宽，j=高
        go(0,0,n,minLine,0,area);
        go(0,1,n,minLine,0,area);
        return minLine;
    }

    //向右为正方向
    private static void go(int j,int i,int n,int minLine,int line,int[][] area){
        int Line = line;
        if(i+2 < n) {
            Line += area[j][i+1];
            go(i + 2, j, n, minLine, Line, area);
        }
        if(j+2 < n) {
            Line += area[j+1][i];
            go(i, j + 2, n, minLine, Line, area);
        }
        if(j+2 >= n && Line < minLine) minLine = Line;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();
        int n = Integer.parseInt(line);
        int[][] area = new int[n][n];

        for (int i = 0; i < n; i++) {
            line = scanner.nextLine();
            String[] split = line.split(",");
            if (split.length != n) {
                throw new IllegalArgumentException("错误输入");
            }
            int j = 0;
            for (String num : split) {
                area[i][j++] = Integer.parseInt(num);
            }
        }

        int minimumTimeCost = getMinimumTimeCost(n,area);
        System.out.println(minimumTimeCost);
    }
}
