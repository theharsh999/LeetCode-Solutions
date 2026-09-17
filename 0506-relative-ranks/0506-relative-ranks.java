class Solution {
    class Pair implements Comparable<Pair> {
        int rank;
        int idx;

        public Pair(int rank, int idx) {
            this.rank = rank;
            this.idx = idx;
        }

        public int compareTo(Pair p2) {
            return p2.rank - this.rank;
        }
    }

    public String[] findRelativeRanks(int[] score) {
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        for (int i = 0; i < score.length; i++) {
            pq.add(new Pair(score[i], i));
        }

        String ans[] = new String[score.length];
        int rank = 1;
        while (!pq.isEmpty()) {
            Pair p = pq.poll();

            if (rank == 1) {
                ans[p.idx] = "Gold Medal";
            } else if (rank == 2) {
                ans[p.idx] = "Silver Medal";
            } else if (rank == 3) {
                ans[p.idx] = "Bronze Medal";
            } else {
                ans[p.idx] = String.valueOf(rank);
            }
            rank++;
        }
        return ans;
    }
}