class Solution {
    public int characterReplacement(String s, int k) {
        int n = s.length();
        HashMap<Character,Integer> map = new HashMap<>();
        map.put(s.charAt(0), 1);
        int max_len = 1;
        int max_freq = 1;
        int i=0;
        for(int j=1; j<n; j++){
            char ch = s.charAt(j);
            map.put(ch, map.getOrDefault(ch,0)+1);
            max_freq = Math.max(max_freq, map.get(ch));

            int len = (j-i+1) - max_freq;
            while((j-i+1) - max_freq > k){
                char ch1 = s.charAt(i);
                map.put(ch1, map.get(ch1)-1);
                i++;
            }
            max_len = Math.max(len, j-i+1);
        }
        return max_len;
    }
}