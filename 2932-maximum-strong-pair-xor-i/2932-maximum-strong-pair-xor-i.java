class Solution {
    public int maximumStrongPairXor(int[] nums) {
        int n = nums.length;
        int maxi = 0;
        for(int i=0; i<n-1; i++){
            int x = nums[i];
            for(int j=i+1; j<n; j++){
                int y = nums[j];
                if(Math.abs(x-y) <= Math.min(x,y)){
                    int xor = x^y;
                    maxi = Math.max(maxi, xor);
                }
            }
        }
        return maxi;
    }
}