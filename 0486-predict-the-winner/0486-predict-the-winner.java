class Solution {
    public int solve(int i, int j, int[] nums){
        if(i>j){
            return 0;
        }
        if(i == j) return nums[i];
        int p1 = nums[i] + Math.min(solve(i+2, j, nums), solve(i+1, j-1, nums));
        int p2 = nums[j] + Math.min(solve(i, j-2, nums), solve(i+1, j-1, nums));
        return Math.max(p1,p2);
    }
    public boolean predictTheWinner(int[] nums) {
        int i = 0;
        int j = nums.length-1;
        int p1 = solve(i, j, nums);
        int total = 0;
        for(int x: nums){
            total += x;
        }
        int p2 = total - p1;
        if(p1 >= p2){
            return true;
        }
        return false;
    }
}