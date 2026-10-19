class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        int less = 0, equal = 0;
        List<Integer> arr = new ArrayList<>();
        for(int i: nums){
            if(i<target) less++;
            else if(i==target) equal++;
        }
        for(int i=0; i<nums.length; i++){
            if(less>0) less--;
            else if(equal>0){
                arr.add(i);
                equal--;
            }else{
                break;
            }
        }
        return arr;
    }
}