class Solution {
    class Info implements Comparable<Info>{
        int count;
        int idx;

        public Info(int count, int idx){
            this.count = count;
            this.idx = idx;
        }

        @Override
        public int compareTo(Info info) {
            if(this.count != info.count){
                return this.count - info.count;
            }
            return this.idx - info.idx;
        }
    }
    public int[] kWeakestRows(int[][] mat, int k) {
        int ans[] = new int[k];
        PriorityQueue<Info> pq = new PriorityQueue<>();

        for(int i=0; i<mat.length; i++){
            int count = 0;
            for(int j=0; j<mat[0].length; j++){
                if(mat[i][j] == 1){
                    count++;
                }
            }
            pq.add(new Info(count, i));
        }

        for(int i=0; i<k; i++){
            ans[i] = pq.remove().idx;
        }
        return ans;
    }
}