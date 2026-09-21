class Solution {
    public int[] runningSum(int[] nums) {
        int n = nums.length;
        int arr[] = new int[n];
        int sum = 0;
        for(int i=0; i<n; i++){
            arr[i] = nums[i]+sum;
            sum += nums[i];
        }
        return arr;
    }
}