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
    public boolean check(TreeNode p1, TreeNode p2){
        if(p1 == null && p2 == null){
            return true;
        }
        if((p1 == null && p2 != null) || (p1 != null && p2 == null) || (p1.val != p2.val)){
            return false;
        } 
        // if(p1.val != p2.val){
        //     return false;
        // }
        boolean a1 = check(p1.left, p2.right);
        boolean a2 = check(p1.right, p2.left);
        if(a1 == false || a2 == false){
            return false;
        }
        return true;
    }
    public boolean isSymmetric(TreeNode root) {
        return check(root, root);
    }
}