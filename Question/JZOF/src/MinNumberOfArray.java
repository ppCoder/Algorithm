package JZOffer;

public class MinNumberOfArray {
    public int searchMinNumber(int[] array){
        int min = 0;
        for(int i=1;i<array.length;i++){
            if(array[i] < array[min]){
                min = i;
            }
        }
        return min;
    }

    public int minNumberInRotateArray(int[] array){
        if(array.length == 0)
            return 0;
        int start = 0;
        for(int i=searchMinNumber(array);i<array.length;i++){
            int space = array[start];
            array[start] = array[i];
            array[i] = space;
            start++;
        }
        return array[0];
    }

    public static void main(String[] args){
        int[] array = {3,4,5,1,2};
        MinNumberOfArray m = new MinNumberOfArray();
        System.out.println(m.minNumberInRotateArray(array));
    }
}
