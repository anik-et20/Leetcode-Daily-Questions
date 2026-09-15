class Solution {
    public boolean check(int piles[], int val, int h){
        int hr = 0;
        for(int i: piles){
            hr += (i+val-1)/val;
            if(hr > h) return false;
        }
        return true;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int s = 1;
        int e = 0;
        for(int i: piles){
            e = Math.max(e,i);
        }
        int ans = 0;
        while(s<=e){
            int mid = s + (e-s)/2;
            if(check(piles, mid, h)){
                ans = mid;
                e = mid - 1;
            }else{
                s = mid + 1;
            }
        }
        return ans;
    }
}