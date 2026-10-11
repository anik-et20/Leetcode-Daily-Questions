class Solution {
    public int sumOfSquares(int[] nums) {
        int n = nums.length;
        int ans = 0;
        for(int i=0; i<n/2; i++){
            if(n % (i+1) == 0){
                int mult = nums[i]*nums[i];
                ans += mult;
            }
        }
        ans += nums[n-1]*nums[n-1];
        return ans;
    }
}