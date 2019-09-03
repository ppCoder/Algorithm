package JZOffer;

class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }
}
public class TreeChildNode {
    public boolean compareSubtree(TreeNode root1,TreeNode root2){
        if(root2 == null)return true;
        if(root1 == null)return false;
        if(root1.val == root2.val){
            if(compareSubtree(root1.left,root2.left)&& compareSubtree(root1.right,root2.right))
                return true;
        }
        return false;
    }
    public boolean HasSubtree(TreeNode root1,TreeNode root2) {
        if(root1 == null||root2 == null)return false;
        if(compareSubtree(root1,root2))return true;
        if(HasSubtree(root1.left, root2) || HasSubtree(root1.right, root2))return true;
        return  false;
    }

    public static void main(String[] args) {
        TreeNode a = new TreeNode(8);
        TreeNode b = new TreeNode(8);
        TreeNode c = new TreeNode(7);
        TreeNode d = new TreeNode(9);
        TreeNode e = new TreeNode(2);
        TreeNode f = new TreeNode(4);
        TreeNode g = new TreeNode(7);
        TreeNode q = new TreeNode(8);
        TreeNode w = new TreeNode(9);
        TreeNode r = new TreeNode(2);
        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;
        e.left = f;
        e.right = g;
        q.left = w;
        q.right = r;
        TreeChildNode t = new TreeChildNode();
        System.out.println(t.HasSubtree(a,q));
    }
}
