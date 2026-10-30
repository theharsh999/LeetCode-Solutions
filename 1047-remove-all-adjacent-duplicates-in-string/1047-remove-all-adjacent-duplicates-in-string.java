class Solution {
    public String removeDuplicates(String s) {
        Deque<Character> dq = new ArrayDeque<>();

        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(!dq.isEmpty() && dq.peek().equals(ch)){
                dq.pop();
            }else{
                dq.push(ch);
            }
        }
        StringBuilder sb = new StringBuilder();
        for(char c : dq){
            sb.append(c);
        }
        return sb.reverse().toString();
    }
}