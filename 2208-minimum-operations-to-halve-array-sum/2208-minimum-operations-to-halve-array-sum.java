class Solution {
    public int halveArray(int[] nums) {
        int count = 0;
        double totalSum = 0;
        PriorityQueue<Double> pq = new PriorityQueue<>(Collections.reverseOrder());

        for (int i = 0; i < nums.length; i++) {
            pq.add((double) nums[i]);
            totalSum += nums[i];
        }
        double currSum = totalSum;

        while (currSum > (totalSum / 2)) {
            double num = pq.remove();
            currSum -= num;
            num = num / 2;
            currSum += num;
            pq.add(num);
            count++;
        }
        return count;
    }
}