class Solution {
    public long maxPairStrength(int[] nums) {
        long maxStr = -1;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                long g = gcd(nums[i], nums[j]);
                long curr = (1L * nums[i] * nums[j]) / (g * g);
                maxStr = Math.max(maxStr, curr);
            }
        }
        return maxStr;
    }

    public long gcd(int a, int b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }
}