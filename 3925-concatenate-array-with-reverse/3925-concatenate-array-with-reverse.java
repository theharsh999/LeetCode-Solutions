class Solution {
    public int[] concatWithReverse(int[] nums) {
        int res[] = new int[nums.length*2];
        for(int i=0; i<res.length/2; i++){
            res[i] = nums[i];
        }
        for(int i=res.length/2; i<res.length; i++){
            res[i] = res[res.length - i -1];
        }
        return res;
    }
}