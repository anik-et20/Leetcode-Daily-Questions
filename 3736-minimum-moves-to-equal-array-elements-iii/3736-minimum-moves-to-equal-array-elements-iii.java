class Solution {
    public int minMoves(int[] nums) {
        int maxi = Integer.MIN_VALUE;
        for(int i: nums){
            maxi = Math.max(i, maxi);
        }
        int sum = 0;
        for(int i: nums){
            int diff = Math.abs(i - maxi);
            sum += diff;
        }
        return sum;
    }
}