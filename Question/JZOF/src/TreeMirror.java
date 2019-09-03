package JZOffer;

public class TreeMirror {
    public void Traverse(TreeNode root){
    }
    public void Mirror(TreeNode root) {
        if(root != null) {
            TreeNode space = root.right;
            root.right = root.left;
            root.left = space;
            Mirror(root.left);
            Mirror(root.right);
        }
    }

    public static void main(String[] args) {
        TreeMirror t = new TreeMirror();
        TreeNode a = new TreeNode(8);
        TreeNode b = new TreeNode(6);
        TreeNode c = new TreeNode(10);
        TreeNode d = new TreeNode(5);
        TreeNode e = new TreeNode(7);
        TreeNode f = new TreeNode(9);
        TreeNode g = new TreeNode(11);
        a.left = b;a.right = c;
        b.left = d;b.right = e;
        c.left = f;c.right = g;
        t.Mirror(a);
    }
}
