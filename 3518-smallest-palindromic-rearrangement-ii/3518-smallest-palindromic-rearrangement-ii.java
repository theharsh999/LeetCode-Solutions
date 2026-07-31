class Solution {
    public String smallestPalindrome(String s, int k) {
        int n = s.length();
        int freq[] = new int[26];
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            freq[ch - 'a']++;
        }

        //half the chars to build left part
        for (int i = 0; i < 26; i++) {
            freq[i] /= 2;
        }

        StringBuilder left = new StringBuilder();
        for (int i = 0; i < n / 2; i++) {
            boolean placedCharacter = false;
            for (int j = 0; j < 26; j++) {
                if (freq[j] > 0) {
                    freq[j]--;

                    //calculate ways
                    long ways = 1;
                    int letters = 0;
                    for(int a=0; a<26; a++){
                        letters += freq[a];
                    }

                    for (int x = 0; x < 26; x++) {
                        if (freq[x] > 0) {
                            ways *= nCr(letters, freq[x], k);
                            letters -= freq[x];
                        }
                        if (ways >= k)
                            break; //early break for optimization
                    }

                    if (k <= ways) {
                        left.append((char) (j + 'a'));
                        placedCharacter = true;
                        break;
                    } else {
                        k = k - (int) ways;
                        freq[j]++;
                    }
                }
            }
            if(placedCharacter == false){
                return "";
            }
        }
        StringBuilder right = new StringBuilder(left).reverse();
        if (n % 2 == 1) {
            left.append(s.charAt(n / 2));
        }
        left = left.append(right);
        return left.toString();
    }

    private long nCr(long n, int r, int k){
        r = (int)Math.min(r, n-r); // nCr == nC(n-r)
        long res = 1;
        for(int i=1; i<=r; i++){
            res = res * (n - r + i) / i;
            if(res >= k) return k;  // removes extra iterations
        }
        return res;
    }
}