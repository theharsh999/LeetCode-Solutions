class Solution {
    public boolean canAliceWin(int n) {
        boolean aliceTurn = true;
        int count = 10;

        while (n >= count) {
            n -= count;
            count--;
            aliceTurn = !aliceTurn;
        }

        return !aliceTurn;
    }
}