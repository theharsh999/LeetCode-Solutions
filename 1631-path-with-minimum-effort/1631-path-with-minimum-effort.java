class Solution {
    static class Tuple{
        int dist;
        int row;
        int col;

        public Tuple(int dist, int row, int col){
            this.dist = dist;
            this.row = row;
            this.col = col;
        }
    }
    public int minimumEffortPath(int[][] heights) {
        PriorityQueue<Tuple> pq = new PriorityQueue<Tuple>((x,y) -> x.dist - y.dist);

        int n = heights.length;
        int m = heights[0].length;
        int dist[][] = new int[n][m];
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                dist[i][j] = (int)(1e9);
            }
        }
        dist[0][0] = 0;
        pq.add(new Tuple(0,0,0));
        int dr[] = {-1,0,1,0};
        int dc[] = {0,1,0,-1};

        while(pq.size() != 0){
            Tuple it = pq.peek();
            pq.remove();
            int diff = it.dist;
            int row = it.row;
            int col = it.col;

            if(row == n-1 && col == m-1) return diff;

            for(int i=0; i<4; i++){
                int newR = row + dr[i];
                int newC = col + dc[i];

                if(newR>=0 && newC>=0 && newR<n && newC<m){
                    int newEffort = Math.max(diff, Math.abs(heights[row][col] - heights[newR][newC]));
                    if(newEffort < dist[newR][newC]){
                        dist[newR][newC] = newEffort;
                        pq.add(new Tuple(newEffort, newR, newC));
                    }
                }
            }
        }
        return 0;
    }
}