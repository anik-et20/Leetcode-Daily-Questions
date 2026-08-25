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
class Pair{
    TreeNode node;
    int idx;
    Pair(TreeNode node, int idx){
        this.node = node;
        this.idx = idx;
    }
}
class Solution {
    public int widthOfBinaryTree(TreeNode root) {
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(root, 0));
        int result = 0;
        while(!q.isEmpty()){
            int sz = q.size();
            int first = q.peek().idx;
            int last = first;
            for(int i=0; i<sz; i++){
                Pair curr = q.remove();
                last = curr.idx;
                if(curr.node.left != null){
                    q.add(new Pair(curr.node.left, 2*curr.idx));
                }
                if(curr.node.right != null){
                    q.add(new Pair(curr.node.right, 2*curr.idx+1));
                }
            }
            result = Math.max(result, last-first+1);
        }
        return result;
    }
}