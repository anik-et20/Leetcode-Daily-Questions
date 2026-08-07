class Solution {
    public int firstMissingPositive(int[] nums) {
        TreeSet<Integer> tree = new TreeSet<>();
        for(int i: nums){
            if(i>0){
                tree.add(i);
            }
        }
        int n = tree.size();
        if(n == 0) return 1;
        int ans = 1;
        for(int i: tree){
            if(ans == i){
                ans++;
            }else if(i > ans){
                break;
            }
        }
        return ans;
    }
}