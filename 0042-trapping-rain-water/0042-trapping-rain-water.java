class Solution {
    public int trap(int[] height) {
        int n = height.length;
        Stack<Integer> s = new Stack<>();
        int totalWater = 0;
        for (int i = 0; i < n; i++) {
            while (!s.isEmpty() && height[i] > height[s.peek()]) {
                int bottom = s.pop();
                if(s.isEmpty()){
                    break;
                }else{
                    int width = i - s.peek() - 1;
                    int ht = Math.min(height[i], height[s.peek()]) - height[bottom];
                    int currWater = ht * width;
                    totalWater += currWater;
                }
            }
            s.push(i);
        }
        return totalWater;
    }
}