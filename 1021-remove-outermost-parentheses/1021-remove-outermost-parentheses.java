class Solution {
    public String removeOuterParentheses(String s) {
        int depth = 0;
        StringBuilder ans = new StringBuilder();

        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch == '('){
                if(depth == 0){
                    depth++;
                    continue;
                }
                depth++;
            }else if(ch == ')'){
                depth--;
                if(depth == 0){
                    continue;
                }
            }
            ans.append(ch);
        }
        return ans.toString();
    }
}