class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n = nums.length;
        int mini[] = new int[n];
        int maxi[] = new int[n];
        int maximum = nums[0], minimum = nums[n-1];
        for(int i=0; i<n; i++){
            maximum = Math.max(maximum, nums[i]);
            maxi[i] = maximum;
        }
        for(int i=n-1; i>=0; i--){
            minimum = Math.min(minimum, nums[i]);
            mini[i] = minimum;
        }
        for(int i=0; i<n; i++){
            int val = maxi[i] - mini[i];
            if(val <= k){
                return i;
            }
        }
        return -1;
    }
}