class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        Deque<Integer> dq = new ArrayDeque<>();
        for (int i = 0; i < tickets.length; i++) {
            dq.add(i);
        }
        int timeCount = 0;

        while (!dq.isEmpty()) {
            int x = dq.peek();
            tickets[x]--;
            timeCount++;

            if (tickets[x] > 0)
                dq.add(dq.remove());
            else
                dq.remove();

            if (tickets[k] == 0)
                return timeCount;
        }

        return timeCount;
    }
}