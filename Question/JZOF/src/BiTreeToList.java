package JZOffer;

public class BiTreeToList {
    /**
     * 利用二叉搜索树左子树小于根节点小于右子树的性质
     * 将左子树的最右边的结点和根节点的左指针连接，将右子树的最左边的结点和根节点的右指针连接
     * 递归拆分左子树和右子树，左子树返回最右边的结点，右子树返回最左边的结点
     */
    public TreeNode Converse(TreeNode pRootOfTree){
        if(pRootOfTree == null)return null;
        //
        if(pRootOfTree.left != null){
            TreeNode leftNode =  Convert(pRootOfTree.left);
            while(leftNode.right != null){
                leftNode = leftNode.right;
            }
            pRootOfTree.left = leftNode;
            leftNode.right = pRootOfTree;
        }
        if(pRootOfTree.right != null){
            TreeNode rightNode = Convert(pRootOfTree.right);
            while(rightNode.left != null){
                rightNode = rightNode.left;
            }
            pRootOfTree.right = rightNode;
            rightNode.left = pRootOfTree;
        }
        return pRootOfTree;
    }
    /**
     * 构造一个函数返回链表头结点
     */
    public TreeNode Convert(TreeNode pRootOfTree) {
        if(pRootOfTree == null)return null;
        TreeNode newHead = Converse(pRootOfTree);
        while(newHead.left!=null){
            newHead = newHead.left;
        }
        return newHead;
    }
}
