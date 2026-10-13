class Solution {
    public long maxAlternatingSum(int[] nums) {
        int n = nums.length;
        for(int i=0; i<nums.length; i++){
            nums[i] *= nums[i];
        }
        Arrays.sort(nums);

        long left = Arrays.stream(nums).limit(n/2).asLongStream().sum();
        long right = Arrays.stream(nums).skip(n/2).asLongStream().sum();
        return right-left;
    }
}