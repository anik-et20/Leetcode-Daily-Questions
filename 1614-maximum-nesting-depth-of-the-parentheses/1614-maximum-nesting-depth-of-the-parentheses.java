class Solution {
    public int maxDepth(String s) {
        int n = s.length();
        int val = 0;
        int ans = 0;
        for(char ch: s.toCharArray()){
            if(ch == '('){
                val++;
                ans = Math.max(ans, val);
            }else if(ch == ')'){
                val--;
            }
        }
        return ans;
    }
}