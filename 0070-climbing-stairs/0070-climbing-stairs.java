class Solution {
    public int climbStairs(int n) {
        if(n == 1 || n == 2){
            return n;
        }
        int nM1 = 2;
        int nM2 = 1;
        int ways = 0;
        for(int i=3; i<=n; i++){
            ways = nM1 + nM2;
            nM2 = nM1;
            nM1 = ways;
        }
        return ways;
    }
}