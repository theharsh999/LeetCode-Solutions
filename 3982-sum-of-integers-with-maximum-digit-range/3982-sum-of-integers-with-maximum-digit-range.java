class Solution {
    public int maxDigitRange(int[] nums) {
        int ans = 0;
        int maxRange = 0;
        for(int i=0; i<nums.length; i++){
            int digit = digitRange(nums[i]);
            if(maxRange < digit){
                maxRange = digit;
                ans = 0;
            }
            if(digit == maxRange){
                ans += nums[i];
            }
        }
        return ans;
    }

    public int digitRange(int n) {
        int largest = 0;
        int smallest = 9;

        while(n > 0){
            int digit = n % 10;
            n /= 10;
            largest = Math.max(digit, largest);
            smallest = Math.min(digit, smallest);
        }
        return largest-smallest;
    }
}