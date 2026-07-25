class Solution {
    public int maxProduct(int n) {
        int large = -1, larger = -1;
        while(n > 0){
            int num = n % 10;
            if(num > larger){
                large = larger;
                larger = num;
            }else if(num > large){
                large = num;
            }
            n /= 10;
        }
        return large * larger;
    }
}