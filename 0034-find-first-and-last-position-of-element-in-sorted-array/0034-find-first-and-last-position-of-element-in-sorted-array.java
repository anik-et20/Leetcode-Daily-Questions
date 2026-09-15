class Solution {
    public int[] searchRange(int[] nums, int target) {
        int n = nums.length;
        if(n == 0) return new int[]{-1,-1};
        int s = 0, e = n-1;
        int first = -1, second = -1;
        while(s<=e){
            int mid = s+ (e-s)/2;
            if(nums[mid] == target){
                first = mid;
                e = mid - 1;
            }
            else if(nums[mid] < target){
                s = mid + 1;
            }else{
                e = mid - 1;
            }
        }
        s = 0;
        e = n-1;
        while(s<=e){
            int mid = s+ (e-s)/2;
            if(nums[mid] == target){
                second = mid;
                s = mid+1;
            }else if(nums[mid] < target){
                s = mid +1;
            }
            else{
                e = mid - 1;
            }
        }
        return new int[]{first, second};
    }
}