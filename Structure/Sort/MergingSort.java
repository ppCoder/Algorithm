package Sort;

public class MergingSort {
    private void merge(int[] nums,int[] mergeArray,int lo,int mid,int high){
        int i = lo;//左序列指针
        int low = mid+1;//右序列指针
        int k = lo;//临时数组指针
        while (i <= mid && low <= high) {
            if(nums[i]<nums[low])
                mergeArray[k++] = nums[i++];
            else mergeArray[k++] = nums[low++];
        }
        while(i<=mid)mergeArray[k++]=nums[i++];
        while(low<=high)mergeArray[k++]=nums[low++];
        System.arraycopy(mergeArray,lo,nums,lo,high-lo+1);
    }
    private void mSort(int[] nums,int[] mergeArray,int low, int high){
        if(low == high)mergeArray[low]=nums[low];
        else {
            int mid = (low + high)/2;
            mSort(nums,mergeArray,low,mid);
            mSort(nums,mergeArray,mid+1,high);
            merge(nums,mergeArray,low,mid,high);
        }
    }

    /**
     * 归并排序
     * 时间复杂度:O(nlongn) 空间复杂度:O(n)
     * 稳定，需要开辟递归工作栈
     * 适用于链式结构
     * @param nums
     */
    public void main(int[] nums){
        int[] mergeArray = new int[nums.length];
        mSort(nums,mergeArray,1,nums.length-1);
        System.arraycopy(mergeArray,1,nums,1,nums.length-1);
    }
}
