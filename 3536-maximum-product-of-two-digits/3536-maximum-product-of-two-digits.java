class Solution {
    public int maxProduct(int n) {
        int maxi = n%10;
        n = n/10;
        int sec_maxi = Integer.MIN_VALUE;
        while(n>0){
            int digit = n%10;
            if(digit >= maxi){
                sec_maxi = maxi;
                maxi = digit;
            }else if(sec_maxi <= maxi && sec_maxi <= digit){
                sec_maxi = digit;
            }
            n = n/10;
        }
        return maxi*sec_maxi;
    }
}