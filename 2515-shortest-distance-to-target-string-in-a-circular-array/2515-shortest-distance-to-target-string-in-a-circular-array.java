class Solution {
    public int closestTarget(String[] words, String target, int startIndex) {
        int n = words.length;
        int left = 0;
        int right = 0;
        int i = n-1;

        while(i-- > 0){
            if(words[(startIndex-left+n)%n].equals(target)){
                return Math.min(left,right);
            }else if(words[(startIndex+right)%n].equals(target)){
                return Math.min(left,right);
            }
            left++; right++;
        }
        return -1;
    }
}