class Solution {
    public int gcdOfOddEvenSums(int n) {
        int oddSum = n * n;
        int evenSum = n * (n + 1);
        return gcd(oddSum, evenSum);
    }

    public int gcd(int n1, int n2){
        int ans = 1;
        for(int i=n1; i>=1; i--){
            if(n1%i==0 && n2%i==0){
                ans = i;
                return ans;
            }
        }
        return ans;
    }
}