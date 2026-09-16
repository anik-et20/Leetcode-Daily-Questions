class Solution {
    public List<List<Long>> splitPainting(int[][] segments) {
        int n = segments.length;
        List<List<Long>> arr = new ArrayList<>();
        TreeMap<Integer, Long> tm = new TreeMap<>();
        for(int i=0; i<n; i++){
            int f = segments[i][0];
            int s = segments[i][1];
            int c = segments[i][2];
            tm.put(f, tm.getOrDefault(f, 0L) + c);
            tm.put(s, tm.getOrDefault(s, 0L) - c);
        }
        long sum = 0;
        int prev = 0;
        for (Map.Entry<Integer, Long> entry : tm.entrySet()) {
            int curr = entry.getKey();
            if(sum != 0){
                arr.add(Arrays.asList((long)prev, (long)curr, sum));
            }
            sum += entry.getValue();
            prev = curr;
        }
        return arr;
    }
}