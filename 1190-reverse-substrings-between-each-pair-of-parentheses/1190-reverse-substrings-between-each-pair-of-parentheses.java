class Solution {
    public String reverseParentheses(String s) {
        Deque<Integer> st = new ArrayDeque<>();
        StringBuilder res = new StringBuilder();

        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch == '('){
                st.push(res.length());
            }else if(ch == ')'){
                int l = st.pop();
                reverseRange(res, l, res.length()-1);
            }else{
                res.append(ch);
            }
        }
        return res.toString();
    }

    static void reverseRange(StringBuilder sb, int l, int r) {
        while (l < r) {
            char temp = sb.charAt(l);
            sb.setCharAt(l, sb.charAt(r));
            sb.setCharAt(r, temp);

            l++;
            r--;
        }
    }
}