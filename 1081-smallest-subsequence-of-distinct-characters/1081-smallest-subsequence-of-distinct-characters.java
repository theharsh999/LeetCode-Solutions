class Solution {
    public String smallestSubsequence(String s) {
        Deque<Character> dq = new ArrayDeque<>();
        boolean visited[] = new boolean[26];
        int lastOccurence[] = new int[26];

        for (int i = 0; i < s.length(); i++) {
            lastOccurence[s.charAt(i) - 'a'] = i;
        }

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (visited[ch - 'a'] == false) {
                while (!dq.isEmpty() && dq.peek() > ch && lastOccurence[dq.peek() - 'a'] > i) {
                    visited[dq.pop() - 'a'] = false;
                }
                dq.push(ch);
                visited[ch - 'a'] = true;
            }

        }

        StringBuilder ans = new StringBuilder();
        while(!dq.isEmpty()){
            ans.append(dq.removeLast());
        }
        return ans.toString();
    }
}