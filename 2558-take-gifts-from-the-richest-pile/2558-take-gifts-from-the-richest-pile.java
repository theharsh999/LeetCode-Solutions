class Solution {
    public long pickGifts(int[] gifts, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0; i<gifts.length; i++){
            pq.add(gifts[i]);
        }

        while(k-- > 0){
            int num = pq.remove();
            num = (int)Math.sqrt(num);
            pq.add(num);
        }

        long ans = 0;
        while(!pq.isEmpty()){
            ans += pq.remove();
        }
        return ans;
    }
}