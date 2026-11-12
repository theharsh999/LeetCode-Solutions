class Solution {
    public long minimumCost(int cost1, int cost2, int costBoth, int need1, int need2) {
        int cost = Math.min(costBoth, cost1+cost2);
        int need = Math.min(need1, need2);

        long total = 0;
        total += (1L * need * cost);

        int rem1 = need1 - need;
        int rem2 = need2 - need;

        total += (1L * rem1 * Math.min(costBoth, cost1));
        total += (1L * rem2 * Math.min(costBoth, cost2));

        return total;
    }
}