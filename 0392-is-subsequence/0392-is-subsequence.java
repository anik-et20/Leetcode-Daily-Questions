class Solution {
    public boolean isSubsequence(String s, String t) {
        if(t.length() < s.length()) return false;
        if(s.length() == 0) return true;
        int i = 0;
        for(char ch: t.toCharArray()){
            char chs = s.charAt(i);
            if(ch == chs) i++;
            if(i == s.length()) return true;
        }
        return false;
        
    }
}