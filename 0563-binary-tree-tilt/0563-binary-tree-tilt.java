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
    private int ans;
    public int findTilt(TreeNode root) {
        ans=0;
        solve(root);
        return ans;
    }
    private int solve(TreeNode root){
        if(root==null){
            return 0;
        }
        int leftsum = solve(root.left);
        int rightsum = solve(root.right);
        ans += Math.abs(leftsum - rightsum);
        return root.val+leftsum+rightsum;
    }
}