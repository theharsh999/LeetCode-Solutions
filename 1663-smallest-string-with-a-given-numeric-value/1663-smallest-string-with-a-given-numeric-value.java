class Solution {
    public String getSmallestString(int n, int k) {
        StringBuilder ans = new StringBuilder();
        while(k > 0){
            if(k-n >= 26){
                ans.append("z");
                k -= 26;
            }else{
                int num = k-n+1;
                char ch = (char)('a' + num - 1);
                ans.append(ch);
                k -= num;
            }
            n--;
        }
        return ans.reverse().toString();
    }
}