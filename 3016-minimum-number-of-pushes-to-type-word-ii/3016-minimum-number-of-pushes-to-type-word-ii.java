class Solution {
    public int minimumPushes(String word) {
        int cost = 0;
        int freq[] = new int[26];
        for(int i=0; i<word.length(); i++){
            freq[word.charAt(i) - 'a']++;
        }
        Arrays.sort(freq);
        int pos = 0;
        for(int i=25; i>=0; i--){
            cost += freq[i] * (pos/8 + 1);
            pos++;
        }
        return cost;
    }
}