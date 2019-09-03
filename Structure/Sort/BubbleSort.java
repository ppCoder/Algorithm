package Sort;

public class BubbleSort {
    /**
     * 冒泡排序
     * 时间复杂度:O(n2) 空间复杂度:O(1)
     * 算法平均时间性能比直接插入差，初始记录无序，n较大不宜采用
     * 可用于链式结构
     * @param nums
     */
    public void main(int[] nums){
        for (int i = 1; i < nums.length; i++) {
            for (int j = nums.length-1; j > i; j--) {
                if(nums[j]<nums[j-1]){
                    int p = nums[j];
                    nums[j] = nums[j-1];
                    nums[j-1] = p;
                }
            }
        }
    }
}
