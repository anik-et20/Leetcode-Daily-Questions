class NumArray {
    int arr[];
    public NumArray(int[] nums) {
        int n = nums.length;
        arr = new int[n];
        arr[0] = nums[0];
        for(int i=1; i<n; i++){
            arr[i] = arr[i-1] + nums[i];
        }
    }
    
    public int sumRange(int left, int right) {
        if(left == 0) return arr[right];
        int lsum = arr[left-1];
        int rsum = arr[right];
        return rsum - lsum;
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */