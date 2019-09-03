package Sort;

public class BinaryInsertionSort {
    /**
     * 折半插入排序
     * 时间复杂度:O(n2) 空间复杂度:O(1)
     * 稳定，适合初始记录无序，n较大的情况
     * 不能用于链式结构
     * @param nums
     */
    public void main(int[] nums){
        for (int i = 2; i < nums.length; i++) {
            int head = 1;
            int tail = i-1;
            nums[0] = nums[i];

            while(head<=tail){
                int mid = (head+tail)/2;
                if(nums[0]>nums[mid])
                    head = mid+1;
                else
                    tail = mid-1;
            }
            for (int j = i-1; j > tail; j--)
                nums[j+1]=nums[j];
            nums[tail+1]=nums[0];
        }
    }

}
