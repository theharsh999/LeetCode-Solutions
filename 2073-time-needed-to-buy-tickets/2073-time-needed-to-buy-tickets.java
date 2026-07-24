class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        Deque<Integer> dq = new ArrayDeque<>();
        for (int i = 0; i < tickets.length; i++) {
            dq.add(i);
        }
        int timeCount = 0;
        
        while(!dq.isEmpty()){
            if(tickets[k] == 0){
                return timeCount;
            }
            if(tickets[dq.peek()] > 1){
                tickets[dq.peek()]--;
                dq.add(dq.remove());
                timeCount++;
            }else{
                tickets[dq.peek()]--;
                dq.remove();
                timeCount++;
            }
        }

        return timeCount;
    }
}