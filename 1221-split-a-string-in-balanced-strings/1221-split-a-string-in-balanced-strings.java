class Solution {
    public int balancedStringSplit(String s) {
        int ans = 0;
        int r = 0, l = 0;
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch == 'R'){
                r++;
            }else{
                l++;
            }

            if(r == l) ans++;
        }
        return ans;
    }
}