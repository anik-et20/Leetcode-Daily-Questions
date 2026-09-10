class Solution {
    public String reverseVowels(String s) {
        int n = s.length();
        StringBuilder sb = new StringBuilder("");
        for(char ch: s.toCharArray()){
            if(ch == 'a' || ch == 'e' || ch=='i' || ch=='o' || ch=='u'||
                ch == 'A' || ch == 'E' || ch=='I' || ch=='O' || ch=='U'){
                    sb.append(ch);
            }
        }
        int i=0, j=sb.length()-1;
        StringBuilder sb_new = new StringBuilder("");
        while(i<n && j>=0){
            char ch1 = s.charAt(i);
            char ch2 = sb.charAt(j);
            if(ch1 == 'a' || ch1 == 'e' || ch1=='i' || ch1=='o' || ch1=='u'||
                ch1 == 'A' || ch1 == 'E' || ch1=='I' || ch1=='O' || ch1=='U'){
                    sb_new.append(ch2);
                    j--; i++;
            }else{
                sb_new.append(ch1);
                i++;
            }
        }
        while(i<n){
            char ch1 = s.charAt(i);
            sb_new.append(ch1);
            i++;
        }
        return sb_new.toString();
    }
}