class SmallestInfiniteSet {
    TreeSet<Integer> hs = new TreeSet<>();
    public SmallestInfiniteSet() {
        for (int i = 1; i <= 1000; i++) {
            hs.add(i);
        }
    }
    
    public int popSmallest() {
        return hs.removeFirst();
    }
    
    public void addBack(int num) {
        if(!hs.contains(num)){
            hs.add(num);
        }
    }
}

/**
 * Your SmallestInfiniteSet object will be instantiated and called as such:
 * SmallestInfiniteSet obj = new SmallestInfiniteSet();
 * int param_1 = obj.popSmallest();
 * obj.addBack(num);
 */