package Sort;

public class QuickSort {
     private int Paritition(int[] nums,int low,int high){
          nums[0] = nums[low];
          while(low<high){
               while(low<high&&nums[high]<nums[0])high--;
               nums[low++]=nums[high];
               while(low<high&&nums[low]>nums[0])low++;
               nums[high--]=nums[low];
          }
          nums[high]=nums[0];
          return high;
     }

     private void QSort(int[] nums,int low,int high){
          if(low<high){
               int mid = Paritition(nums,low,high);
               QSort(nums,low,mid-1);
               QSort(nums,mid+1,high);
          }
     }

     /**
      * 快速排序
      * 时间复杂度:O(nlongn) 空间复杂度:O(longn)/O(n)
      * 不稳定，适合初始记录无序，n较大
      * 是内部排序方法中速度最快的一种
      * 不适合链式结构
      * @param nums
      */
     public void main(int[] nums){
         QSort(nums,1,nums.length-1);
     }
}
