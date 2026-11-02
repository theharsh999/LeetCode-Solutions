class Solution {
    public int minMoves2(int[] nums) {
        int ops = 0;
        Arrays.sort(nums);
        int common = nums[nums.length / 2];

        for (int i = 0; i < nums.length; i++) {
            ops += Math.abs(nums[i] - common);
        }
        return ops;
    }
}