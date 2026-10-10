class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> map1 = new HashMap<>();
        HashMap<Character, Character> map2 = new HashMap<>();

        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(map1.containsKey(ch)){
                if(map1.get(ch) != t.charAt(i)){
                    return false;
                }
            }else{
                map1.put(ch,t.charAt(i));
            }
        }

        for(int i=0; i<t.length(); i++){
            char ch = t.charAt(i);
            if(map2.containsKey(ch)){
                if(map2.get(ch) != s.charAt(i)){
                    return false;
                }
            }else{
                map2.put(ch,s.charAt(i));
            }
        }
        return true;
    }
}