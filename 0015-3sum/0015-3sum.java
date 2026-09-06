class Solution {
    public void helper(int i, int nums[], List<List<Integer>> arr){
        int s = i + 1;
        int e = nums.length-1;
        while(s<e){
            int sum = nums[i] + nums[s] + nums[e];
            if(sum > 0){
                e--;
            }else if(sum < 0){
                s++;
            }else{
                arr.add(Arrays.asList(nums[i], nums[s], nums[e]));
                s++; e--;
                while(s<e && nums[s] == nums[s-1]){
                    s++;
                }
                while(s<e && nums[e] == nums[e+1]){
                    e--;
                }
            }
        }
    }
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> arr = new ArrayList<>();
        for(int f=0; f<nums.length-2; f++){
            if(nums[f] > 0){
                break;
            }
            if(f == 0 || nums[f]!=nums[f-1]){
                helper(f, nums, arr);
            }
        }
        return arr;
    }
}