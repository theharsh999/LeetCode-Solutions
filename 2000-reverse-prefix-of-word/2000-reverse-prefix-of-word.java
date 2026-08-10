class Solution {
    public String reversePrefix(String word, char ch) {
        Deque<Character> stk = new ArrayDeque<>();
        int idx = 0;
        boolean isFound = false;
        for(int i=0; i<word.length(); i++){
            idx++;
            if(word.charAt(i) == ch){
                isFound = true;
                break;
            }
            stk.push(word.charAt(i));
        }
        if(!isFound){
            return word;
        }
        StringBuilder sb = new StringBuilder().append(ch);
        while(!stk.isEmpty()){
            sb.append(stk.pop());
        }

        for(int i=idx; i<word.length(); i++){
            sb.append(word.charAt(i));
        }
        return sb.toString();
    }
}