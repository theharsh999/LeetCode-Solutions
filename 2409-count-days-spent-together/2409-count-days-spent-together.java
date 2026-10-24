class Solution {
    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
        int[] days = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        int stAlice = strToInt(days, arriveAlice);
        int endAlice = strToInt(days, leaveAlice);
        int stBob = strToInt(days, arriveBob);
        int endBob = strToInt(days, leaveBob);

        int start = Math.max(stAlice, stBob);
        int end = Math.min(endAlice, endBob);
        if (start > end) {
            return 0;
        }

        return end - start + 1;
    }

    public int strToInt(int days[], String date) {
        String[] arr = date.split("-");

        int month = Integer.parseInt(arr[0]);
        int total = Integer.parseInt(arr[1]);

        for (int i = 0; i < month-1; i++) {
            total += days[i];
        }

        return total;
    }
}