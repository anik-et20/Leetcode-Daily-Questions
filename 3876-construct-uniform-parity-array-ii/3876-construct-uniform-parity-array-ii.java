class Solution {
    public boolean uniformArray(int[] nums1) {
        int n = nums1.length;
        Arrays.sort(nums1);
        int s = nums1[0] % 2;
        int even = 0, odd = 0;
        if(s == 1) odd++;
        else even++;
        for(int i=1; i<n; i++){
            int e = nums1[i] % 2;
            if(e == s){
                if(even > 0) even++;
                else odd++;
            }else{
                int ans = nums1[i] - s;
                if(ans >= 1){
                    if(e == s){
                        if(even > 0) even++;
                    }else{
                        odd++;
                    }
                }else{
                    return false;
                }
            }
        }
        if(even == n || odd == n) return true;
        return false;
    }
}