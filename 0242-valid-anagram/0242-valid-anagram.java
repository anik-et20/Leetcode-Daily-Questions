class Solution {
    public boolean isAnagram(String s, String t) {
        if(t.length() != s.length()){
            return false;
        }
        HashMap<Character, Integer> ht = new HashMap<>();
        for(char ch: s.toCharArray()){
            ht.put(ch, ht.getOrDefault(ch,0)+1);
        }
        for(int i=0; i<t.length(); i++){
            char ch = t.charAt(i);
            if(!ht.containsKey(ch)){
                return false;
            }
            if(ht.get(ch) > 1){
                
                ht.put(ch, ht.get(ch)-1);
            }else{
                ht.remove(ch);
            }
        }
        return true;
    }
}