class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int n = nums.size();
        int ans = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            for (int len = l; len <= r; len++) {
                if (i + len > n) {
                    break;
                }
                int sum = 0;

                for (int j = i; j < i + len; j++) {
                    sum += nums.get(j);
                }

                if (sum > 0) {
                    ans = Math.min(ans, sum);
                }
            }
        }

        return ans == Integer.MAX_VALUE ? -1 : ans;
    }
}