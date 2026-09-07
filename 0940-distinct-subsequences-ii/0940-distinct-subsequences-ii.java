class Solution {
    public int distinctSubseqII(String s) {
        int MOD = 1_000_000_007;
        int total = 0;
        int eng[] = new int[26];
        for(char ch: s.toCharArray()){
            int idx = ch - 'a';
            int old = total;
            int sub = (old + 1 - eng[idx] + MOD) % MOD;
            total = (total + sub) % MOD;
            eng[idx] = (eng[idx] + sub) % MOD;
        }
        return total;
    }
}