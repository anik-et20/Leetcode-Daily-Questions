class Solution {
    public boolean checkString(String s) {
        int n = s.length();
        if(n == 1) return true;
        for(int i=0; i<n-1; i++){
            char ch = s.charAt(i);
            char ch1 = s.charAt(i+1);
            if(ch == 'b'){
                if(ch1 == 'a') return false;
            }
        }
        return true;
    }
}