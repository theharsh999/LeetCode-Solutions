class Solution {
    public boolean isHappy(int n) {
        for(int i=0; i<9; i++){
            int sum = 0;
            while(n > 0){
                int digit = n % 10;
                sum += (digit * digit);
                n /= 10;
            }
            if(sum == 1 || sum == 7){
                return true;
            }
            n = sum;
        }
        return false;
    }
}