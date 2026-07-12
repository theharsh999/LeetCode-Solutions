class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int ans[] = new int[n-k+1];
        int idx = 0;
        Deque<Integer> dq = new ArrayDeque<>();

        for(int i=0; i<n; i++){
            // maintain curr window in deque
            while(!dq.isEmpty() && dq.peekFirst() <= i-k){
                dq.removeFirst();
            }

            // maintaining decesding order
            while(!dq.isEmpty() && nums[dq.peekLast()] <= nums[i]){
                dq.removeLast();
            }

            dq.addLast(i);
            if(i >= k-1){
                ans[idx++] = nums[dq.peekFirst()];
            }
            
        }
        return ans;
    }
}