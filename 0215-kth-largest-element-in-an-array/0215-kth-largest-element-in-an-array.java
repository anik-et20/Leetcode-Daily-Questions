class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i: nums){
            pq.add(i);
        }
        int s = 1;
        while(!pq.isEmpty()){
            if(s == k){
                return pq.poll();
            }
            pq.poll();
            s++;
        }
        return -1;
    }
}