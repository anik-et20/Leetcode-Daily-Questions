class Solution {
    public int findMaxLength(int[] nums) {
        int n = nums.length;
        for(int i=0; i<n; i++){
            if(nums[i] == 0){
                nums[i] = -1;
            }
        }
        HashMap<Integer,Integer> hs = new HashMap<>();
        int sum = 0;
        int result = 0;
        hs.put(0, -1);
        for(int i=0; i<n; i++){
            sum += nums[i];
            if(hs.containsKey(sum)){
                int val = hs.get(sum);
                result = Math.max(result, i-val);
            }else{
                hs.put(sum, i);
            }
        }
        return result;
    }
}