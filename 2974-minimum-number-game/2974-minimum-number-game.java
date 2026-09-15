class Solution {
    public int[] numberGame(int[] nums) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i=0; i<nums.length; i++){
            pq.add(nums[i]);
        }
        int idx = 0;

        while(!pq.isEmpty()){
            int alice = pq.remove();
            int bob = pq.remove();

            nums[idx++] = bob;
            nums[idx++] = alice;
        }
        return nums;
    }
}