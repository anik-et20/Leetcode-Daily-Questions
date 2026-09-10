class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i: arr){
            map.put(i, map.getOrDefault(i, 1)+1);
        }
        HashSet<Integer> hs = new HashSet<>();
        for(int val: map.values()){
            if(hs.contains(val)){
                return false;
            }
            hs.add(val);
        }
        return true;
    }
}