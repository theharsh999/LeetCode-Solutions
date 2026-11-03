class Solution {
    public int minMoves(int[] nums) {
        int max = -1;
        for (int i = 0; i < nums.length; i++) {
            max = Math.max(max, nums[i]);
        }

        int ops = 0;
        for (int i = 0; i < nums.length; i++) {
            ops += (max - nums[i]);
        }
        return ops;
    }
}