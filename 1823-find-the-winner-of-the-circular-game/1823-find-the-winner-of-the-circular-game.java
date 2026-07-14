class Solution {
    public int findTheWinner(int n, int k) {
        Deque<Integer> dq = new ArrayDeque<>();
        for(int i=1; i<=n; i++){
            dq.add(i);
        }
        while(dq.size() > 1){
            int temp = k;
            while(temp-- > 1){
                dq.add(dq.remove());
            }
            dq.remove();
        }
        return dq.remove();
    }
}