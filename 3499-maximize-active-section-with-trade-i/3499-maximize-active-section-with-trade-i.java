class Solution {
    public int maxActiveSectionsAfterTrade(String s) {
        ArrayList<Integer> zeros = new ArrayList<>();
        int activeCount = 0;
        for (char ch : s.toCharArray()) {
            if (ch == '1')
                activeCount++;
        }
        int zeroCount = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '0')
                zeroCount++;
            else {
                if (zeroCount > 0)
                    zeros.add(zeroCount);
                zeroCount = 0;
            }
        }
        if (zeroCount > 0) {
            zeros.add(zeroCount);
        }

        int maxPairSum = 0;
        for (int i = 1; i < zeros.size(); i++) {
            maxPairSum = Math.max(maxPairSum, zeros.get(i) + zeros.get(i - 1));
        }
        return maxPairSum + activeCount;
    }
}