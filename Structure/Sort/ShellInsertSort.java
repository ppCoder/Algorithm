package Sort;

public class ShellInsertSort {
    private void shellInsert(int[] nums,int d){
        for (int i = 1+d; i < nums.length; i++) {
            nums[0] = nums[i];
            int j=i-d;
            while(j>0&&nums[0]<nums[j]){
                nums[j+d] = nums[j];
                j = j-d;
            }
            nums[j+d]=nums[0];
        }
    }

    private void shellSort(int[] nums, int[] di){
        for (int d : di) shellInsert(nums, d);
    }


    /**
     * 希尔排序
     * 时间复杂度:O(n(longn)2) 空间复杂度:O(1)
     * 初始记录无需，n较大
     * 不能用于链式结构
     * @param nums
     */
    public void main(int[] nums){
        int[] di = {5,3,2,1};
        shellSort(nums,di);
    }
}
