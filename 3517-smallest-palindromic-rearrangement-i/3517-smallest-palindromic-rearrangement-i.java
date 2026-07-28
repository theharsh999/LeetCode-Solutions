class Solution {
    public String smallestPalindrome(String s) {
        if(s.length() == 1){
            return s;
        }
        int freq[] = new int[26];
        StringBuilder ans = new StringBuilder();

        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            freq[ch - 'a']++;
        }
        StringBuilder left = new StringBuilder();
        char mid = ' ';
        for(int i=0; i<26; i++){
            if(freq[i] > 0){
                int count = freq[i]/2;
                for(int j = 0; j < count; j++){
                    left.append((char)('a' + i));
                }
            }
            if(freq[i] % 2 == 1){
                mid = (char)('a' + i);
            }
        }

        ans.append(left);
        if(s.length() % 2 != 0){
            ans.append(mid);
        }
        ans.append(left.reverse());
        return ans.toString();
    }
}