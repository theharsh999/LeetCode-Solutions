class Solution {
    public int minimumOperations(int[] nums) {
        Set<Integer> hm = new HashSet<>();
        for(int i=0; i<nums.length; i++){
            if(nums[i] != 0){
                hm.add(nums[i]);
            }
        }
        return hm.size();
    }
}