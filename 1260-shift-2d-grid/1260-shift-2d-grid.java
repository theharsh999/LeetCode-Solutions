class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int m = grid.length;
        int n = grid[0].length;
        int total = m * n;
        k %= total;
        if (k != 0) {
            reverse(grid, n, 0, total - 1);
            reverse(grid, n, 0, k - 1);
            reverse(grid, n, k, total - 1);
        }

        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            List<Integer> temp = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                temp.add(grid[i][j]);
            }
            ans.add(temp);
        }
        return ans;
    }

    public void reverse(int arr[][], int col, int i, int j) {
        while (i < j) {
            int temp = arr[i/col][j%col];
            arr[i/col][j%col] = arr[j/col][i%col];
            arr[j/col][i%col] = temp;
            i++;
            j--;
        }
    }
}