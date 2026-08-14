class Solution {
    public int maximumLengthSubstring(String s) {
        int freq[] = new int[26];
        int left = 0, right = 0;
        int maxLength = 0;

        while (right < s.length()) {
            char ch = s.charAt(right);
            freq[ch-'a']++;
            while(!isValid(freq)){
                freq[s.charAt(left) - 'a']--;
                left++;
            }
            right++;
            maxLength = Math.max(maxLength, right - left);
        }
        return maxLength;
    }

    public boolean isValid(int freq[]){
        for(int i=0; i<freq.length; i++){
            if(freq[i] > 2){
                return false;
            }
        }
        return true;
    }
}