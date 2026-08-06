class Solution {
    public int product(int n, int t, int num){
        int pro = 1;
        int ans = num;
        while(num > 0){
            int dig = num % 10;
            pro *= dig;
            num = num/10;
        }
        if(pro % t == 0){
            return ans;
        }
        return -1;
    }
    public int smallestNumber(int n, int t) {
        int least = n;
        while(least >= n){
            int ans = product(n, t, least);
            if(ans != -1){
                return ans;
            }
            least++;
        }
        return -1;
    }
}