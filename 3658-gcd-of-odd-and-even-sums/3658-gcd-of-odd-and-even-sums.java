class Solution {
    public int gcdOfOddEvenSums(int n) {
        if(n == 1) return 1;
        int oddsum = 1;
        int evensum = 2;
        int odd = 1;
        int even = 2;
        for(int i=1; i<n; i++){
            odd = odd + 2;
            even = even + 2;
            oddsum += odd;
            evensum += even;
        }
        while(oddsum != 0){
            int temp = oddsum;
            oddsum = evensum % oddsum;
            evensum = temp;
        }
        return evensum;
    }
}