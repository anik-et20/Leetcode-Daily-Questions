class Solution {
    public int minOperations(int[] nums, int x) {
        int n = nums.length;
        int mini = Integer.MAX_VALUE;
        HashMap<Integer, Integer> map = new HashMap<>();

        int sum = 0;
        map.put(0, 0);

        for(int i = n - 1; i >= 0; i--) {
            sum += nums[i];
            map.put(sum, n - i);
        }
        sum = 0;
        for(int i = 0; i <= n; i++) {
            if(map.containsKey(x - sum)) {

                int rightCount = map.get(x - sum);

                if(i + rightCount <= n) {
                    mini = Math.min(mini, i + rightCount);
                }
            }

            if(i < n) {
                sum += nums[i];
            }
        }

        return mini == Integer.MAX_VALUE ? -1 : mini;
    }
}