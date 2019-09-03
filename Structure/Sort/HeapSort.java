package Sort;

public class HeapSort {
    private void heapAdust(int[] nums,int s,int m){
        for (int i = s*2; i <= m; i *= 2) {
            nums[0] = nums[s];
            if(i < m && nums[i] < nums[i+1])i++;
            if(i < m && nums[s] > nums[i])break;
            nums[s] = nums[i];
            nums[i] = nums[0];
            s = i;
        }
    }
    private void creatHeap(int[] nums){
        for (int i = nums.length/2-1; i > 0; i--) {
            heapAdust(nums,i,nums.length-1);
        }
    }

    /**
     * 堆排序
     * 时间复杂度:O(nlongn) 空间复杂度:O(1)
     * 建初堆所需的比较次数较多，记录数较少时不易采用
     * 不稳定，只能用于顺序结构
     * @param nums
     */
    public void main(int[] nums){
        creatHeap(nums);
        for (int i = nums.length-1; i > 1; i--) {
            nums[0] = nums[1];
            nums[1] = nums[i];
            nums[i] = nums[0];
            heapAdust(nums,1,i-1);
        }
    }
}
