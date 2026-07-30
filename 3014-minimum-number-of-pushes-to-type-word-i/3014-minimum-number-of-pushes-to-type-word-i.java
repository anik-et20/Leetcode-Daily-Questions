class Solution {
    public int minimumPushes(String word) {
        int count = 0;
        int n = word.length();
        if(n <= 8) return n;
        else if(n>8 && n<=16){
            n = n-8;
            return 8 + 2*n;
        }
        else if(n>16 && n<= 24){
            n = n-16;
            return 24 + 3*n;
        }
        n = n-24;
        return  48 + 4*n;
        
    }
}