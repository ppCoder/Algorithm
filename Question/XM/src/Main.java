import java.util.Scanner;

public class Main {
    private int m,n,k;
    private int i = 0;
    private Main(int m,int n,int k){
        this.m = m;
        this.n = n;
        this.k = k;
    }
    private void EscapeGame(int x,int y,int kk){
        if(x>=0&&y>=0&&x<m&&y<n){
            if(kk < k) {
                //向上
                EscapeGame(x, y - 1, kk+1);
                EscapeGame(x - 1, y, kk+1);
                EscapeGame(x, y + 1, kk+1);
                EscapeGame(x + 1, y, kk+1);
            }
        }
        else
            System.out.println("The "+ ++i+" has escaped");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int m = input.nextInt();
        int n = input.nextInt();
        int x = input.nextInt();
        int y = input.nextInt();
        int k = input.nextInt();
        Main ma = new Main(m,n,k);
        ma.EscapeGame(x,y,0);
    }
}
