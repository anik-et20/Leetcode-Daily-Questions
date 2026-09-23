class Solution {
    public int mySqrt(int x) {
        if(x == 0 || x == 1) return x;
        long ans = 0;
        long half = x/2;
        long s = 1;
        while(s<= half){
            long mid = s + (half - s)/2;
            long val = mid*mid;
            if(val <= (long)x){
                ans = mid;
                s = mid+1;
            }else{
                half = mid -1;
            }
        }
        return (int)ans;
    }
}