class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        Arrays.sort(deck);

        Deque<Integer> dq = new ArrayDeque<>();

        for (int i = deck.length - 1; i >= 0; i--) {
            if (!dq.isEmpty()) {
                dq.addFirst(dq.removeLast());
            }
            dq.addFirst(deck[i]);
        }

        int i = 0;
        while (!dq.isEmpty()) {
            deck[i++] = dq.removeFirst();
        }

        return deck;
    }
}