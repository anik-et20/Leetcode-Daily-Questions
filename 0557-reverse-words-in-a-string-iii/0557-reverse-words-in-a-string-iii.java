class Solution {
    public void reverse(String s, StringBuilder sb, int i, int j){
        while(i<=j){
            char ch1 = s.charAt(j);
            sb.append(ch1);
            j--;
        }
    }
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder("");
        s = s.trim();
        int i=0, j=0;
        while(j<s.length()){
            while(j<s.length() && s.charAt(j) != ' '){
                j++;
            }
            reverse(s, sb, i, j-1);
            i = j + 1;
            j++;
            if(i<s.length()){
                sb.append(' ');
            }
        }
        // reverse(s, sb, i, j-1);
        return sb.toString();
    }
}