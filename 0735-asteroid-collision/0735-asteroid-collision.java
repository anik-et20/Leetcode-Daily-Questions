class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> s = new Stack<>();
        for(int i: asteroids){
            boolean alive = true;
            while(alive && i<0 && !s.isEmpty() && s.peek()>0){
                if(s.peek() < Math.abs(i)){
                    s.pop();
                } else if (s.peek() == Math.abs(i)) {
                    s.pop();
                    alive = false;
                } else {
                    alive = false;
                }
            }
            if(alive){
                s.push(i);
            }
        }
        int arr[] = new int[s.size()];
        for(int i=s.size()-1; i>=0; i--){
            arr[i] = s.pop();
        }
        return arr;
    }
}