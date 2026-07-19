class Solution {
    public String removeDuplicateLetters(String s) {
        Deque<Character> stk = new ArrayDeque<>();
        boolean visited[] = new boolean[26];
        int lastOccurence[] = new int[26];

        for (int i=0; i<s.length(); i++) {
            char ch = s.charAt(i);
            lastOccurence[ch-'a'] = i;
        }

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(visited[ch-'a'] == false){
                while (!stk.isEmpty() && stk.peek() > ch && lastOccurence[stk.peek() - 'a'] > i){
                    visited[stk.pop() - 'a'] = false;
                }
                stk.push(ch);
                visited[ch-'a'] = true;
            }
        }

        StringBuilder ans = new StringBuilder();
        while(!stk.isEmpty()){
            ans.append(stk.pop());
        }
        return ans.reverse().toString();
    }
}