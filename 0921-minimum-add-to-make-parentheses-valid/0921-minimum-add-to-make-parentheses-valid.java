class Solution {
    public int minAddToMakeValid(String s) {
        Deque<Character> stk = new ArrayDeque<>();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stk.push('(');
            } else {
                if (!stk.isEmpty()) {
                    stk.pop();
                } else {
                    count++;
                }
            }
        }
        while (!stk.isEmpty()) {
            stk.pop();
            count++;
        }
        return count;
    }
}