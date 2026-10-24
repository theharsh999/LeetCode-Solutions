class Solution {
    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
        int stAlice = strToInt(arriveAlice);
        int endAlice = strToInt(leaveAlice);
        int stBob = strToInt(arriveBob);
        int endBob = strToInt(leaveBob);

        int start = Math.max(stAlice, stBob);
        int end = Math.min(endAlice, endBob);
        if (start > end) {
            return 0;
        }

        return end - start + 1;
    }

    public int strToInt(String date) {
        String[] arr = date.split("-");
        int days[]={0,31,59,90,120,151,181,212,243,273,304,334};

        int month = Integer.parseInt(arr[0]);
        int total = Integer.parseInt(arr[1]);

        return total + days[month-1];
    }
}