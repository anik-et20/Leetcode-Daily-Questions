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
    public void dfs(TreeNode root, Stack<TreeNode> s){
        if(root == null){
            return;
        }
        s.add(root);
        dfs(root.left, s);
        dfs(root.right, s);
    }
    public void flatten(TreeNode root) {
        Stack<TreeNode> s = new Stack<>();
        dfs(root, s);
        
        TreeNode prev = null;
        while(!s.isEmpty()){
            TreeNode curr = s.pop();
            curr.left = null;
            curr.right = prev;
            prev = curr;
        }
    }
}