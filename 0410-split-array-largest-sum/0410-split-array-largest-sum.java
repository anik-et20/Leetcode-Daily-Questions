class Solution {
    public boolean split(int[] nums, int k, int threshold){
        int sum = 0;
        int val = 1;
        for(int i: nums){
            if(sum + i <= threshold){
                sum += i;
            }else{
                val++;
                sum = i;
            }
            if(val > k) return false;
        }
        return true;
    }
    public int splitArray(int[] nums, int k) {
        int s = 0;
        int sum = 0;
        for(int i: nums){
            sum += i;
            s = Math.max(s,i);
        }
        int e = sum;
        int ans = 0;
        while(s<=e){
            int mid = s +(e-s)/2;
            if(split(nums, k, mid)){
                ans = mid;
                e = mid-1;
            }else{
                s = mid+1;
            }
        }
        return ans;
    }
}