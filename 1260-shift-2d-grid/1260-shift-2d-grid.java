class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int m = grid.length;
        int n = grid[0].length;
        int total = m * n;
        k %= total;

        int arr[] = new int[total];
        int x = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[x++] = grid[i][j];
            }
        }
        if (k != 0) {
            reverse(arr, 0, total - 1);
            reverse(arr, 0, k - 1);
            reverse(arr, k, total - 1);
        }

        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            List<Integer> temp = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                temp.add(arr[i * n + j]);
            }
            ans.add(temp);
        }
        return ans;
    }

    public void reverse(int arr[], int st, int end) {
        while (st < end) {
            int temp = arr[st];
            arr[st] = arr[end];
            arr[end] = temp;
            st++;
            end--;
        }
    }
}