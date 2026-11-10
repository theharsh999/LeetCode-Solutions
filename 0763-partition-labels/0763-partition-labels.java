class Solution {
    public List<Integer> partitionLabels(String s) {
        int lastOcc[] = new int[26];
        List<Integer> res = new ArrayList<>();

        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            lastOcc[ch-'a'] = i;
        }

        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            int end = lastOcc[ch-'a'];
            int j = i+1;

            while(j < end){
                if(lastOcc[s.charAt(j) - 'a'] > end){
                    end = Math.max(end, lastOcc[s.charAt(j) - 'a']);
                }
                j++;
            }
            res.add(end - i + 1);
            i = end;
        }
        return res;
    }
}