class Solution {
    public int minimumDeletions(int[] nums) {
        int n = nums.length;
        if(n==1) return 1;
        int mini_idx = -1;
        int max_idx = -1;
        int mini = Integer.MAX_VALUE;
        int maxi = Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            if(nums[i] < mini){
                mini = nums[i];
                mini_idx = i;
            }
            if(nums[i] > maxi){
                maxi = nums[i];
                max_idx = i;
            }
        }
        if(max_idx > mini_idx){
            int c1 = max_idx + 1;
            int c2 = n - mini_idx;
            int c3 = (n - max_idx) + (mini_idx + 1);
            return Math.min(c1, Math.min(c2, c3));
        }else{
            int c1 = mini_idx + 1;
            int c2 = n - max_idx;
            int c3 = (n - mini_idx ) + (max_idx + 1);
            return Math.min(c1, Math.min(c2, c3));
        }
    }
}