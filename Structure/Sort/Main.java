package Sort;

public class Main {
    //排序规则：递增
    public static void main(String[] args) {

        int[] nums = {0, 4, 5, 7, 6, 3, 1, 9, 2, 8};
        for (int i : nums) System.out.printf("%d, ", i);
        System.out.println();

        //直接插入排序
//        DirectInsertSort di = new DirectInsertSort();

        //折半插入排序
//        BinaryInsertionSort di = new BinaryInsertionSort();

        //希尔排序
//        ShellInsertSort di = new ShellInsertSort();

        //冒泡排序
//        BubbleSort di = new BubbleSort();

        //快速排序
//        QuickSort di = new QuickSort();

        //简单选择排序
//        SelectSort di = new SelectSort();

        //锦标赛排序
//        TreeSelectionSort di = new TreeSelectionSort();

        //堆排序
//        HeapSort di = new HeapSort();

        //归并排序
//        MergingSort di = new MergingSort();

        //基数排序
        RaxingSort di = new RaxingSort();

        di.main(nums);
        for (int i : nums) System.out.printf("%d, ", i);

    }
}
