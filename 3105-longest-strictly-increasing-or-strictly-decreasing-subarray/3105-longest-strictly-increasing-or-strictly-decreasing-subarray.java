class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int n = nums.length;
        if(n == 1) return 1;
        int maxi = 1;
        int j = 0;
        for(int i=1; i<n; i++){
            if(nums[i]>nums[i-1]){
                maxi = Math.max(maxi, i-j+1);
            }else{
                j = i;
            }
        }
        j = 0;
        for(int i=1; i<n; i++){
            if(nums[i]<nums[i-1]){
                maxi = Math.max(maxi, i-j+1);
            }else{
                j = i;
            }
        }
        return maxi;
    }
}