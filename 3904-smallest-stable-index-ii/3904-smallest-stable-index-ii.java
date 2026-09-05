class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n = nums.length;
        int maxi[] = new int[n];
        int new_max = nums[0];
        for(int i=0; i<n; i++){
            new_max = Math.max(new_max, nums[i]);
            maxi[i] = new_max;
        }
        int mini = nums[n-1];
        int ans = n;
        for(int i=n-1; i>=0; i--){
            mini = Math.min(mini, nums[i]);
            int val = maxi[i] - mini;
            if(val <= k){
                ans = i;
            }
        }
        if(ans == n) return -1;
        return ans;
    }
}