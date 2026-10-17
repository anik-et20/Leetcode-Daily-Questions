class Solution {
    public int maxFrequency(int[] nums, int k) {
        Arrays.sort(nums);
        int n = nums.length;
        int i=0;
        long sum = 0;
        int maxi = 0;
        for(int j=0; j<n; j++){
            sum += nums[j];

            while((long)nums[j]*(j-i+1) - sum > k){
                sum -= nums[i];
                i++;
            }
            maxi = Math.max(maxi, j-i+1);
        }
        return maxi;
    }
}