class Solution {
    public long countCommas(long n) {
        if(n < 1000){
            return 0;
        }
        long result = 0;
        long lower = 1000;
        long upper;
        long comma = 1;

        while(lower <= n){
            upper = lower * 1000 - 1;
            if(upper > n){
                upper = n;
            }

            long countNos = (upper - lower + 1) ;
            result += countNos * comma;

            lower = lower * 1000;
            comma++;
        }
        return result;
    }
}