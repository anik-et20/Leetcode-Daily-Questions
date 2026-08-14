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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> arr = new ArrayList<>();
        if(root == null){
            return arr;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        boolean flag = true;
        
        while(!q.isEmpty()){
            int sz = q.size();
            List<Integer> lst = new ArrayList<>(sz);
            for(int i=0; i<sz; i++){
                TreeNode curr = q.remove();
                if(curr == null) continue;
                if(flag){
                    lst.add(curr.val);
                }else{
                    lst.add(0,curr.val);
                }
        
                if(curr.left != null){
                    q.add(curr.left);
                }
                if(curr.right != null){
                    q.add(curr.right);
                }
            }
            flag = !flag;
            arr.add(lst);
        }
        return arr;
    }
}