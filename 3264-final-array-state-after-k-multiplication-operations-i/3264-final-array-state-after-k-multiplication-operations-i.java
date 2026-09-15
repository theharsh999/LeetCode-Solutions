class Solution {
    static class Pair implements Comparable<Pair>{
        int val;
        int idx;

        public Pair(int val, int idx){
            this.val = val;
            this.idx = idx;
        }

        public int compareTo(Pair p2){
            if(this.val == p2.val){
                return this.idx - p2.idx;
            }
            return this.val - p2.val;
        }
    }
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        for(int i=0; i<nums.length; i++){
            pq.add(new Pair(nums[i],i));
        }

        while(k-- > 0){
            Pair pair = pq.remove();
            int num = pair.val;
            num *= multiplier;
            pq.add(new Pair(num, pair.idx));
        }

        for(int i=0; i<nums.length; i++){
            Pair p = pq.remove();
            nums[p.idx] = p.val;
        }
        return nums;
    }
}