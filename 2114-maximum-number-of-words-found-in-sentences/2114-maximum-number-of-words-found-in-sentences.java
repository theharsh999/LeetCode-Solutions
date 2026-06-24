class Solution {
    public int mostWordsFound(String[] sentences) {
        int maxCount = 0;
        int longestString = 0;
        int longestSentence = 0;
        for(int i=0; i<sentences.length; i++){
            int currCount = 0;
            for(int j=0; j<sentences[i].length(); j++){
                if(sentences[i].charAt(j) == ' '){
                    currCount++;
                }
            }
            maxCount = Math.max(maxCount, currCount);
        }
        return maxCount+1;
    }
}