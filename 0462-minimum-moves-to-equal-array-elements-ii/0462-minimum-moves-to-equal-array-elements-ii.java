class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int half = nums[n/2];
        int sum = 0;
        for(int i: nums){
            sum += Math.abs(i-half);
        }
        // return half;
        return sum;
    }
}