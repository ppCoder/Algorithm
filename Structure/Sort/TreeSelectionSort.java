package Sort;

public class TreeSelectionSort {
    /**
     * 锦标赛排序 又名树形选择排序
     * 时间复杂度:O(nlongn) 空间复杂度:O(n)
     * 辅助空间多，多余比较，不如堆排序
     * @param nums
     */
    public void main(int[] nums){
        int[] treeArray = new int[(nums.length-1)*2];
        System.arraycopy(nums,1,treeArray,nums.length-1,nums.length-1);

        for (int i = 1; i < nums.length; i++){
            for (int j = treeArray.length/2-1; j > 0; j--)
                if(treeArray[2*j]>treeArray[2 * j + 1])
                    treeArray[j] = treeArray[2 * j + 1];
                else treeArray[j] = treeArray[2 * j];
            if(treeArray[1]>treeArray[2])treeArray[0]=treeArray[2];
            else treeArray[0]=treeArray[1];
            for (int j = treeArray.length/2-1; j < treeArray.length ; j++)
                if(treeArray[j] == treeArray[0])
                    treeArray[j]=100000;
            nums[i]=treeArray[0];
        }
    }
}
