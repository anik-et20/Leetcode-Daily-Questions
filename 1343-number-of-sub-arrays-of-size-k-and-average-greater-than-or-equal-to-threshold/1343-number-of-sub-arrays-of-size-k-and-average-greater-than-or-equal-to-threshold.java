class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int n = arr.length;
        int s = 0, e = k;
        int sum = 0;
        int count = 0;
        for(int i=0; i<k; i++){
            sum += arr[i];
        }
        if(sum/k >= threshold) count++;
        while(e<n){
            sum -= arr[s];
            sum += arr[e];
            if(sum/k >= threshold){
                count++;
            }
            s++; e++;
        }
        return count;
    }
}