class Solution {
    public long maxAlternatingSum(int[] nums) {
        int n = nums.length;
        for(int i=0; i<nums.length; i++){
            nums[i] *= nums[i];
        }
        Arrays.sort(nums);

        long left = 0, right = 0;
        for(int i=0; i<n/2; i++){
            left += nums[i];
        }
        for(int i=n/2; i<n; i++){
            right += nums[i];
        }
        return right-left;
    }
}