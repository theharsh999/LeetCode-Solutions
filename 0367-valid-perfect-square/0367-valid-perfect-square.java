class Solution {
    public boolean isPerfectSquare(int num) {
        if (num == 1) {
            return true;
        }
        int left = 2, right = num;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (num / mid == mid && num % mid == 0) {
                return true;
            } else if (mid < num / mid) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return false;
    }
}