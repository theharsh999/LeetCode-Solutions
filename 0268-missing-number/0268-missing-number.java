class Solution {
    public int missingNumber(int[] nums) {
        int actualSum = 0;
        int currSum = 0;
        for(int i=0; i<nums.length; i++){
            actualSum += i;
            currSum += nums[i];
        }
        actualSum += nums.length;
        return actualSum - currSum;
    }
}