/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public void preOrder(TreeNode root, StringBuilder sb) {
        if(root == null) {
            return;
        }

        sb.append(root.val);

        if(root.left == null && root.right == null) {
            return;
        }
        if(root.left == null && root.right != null) {
            sb.append("()(");
            preOrder(root.right, sb);
            sb.append(")");
        } else if(root.right == null && root.left != null) {
            sb.append("(");
            preOrder(root.left, sb);
            sb.append(")");
        } else {
            sb.append("(");
            preOrder(root.left, sb);
            sb.append(")");

            sb.append("(");
            preOrder(root.right, sb);
            sb.append(")");
        }
    }
    public String tree2str(TreeNode root) {
        StringBuilder sb = new StringBuilder("");
        preOrder(root, sb);
        return sb.toString();
    }
}