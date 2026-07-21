class Solution {
    public int splitArray(int[] nums, int k) {
        int left=0, right=0;
        for(int i=0; i<nums.length; i++){
            left = Math.max(nums[i],left);
            right += nums[i];
        }

        while(left <= right){
            int mid = left + (right-left)/2;
            if(canSplit(nums,mid,k)){
                right = mid-1;
            }else{
                left = mid+1;
            }
        }
        return left;
    }

    private boolean canSplit(int nums[], int sum, int k){
        int count = 1, total = 0;
        for(int n: nums){
            total += n;
            if(total > sum){
                total = n;
                count++;
            }
            if(count > k) return false;
        }
        return true;
    }
}