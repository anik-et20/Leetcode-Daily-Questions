class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int i=0, j=n-1, idx = n-1;
        int arr[] = new int[n];
        while(idx>=0){
            int left = nums[i]*nums[i];
            int right = nums[j]*nums[j];
            if(left > right){
                arr[idx] = left;
                i++;
            }else{
                arr[idx] = right;
                j--;
            }
            idx--;
        }
        return arr;
    }
}