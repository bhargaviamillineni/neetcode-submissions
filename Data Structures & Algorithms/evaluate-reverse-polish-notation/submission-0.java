class Solution {
    public int evalRPN(String[] tokens) {
        int n = tokens.length;
        Stack<Integer> st = new Stack<>();
        for(int i=0; i<n; i++){
            String s = tokens[i];
            if(s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/")){
                int b = st.pop();
                int a = st.pop();
                 if (s.equals("+")) {
                    st.push(a + b);
                } else if (s.equals("-")) {
                    st.push(a - b);
                } else if (s.equals("*")) {
                    st.push(a * b);
                } else {
                    st.push(a / b);
                }
            }else st.push(Integer.parseInt(s));
        }
        return st.peek();
    }
}
