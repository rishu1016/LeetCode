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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> result = new ArrayList<>();
        path(root,result,"");
        return result;
        }
        
    public void path(TreeNode root, List<String> result, String ans){
        if(root==null)
        return;
        if(root.left==null && root.right==null){
            ans=ans+root.val;
            result.add(ans);
            return;
        }

        path(root.left,result,ans+root.val+"->");
        path(root.right,result,ans+root.val+"->");
    }
}