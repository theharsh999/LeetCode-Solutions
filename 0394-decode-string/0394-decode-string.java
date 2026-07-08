class Solution {
    public String decodeString(String s) {
        Stack<String> stk1 = new Stack<>();
        Stack<Integer> stk2 = new Stack<>();
        int num = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch >= '0' && ch <= '9') {
                num = num * 10 + (ch - '0');
            } else if (ch == '[') {
                stk2.push(num);
                num = 0;
                stk1.push("[");
            } else if (ch == ']') {
                StringBuilder str = new StringBuilder();
                while (!stk1.isEmpty() && !stk1.peek().equals("[")) {
                    String curr = stk1.pop();
                    str.insert(0, curr);
                }
                stk1.pop(); //for remove [ 
                StringBuilder sb = new StringBuilder(str);
                for (int j = stk2.pop() - 1; j > 0; j--) {
                    sb.append(str);
                }
                stk1.push(sb.toString());
            } else {
                stk1.push(String.valueOf(ch));
            }
        }
        StringBuilder ans = new StringBuilder();
        for (String str : stk1) {
            ans.append(str);
        }
        return ans.toString();
    }
}