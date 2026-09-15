class Solution {
    public String frequencySort(String s) {
        StringBuilder sb = new StringBuilder();
        int[] freq = new int[128];

        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i)]++;
        }

        while (sb.length() < s.length()) {
            int max = 0;
            int idx = -1;
            for (int i = 0; i < freq.length; i++) {
                if (freq[i] > max) {
                    max = freq[i];
                    idx = i;
                }
            }

            for (int i = 0; i < max; i++) {
                sb.append((char) idx);
            }
            freq[idx] = 0;
        }
        return sb.toString();
    }
}