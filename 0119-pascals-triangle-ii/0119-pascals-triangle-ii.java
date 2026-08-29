class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> ans = new ArrayList<>();
        for(int i=0; i<=rowIndex; i++){
            ans.add(nCr(rowIndex, i));
        }
        return ans;
    }

    public int nCr(int n, int r) {
        if (r < 0 || r > n)
            return 0;

        r = Math.min(r, n - r);
        long res = 1;

        for (int i = 1; i <= r; i++) {
            res = res * (n - r + i) / i;
        }
        return (int) res;
    }
}