class Solution {
    // public boolean matches(int a[] ,int b[] ){
    //     for(int i=0;i<26;i++){
    //         if(a[i]!=b[i]) return false;
    //     }
    //     return true;
    // }
    public boolean checkInclusion(String s1, String s2) {
        int n1 = s1.length();
        int n2 = s2.length();
        if(n1>n2) return false;
        int freq[] = new int[26];
        int freq2[] = new int[26];

        for(char ch: s1.toCharArray()){
            freq[ch - 'a']++;
        }
        for(int i=0; i<n2; i++){
            freq2[s2.charAt(i)-'a']++;
            if(i>=n1){
                freq2[s2.charAt(i - n1)-'a']--;
            }
            if(Arrays.equals(freq,freq2)) return true;
        }
        return false;
    }
}