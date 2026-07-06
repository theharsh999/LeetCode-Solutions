class Solution {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        Stack<Integer> s = new Stack<>();
        int maxArea = 0;

        for (int i = 0; i < n; i++) {
            while (!s.isEmpty() && heights[s.peek()] >= heights[i]) {
                int idx = s.pop();
                int height = heights[idx];
                int left = s.isEmpty() ? -1 : s.peek();
                int width = i - left - 1;
                maxArea = Math.max(maxArea, height * width);
            }
            s.push(i);
        }
        while (!s.isEmpty()) {
            int idx = s.pop();
            int height = heights[idx];
            int left = s.isEmpty() ? -1 : s.peek();
            int width = n - left - 1;
            maxArea = Math.max(maxArea, height * width);
        }
        return maxArea;
    }
}