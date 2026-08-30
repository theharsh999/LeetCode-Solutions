class Solution {
    public int minimumDeletions(int[] nums) {
        int n = nums.length;
        int smallIdx = 0;
        int largeIdx = 0;

        for(int i=0; i<nums.length; i++){
            if(nums[smallIdx] > nums[i]){
                smallIdx = i;
            }
            if(nums[largeIdx] < nums[i]){
                largeIdx = i;
            }
        }

        int left = Math.min(smallIdx, largeIdx);
        int right = Math.max(smallIdx, largeIdx);

        int front = right + 1;
        int back = n - left;
        int both = (left + 1) + (n-right);

        return Math.min(front, Math.min(back, both));
    }
}