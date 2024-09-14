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
    public StringBuilder resString = new StringBuilder("");
    public String tree2str(TreeNode root) {
        if(root == null) return resString.toString();
        resString.append(root.val);

        if((root.left == null && root.right == null)) return resString.toString();  
        traverseTree(root.left, 'l');
        traverseTree(root.right, 'r');
        
        return resString.toString();
    }

    public void traverseTree(TreeNode root, char dir) {
        if(root == null ){
           
            if(dir == 'l'){
                resString.append("(" + ")");
            }
            return;
        }


         resString.append("(" + root.val);
        if(!(root.left == null && root.right == null)){
            traverseTree(root.left, 'l');
            traverseTree(root.right, 'r');
           
        }
         resString.append(")");

    }
}