class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> s = new Stack<>();
        int n = temperatures.length;
        int arr[] = new int[n];
        s.push(0);

        for(int i=1; i<n; i++){
            int curr = temperatures[i];
            while(!s.isEmpty()){
                if(temperatures[s.peek()] < curr){
                    int idx = s.peek();
                    s.pop();
                    arr[idx] = i - idx;
                }else{
                    break;
                }
            }
            s.push(i);
        }
        return arr;
    }
}