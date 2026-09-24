class Solution {
    public List<Integer> findPeaks(int[] mountain) {
        List<Integer> arr = new ArrayList<>();
        int n = mountain.length;
        for(int i=1; i<n-1; i++){
            int prev = mountain[i-1];
            int curr = mountain[i];
            int fut = mountain[i+1];
            if(curr > prev && curr > fut){
                arr.add(i);
            }
        }
        return arr;
    }
}