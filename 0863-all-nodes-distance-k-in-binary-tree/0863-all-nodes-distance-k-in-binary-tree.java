/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    class Pair{
        TreeNode node;
        int idx;
        Pair(TreeNode node, int idx){
            this.node = node;
            this.idx = idx;
        }
    }
    public void find(TreeNode root, Map<TreeNode, TreeNode> parent){
        if(root == null){
            return;
        }
        if(root.left != null){
            parent.put(root.left, root);
            find(root.left, parent);
        } 
        if(root.right != null){
            parent.put(root.right, root);
            find(root.right, parent);
        } 
    }
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        List<Integer> arr = new ArrayList<>();
        Map<TreeNode, TreeNode> parent = new HashMap<>();
        find(root, parent);

        Queue<Pair> q = new LinkedList<>();
        Set<TreeNode> visited = new HashSet<>();

        q.add(new Pair(target, 0));
        visited.add(target);

        while(!q.isEmpty()){
            Pair new_node = q.remove();
            TreeNode curr = new_node.node;
            int curr_idx = new_node.idx;
            if(curr_idx == k){
                arr.add(curr.val);
                continue;
            }
            if(curr.left!= null && !visited.contains(curr.left)) {
                visited.add(curr.left);
                q.add(new Pair(curr.left, curr_idx+1));
            }
            if(curr.right!= null && !visited.contains(curr.right)) {
                visited.add(curr.right);
                q.add(new Pair(curr.right, curr_idx+1));
            }
            TreeNode par = parent.get(curr);

            if (par != null && !visited.contains(par)) {
                visited.add(par);
                q.add(new Pair(par, curr_idx + 1));
            }
        }
        return arr;
    }
}