class Solution {
    public int[] arrayRankTransform(int[] arr) {
        if (arr.length == 0)
            return arr;
        int[] copy = arr.clone();
        Arrays.sort(copy);

        // remove duplicate from copied arr for accurate ranking
        int j = 0;
        for (int i = 1; i < arr.length; i++) {
            if (copy[i] != copy[j]) {
                copy[++j] = copy[i];
            }
        }

        // rank the elements in arr
        for (int i = 0; i < arr.length; i++) {
            arr[i] = binarySearch(copy, arr[i], j) + 1;
        }

        return arr;
    }

    private int binarySearch(int[] arr, int target, int last) {
        int left = 0, right = last;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target)
                return mid;
            else if (arr[mid] < target)
                left = mid + 1;
            else
                right = mid - 1;
        }

        return -1;
    }
}