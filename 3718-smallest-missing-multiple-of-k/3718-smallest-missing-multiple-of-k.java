class Solution {
    public int missingMultiple(int[] nums, int k) {
        Arrays.sort(nums);
        int mini = k;
        int ans = Integer.MAX_VALUE;
        for(int i: nums){
            if(i < mini){
                continue;
            }else if(i == mini){
                mini = mini+k;
            }else{
                ans = Math.min(mini, ans);
            }
        }
        if(ans == Integer.MAX_VALUE){
            ans = mini;
        }
        return ans;
    }
}