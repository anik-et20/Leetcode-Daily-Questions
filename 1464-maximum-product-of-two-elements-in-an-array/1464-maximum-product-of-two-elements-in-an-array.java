class Solution {
    public int maxProduct(int[] nums) {
        int maxi = nums[0];
        int sec_maxi = Integer.MIN_VALUE;
        for(int i=1; i<nums.length; i++){
            if(nums[i] > maxi){
                sec_maxi = maxi;
                maxi = nums[i];
            }else if(sec_maxi <= maxi && nums[i]>sec_maxi){
                sec_maxi = nums[i];
            }
        }
        return (maxi-1)*(sec_maxi-1);
    }
}