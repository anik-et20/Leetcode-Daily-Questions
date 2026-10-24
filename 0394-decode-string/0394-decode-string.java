class Solution {
    public String decodeString(String s) {
        Stack<String> str = new Stack<>();
        Stack<Integer> snum = new Stack<>();

        int count = 0;
        String st = new String();
        for(char ch: s.toCharArray()){
            if(Character.isDigit(ch)){
               count = count*10 + (ch-'0');
            }else if(ch =='['){
               str.push(st);
               snum.push(count);
                count = 0;
                st = "";
            }else if(ch == ']'){
                int no = snum.pop();
                String new_str = str.pop();

                StringBuilder sb = new StringBuilder("");
                sb.append(new_str);
                for(int i=0; i<no; i++){
                    sb.append(st);
                }
                st = sb.toString();
            }else{
                st = st + Character.toString(ch);
            }
        }

        return st;
    }
}