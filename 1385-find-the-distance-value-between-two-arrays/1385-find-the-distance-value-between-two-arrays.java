class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        Arrays.sort(arr2);
        int ans = 0;

        for (int i = 0; i < arr1.length; i++) {
            int left = 0, right = arr2.length-1;
            boolean found = false;
            while (left <= right) {
                int mid = left + (right - left) / 2;
                if (arr2[mid] > arr1[i]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
                if (Math.abs(arr1[i] - arr2[mid]) <= d) {
                    found = true;
                    break;
                }
            }
            if(!found) ans++;
        }
        return ans;
    }
}