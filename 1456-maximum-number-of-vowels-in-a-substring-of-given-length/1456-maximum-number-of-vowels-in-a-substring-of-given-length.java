class Solution {
    public int maxVowels(String s, int k) {
        int count = 0;
        for(int i=0; i<k; i++){
            Character ch = s.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                count++;
            }
        }
        if(count == k){
            return k;
        }
        int i = 1;
        int e = k;
        int n = s.length();
        int min_count = count;
        while(i<n-k || e<n){
            Character ch1 = s.charAt(i-1);
            Character ch2 = s.charAt(e);
            if(ch2 == 'a' || ch2 == 'e' || ch2 == 'i' || ch2 == 'o' || ch2 == 'u'){
                min_count++;
            }
            if(ch1 == 'a' || ch1 == 'e' || ch1 == 'i' || ch1 == 'o' || ch1 == 'u'){
                min_count--;
            }
            count = Math.max(count, min_count);
            i++; e++;
        }
        return count;
    }

}