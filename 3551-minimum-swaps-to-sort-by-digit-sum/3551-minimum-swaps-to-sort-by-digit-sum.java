class Solution {

    public int minSwaps(int[] nums) {
        int n = nums.length;

        // Step 1: Create Integer array with original indices
        Integer[] indices = new Integer[n];
        for (int i = 0; i < n; i++) {
            indices[i] = i;
        }

        // Step 2: Sort indices based on digit sum of nums[index]
        Arrays.sort(indices, (a, b) -> {
            int sumA = digitSum(nums[a]);
            int sumB = digitSum(nums[b]);

            if (sumA != sumB) {
                return Integer.compare(sumA, sumB);
            }

            return Integer.compare(nums[a], nums[b]);
        });

        // Step 3: Use sorted indices to detect cycles
        boolean[] visited = new boolean[n];
        int swaps = 0;

        for (int i = 0; i < n; i++) {
            if (visited[i] || indices[i] == i) {
                continue;
            }
            int cycleLength = 0;
            int current = i;

            while (!visited[current]) {
                visited[current] = true;
                cycleLength++;
                current = indices[current];
            }

            swaps += cycleLength - 1;
        }

        return swaps;
    }

    private int digitSum(int num) {
        int sum = 0;

        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }

        return sum;
    }
}