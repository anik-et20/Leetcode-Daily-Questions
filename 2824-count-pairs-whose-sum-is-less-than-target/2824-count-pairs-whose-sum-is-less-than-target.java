class Solution {
    public int countPairs(List<Integer> nums, int target) {
        int n = nums.size();
        int count = 0;
        for(int i=0; i<n-1; i++){
            Integer s = nums.get(i);
            for(int j=i+1; j<n; j++){
                Integer e = nums.get(j);
                if(s + e < target){
                    count++;
                }
            }
        }
        return count;
    }
}