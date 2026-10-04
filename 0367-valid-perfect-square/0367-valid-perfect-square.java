class Solution {
    public boolean isPerfectSquare(int num) {
        if(num == 1) return true;
        int s = 1;
        int e = num/2;
        while(s<=e){
            int mid = s +(e-s)/2;
            long ans = (long)mid*mid;
            if(ans == num){
                return true;
            }else if(ans < num){
                s = mid+1;
            }else{
                e = mid-1;
            }
        }
        return false;
    }
}