class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character, String> hm1 = new HashMap<>();
        HashMap<String, Character> hm2 = new HashMap<>();
        String[] arr = s.split("\\s+");
        if (pattern.length() != arr.length)
            return false;

        for (int i = 0; i < pattern.length(); i++) {
            char ch = pattern.charAt(i);
            String word = arr[i];

            if (hm1.containsKey(ch)) {
                if (!hm1.get(ch).equals(word))
                    return false;
            } else if (hm2.containsKey(word)) {
                return false;
            } else {
                hm1.put(ch, word);
                hm2.put(word, ch);
            }
        }
        return true;
    }
}