class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> s = new Stack<>();
        // int prev = operations[0];
        for(String ch: operations){
            // char ch = st.charAt(0);
            if(ch.equals("C")){
                s.pop();
            }else if(ch.equals("D")){
                int top = s.peek();
                s.push(top*2);
            }else if(ch.equals("+")){
                int prev = s.pop();
                int curr = s.peek();
                int new_sum = prev+curr;
                s.push(prev);
                s.push(new_sum);
            }else{
                int num = Integer.parseInt(ch);
                s.push(num);
            }
            
        }
        int sum = 0;
        while(!s.isEmpty()){
            sum += s.peek();
            s.pop();
        }
        return sum;
    }
}