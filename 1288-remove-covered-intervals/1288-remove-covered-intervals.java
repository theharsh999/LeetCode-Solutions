class Solution {
    public int removeCoveredIntervals(int[][] intervals) {
        int n = intervals.length;
        Arrays.sort(intervals, (a, b) -> {
            if (a[0] != b[0]) {
                return Integer.compare(a[0], b[0]);
            }
            return Integer.compare(b[1], a[1]);
        });
        int count = n;
        int maxRight = intervals[0][1];
        for (int i = 1; i < n; i++) {
            int currRight = intervals[i][1];
            if(currRight <= maxRight){
                count--;
            }
            maxRight = Math.max(currRight, maxRight);
        }
        return count;
    }
}