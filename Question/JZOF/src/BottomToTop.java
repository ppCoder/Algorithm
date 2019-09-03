package JZOffer;

public class BottomToTop {
    /*public TreeNode insertNode(int sequence,TreeNode targetNode){
        if(targetNode.right == null &&sequence > targetNode.val){
           targetNode.right = new TreeNode(sequence);
           targetNode = targetNode.right;
        }
        else if(targetNode.left == null && sequence < targetNode.val){
            targetNode.left = new TreeNode(sequence);
            targetNode = targetNode.left;
        }
        else return null;
        return targetNode;
    }*/
    /*
    算法二：
    二分查找算法
    算法原理：1.最后一个结点是根节点
              2.前面的序列分为左子树序列和右子树序列
              3.左子树序列比结点小，右子树序列比结点大
              4.循环上述过程，继续分块
     */

    /*
    算法三：
    基于二分排序的改编
    最后一个结点作为子树根节点，前面总会分成两部分：小于根节点 和 大于根节点
     */
    public boolean VerifySquence(int[] sequence,int low,int high){//high应当表示位置而不是长度
        if(low == high)return true;
        int mid = low;
        while (mid < high) {
            if(sequence[mid] > sequence[high])break;
            else mid++;
        }
        while(mid < high){
            if(sequence[mid] > sequence[high])mid++;
            else return false;
        }
        return VerifySquence(sequence,low,mid-1);
    }
    public boolean VerifySquenceOfBST(int [] sequence) {
        if (sequence.length == 0) return false;
        return VerifySquence(sequence, 0, sequence.length-1);
    }
        /*int position = sequence.length-1;
        TreeNode root = new TreeNode(sequence[position--]);
        while(position > 0){
            TreeNode target = root;
            TreeNode preNode = root;
            while(target != null) {
                target = insertNode(sequence[position], target);
                if (target == null) target = preNode;
            }
        }*/

    public static void main(String[] args) {
        int[] array = {4,8,6,12,16,14,10};
        BottomToTop b = new BottomToTop();
        System.out.println(b.VerifySquenceOfBST(array));
    }
}
