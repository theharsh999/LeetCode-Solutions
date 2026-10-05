class Solution {
    public int scoreOfParentheses(String s) {
        Deque<Integer> dq = new ArrayDeque<>();
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            int score;
            if(ch == '('){
                dq.push(0);
            }else{
                int x = dq.pop();
                if(x == 0){
                    score = 1;
                }else{
                    score = 2 * x;
                }

                if(!dq.isEmpty()){
                    int top = dq.pop();
                    dq.push(top+score);
                }else{
                    dq.push(score);
                }
            }
        }
        return dq.pop();
    }
}