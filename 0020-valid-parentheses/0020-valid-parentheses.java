class Solution {
    public boolean isValid(String s) {
        int n = s.length();
        if(n <= 1) return false;

        Stack<Character> st = new Stack<>();
        for(char curr: s.toCharArray()){
            if(curr == '(' || curr == '[' || curr == '{'){
                st.push(curr);
            }else{
                if(st.isEmpty()) return false;

                char c = st.pop();
                if((c == '(' && curr == ')') || (c == '[' && curr == ']') || (c == '{' && curr == '}')){
                    continue;
                }else{
                    return false;
                }
            }
        }
        return st.isEmpty();
    }
}