class Solution {
    public String makeSmallestPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        StringBuilder sb = new StringBuilder(s);

        while(left < right){
            if (sb.charAt(left) != sb.charAt(right)) {
                char smaller = (char) Math.min(sb.charAt(left), sb.charAt(right));
                sb.setCharAt(left, smaller);
                sb.setCharAt(right, smaller);
            }
            left++; right--;
        }
        return sb.toString();
    }
}