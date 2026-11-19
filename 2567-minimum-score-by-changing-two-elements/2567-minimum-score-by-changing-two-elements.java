class Solution {
    public int minimizeSum(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        // skipping range and calculating min score
        int a = nums[n - 1] - nums[2]; // Change 2 smallest
        int b = nums[n - 2] - nums[1]; // Change smallest + largest
        int c = nums[n - 3] - nums[0]; // Change 2 largest

        return Math.min(a, Math.min(b, c));
    }
}