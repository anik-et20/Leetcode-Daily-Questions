class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> arr = new ArrayList<>();
        int small = Integer.MAX_VALUE;
        int lar = Integer.MIN_VALUE;
        for(int i: nums){
            small = Math.min(small, i);
            lar = Math.max(lar, i);
        }
        int newarr[] = new int[lar+1];
        for(int i: nums){
            newarr[i]++;
        }
        for(int i=small; i<lar; i++){
            if(newarr[i] == 0){
                arr.add(i);
            }
        }
        // Arrays.sort(nums);
        // for(int i=0; i<nums.length-1; i++){
        //     int curr = nums[i];
        //     int fut = nums[i+1];
        //     while(curr+1 != fut){
        //         arr.add(curr+1);
        //         curr++;
        //     }
        // }
        return arr;
    }
}