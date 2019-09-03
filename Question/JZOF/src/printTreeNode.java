package JZOffer;

import java.util.ArrayList;

public class printTreeNode {

    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        ArrayList<TreeNode>nodeList = new ArrayList<>();
        ArrayList<Integer>arrayList = new ArrayList<>();
        if(root != null) nodeList.add(root);
        while (!nodeList.isEmpty()) {
            TreeNode node = (TreeNode) nodeList.get(0);
            nodeList.remove(0);
            arrayList.add(node.val);
            if(node.left!=null)nodeList.add(node.left);
            if(node.right!=null)nodeList.add(node.right);
        }
        return arrayList;
    }

    public static void main(String[] args) {
        TreeNode a1 = new TreeNode(10);
        TreeNode a2 = new TreeNode(6);
        TreeNode a3 = new TreeNode(14);
        TreeNode a4 = new TreeNode(4);
        TreeNode a5 = new TreeNode(8);
        TreeNode a6 = new TreeNode(11);
        TreeNode a7 = new TreeNode(16);
        a1.left = a2;
        a1.right = a3;
        a2.left = a4;
        a2.right = a5;
        a3.left = a6;
        a3.right = a7;
        printTreeNode p = new printTreeNode();
        ArrayList<Integer> arrayList = p.PrintFromTopToBottom(a1);
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.printf("%d ",arrayList.get(i));
        }
    }
}
