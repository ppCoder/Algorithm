package Sort;

public class DirectInsertSort {
    /**
     * 直接插入排序
     * 时间复杂度:O(n2) 空间复杂度:O(1)
     * 稳定，适合初始记录基本有序
     * 单链表上无需移动记录
     * @param nums
     */
    public void main(int[] nums){
        for (int i = 2; i < nums.length; i++) {
            //哨兵
            nums[0] = nums[i];
            //在有序表中从后向前扫描，如果不符合则后移，符合则退出并插入
            int j = i-1;
            while(nums[0] < nums[j]) {
                nums[j + 1] = nums[j];
                j--;
            }
            nums[j+1] = nums[0];
        }
    }
}
