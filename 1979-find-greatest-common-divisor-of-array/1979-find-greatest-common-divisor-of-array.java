class Solution {
    public int findGCD(int[] nums) {
        int mini = Integer.MAX_VALUE;
        int maxi = Integer.MIN_VALUE;
        for(int i=0; i<nums.length; i++){
            mini = Math.min(nums[i], mini);
            maxi = Math.max(nums[i], maxi);
        }
        while(mini != 0){
            int temp = mini;
            mini = maxi % mini;
            maxi = temp;
        }
        return maxi;
    }
}