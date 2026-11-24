class Solution {
    public int maxLength(int[] nums) {
        int ans = -1;

        for (int i = 0; i < nums.length; i++) {
            long p = 1;
            int g = 0;
            long l = 1;
            for (int j = i; j < nums.length; j++) {
                p *= nums[j];
                g = gcd(g, nums[j]);
                l = lcm(l, nums[j]);

                if (p == g*l) {
                    ans = Math.max(ans, j - i + 1);
                }
            }
        }
        return ans;
    }

    public int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public long lcm(long a, long b) {
        return (a / gcd((int) a, (int) b)) * b;
    }
}