package JZOffer;

import java.util.ArrayList;

public class printRec {
    public ArrayList<Integer> printMatrix(int [][] matrix) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        int x=0,y=0;
        int xh = 0,yh = 0;
        int xl=matrix.length,yl = matrix[0].length;
        while(!(xh == xl||yh==yl)){
            if(x==xh&&y<yl){
                arrayList.add(matrix[xh][y++]);
                if(y==yl)x=++xh;
            }
            else if(x<xl&&y==yl){
                arrayList.add(matrix[x++][yl-1]);
                if(x==xl)y=--yl;
            }
            else if(x==xl&&y>yh){
                arrayList.add(matrix[xl-1][--y]);
                if(y==yh)x=--xl;
            }
            else if(x>xh&&y==yh){
                arrayList.add(matrix[--x][yh]);
                if(x==xh)y=++yh;
            }
        }
        return arrayList;
    }

    public static void main(String[] args) {
        int[][] matrix = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        printRec p =  new printRec();
        p.printMatrix(matrix);
    }
}
