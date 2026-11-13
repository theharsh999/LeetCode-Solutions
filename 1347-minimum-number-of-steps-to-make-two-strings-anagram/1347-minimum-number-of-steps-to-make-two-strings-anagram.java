class Solution {
    public int minSteps(String s, String t) {
        int freq[] = new int[26];

        for (int i = 0; i < s.length(); i++) {
            char ch1 = s.charAt(i);
            char ch2 = t.charAt(i);
            freq[ch1 - 'a']++;
            freq[ch2 - 'a']--;
        }

        int ans = 0;
        for (int i = 0; i < 26; i++) {
            if (freq[i] > 0) {
                ans += freq[i];
            }
        }

        return ans;
    }
}