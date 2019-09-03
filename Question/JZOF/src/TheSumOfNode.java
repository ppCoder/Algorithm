package JZOffer;

import java.util.ArrayList;

public class TheSumOfNode {
    public  boolean searchSum(ArrayList<Integer> arrayList,int sum,TreeNode root,int target) {
        //错误结束条件
        if(root == null||root.val > target)return false;
        //正确的结束条件
        sum += root.val; if(sum == target)return true;
        /**
         * 1.数组长度大的考前
         * 处理办法：让数值小的字数先查询
         * 2.先添加数组再进入，如果为错误分支
         * 处理办法：采用先判断再插入的策略
         */
        if(root.left == null || root.left.val > root.right.val){//左子树为空，进入右子树查找
            if(searchSum(arrayList,sum,root.right,target)){//先判断再插入
                arrayList.add(root.right.val);
            }
        }
        if(root.right == null || root.left.val >= root.right.val){//右子树为空，进入左子树查找

        }

        return false;
    }
    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {
        if(root == null)return null;
        ArrayList<ArrayList<Integer>>arrayList = new ArrayList<>();
        ArrayList<Integer> array = new ArrayList<>();
//        arrayList.add(searchSum(array,0,root,target));

        return null;
    }
}
