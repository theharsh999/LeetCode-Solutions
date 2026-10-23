class Solution {
    public int commonFactors(int a, int b) {
        int ans = 0;
        int minRange = Math.min(a,b);
        for(int i=1; i<=minRange; i++){
            if(a%i==0 && b%i==0){
                ans++;
            }
        }
        return ans;
    }
}