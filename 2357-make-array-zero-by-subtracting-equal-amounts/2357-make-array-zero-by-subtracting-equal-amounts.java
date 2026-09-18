class Solution {
    public int minimumOperations(int[] nums) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            if(nums[i] != 0){
                hm.put(nums[i], i);
            }
        }
        return hm.size();
    }
}