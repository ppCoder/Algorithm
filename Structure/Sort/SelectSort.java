package Sort;

public class SelectSort {
    /**
     * 简单选择排序
     * 时间复杂度:O(n2) 空间复杂度:O(1)
     * 稳定，比直接插入排序快
     * 可用于链式结构
     * @param nums
     */
    public void main(int[] nums){
        for (int i = 1; i < nums.length; i++) {
            int k = i;
            for (int j = i+1; j < nums.length; j++)
                if(nums[k]>nums[j])k=j;
            if(k!=i){
                int p = nums[i];
                nums[i] = nums[k];
                nums[k] = p;
            }
        }
    }
}
