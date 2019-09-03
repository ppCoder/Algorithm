package JZOffer;

public class ConverseOlen {
    public int getOvenPosition(int[] array){//得到奇数的个数
        int ovenPosition = 0;
        for(int i=0; i<array.length;i++)
            if(array[i]%2 != 0)
                ovenPosition++;
        return ovenPosition;
    }

    public int searchRecentOvenPosition(int n,int[] array){//查询最近一个奇数的位置,n为起点
        for(int i = n;i<array.length;i++){
            if(array[i]%2 != 0){
                return i;
            }
        }
        return 0;
    }

    public void convertEvenToOven(int start,int end,int[]array){//将最近的奇数提前
        for(int i=end;i>start;i--){
            int space = array[i];
            array[i] = array[i-1];
            array[i-1] = space;
        }
    }

    public void reOrderArray(int [] array) {
        int n = getOvenPosition(array);
        for(int i = 0;i<n;i++){
            if(array[i]%2 == 0){
                convertEvenToOven(i,searchRecentOvenPosition(i,array),array);
            }
        }
    }

    public static void main(String[] args){
        int[] n = {2,4,6,1,3,5,7};
        ConverseOlen c = new ConverseOlen();
        c.reOrderArray(n);
        for(int i = 0; i<n.length;i++)
        System.out.printf("%d ",n[i]);
    }
}
