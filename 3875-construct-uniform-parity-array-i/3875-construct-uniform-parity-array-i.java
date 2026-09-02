class Solution {
    public boolean uniformArray(int[] nums1) {
        return true;
        // int n = nums1.length;
        // int even = 0, odd = 0;
        // for(int i=0; i<n; i++){
        //     int prev = nums1[i] % 2;
        //     if(prev == 0) even++;
        //     else odd++;
        //     int count = 1;
        //     for(int j=1; j<n; j++){
        //         int curr = nums1[j] % 2;
        //         if(prev == curr){
        //             if(even>0) even++;
        //             else odd++;
        //         }else{
        //             int val = prev - curr;
        //             if(val == curr){
        //                 if(even>0) even++;
        //                 else odd++;
        //             }
        //         }
        //     }
        //     if(even == n || odd == n){
        //         return true;
        //     }
        // }
        // return false;
    }
}