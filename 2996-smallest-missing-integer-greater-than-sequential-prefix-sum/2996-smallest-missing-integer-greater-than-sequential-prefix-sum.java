class Solution {
    public int missingInteger(int[] nums) {
        int i;
        int sum = nums[0];
        for(i = 1; i<nums.length; i++){
            if(nums[i] != nums[i-1] + 1){
                break;
            }
            sum += nums[i];
        }
        Arrays.sort(nums);
        for(int j=0; j<nums.length; j++){
            if(nums[j] == sum){
                sum++;
            }
        }
        return sum;
    }
}