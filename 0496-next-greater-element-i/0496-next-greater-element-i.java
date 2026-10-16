class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int arr[] = new int[n];

        Map<Integer, Integer> map = new HashMap<>();
        Stack<Integer> s = new Stack<>();
        s.push(0);

        for(int i=1; i<nums2.length; i++){
            int curr = nums2[i];

            while(!s.isEmpty()){
                int top_idx = s.peek();
                int top_ele = nums2[top_idx];
                if(top_ele < curr){
                    map.put(top_ele, curr);
                    s.pop();
                }else{
                    break;
                }
            }
            s.push(i);
        }
        for(int i=0; i<n; i++){
            arr[i] = map.getOrDefault(nums1[i], -1);
        }
        return arr;
    }
}