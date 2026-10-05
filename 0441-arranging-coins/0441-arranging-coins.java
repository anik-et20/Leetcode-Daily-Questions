class Solution {
    public int arrangeCoins(int n) {
        int ans=(int)( Math.sqrt(1 + 8L* n) - 1) / 2;
        return ans;
    }
}