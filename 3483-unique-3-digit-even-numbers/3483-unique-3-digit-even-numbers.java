class Solution {
    public int totalNumbers(int[] digits) {
        int freq[] = new int[10];
        for (int i = 0; i < digits.length; i++) {
            freq[digits[i]]++;
        }

        int count = 0;
        for (int i = 1; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 9; k += 2) {
                    // Check required copies
                    if (i == j && j == k) {
                        if (freq[i] >= 3) {
                            count++;
                        }
                    } else if (i == j) {
                        if (freq[i] >= 2 && freq[k] >= 1) {
                            count++;
                        }
                    } else if (i == k) {
                        if (freq[i] >= 2 && freq[j] >= 1) {
                            count++;
                        }
                    } else if (j == k) {
                        if (freq[j] >= 2 && freq[i] >= 1) {
                            count++;
                        }
                    } else {
                        if (freq[i] >= 1 &&
                                freq[j] >= 1 &&
                                freq[k] >= 1) {
                            count++;
                        }
                    }
                }
            }
        }

        return count;
    }
}