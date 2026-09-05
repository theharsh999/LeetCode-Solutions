class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n = nums.length; 
        int suffMin[] = new int[n];

        int min = nums[n-1];
        for(int i=n-1; i>=0; i--){
            min = Math.min(nums[i], min);
            suffMin[i] = min;
        }

        int max = nums[0];
        for(int i=0; i<n; i++){
            max = Math.max(max, nums[i]);
            if(max - suffMin[i] <= k){
                return i;
            }
        }
        return -1;
    }
}