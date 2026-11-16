class Solution {
    public String digitSum(String s, int k) {
        StringBuilder sb = new StringBuilder();

        while (s.length() > k) {
            for (int i = 0; i < s.length(); i += k) {
                int end = Math.min(i + k, s.length());
                String group = s.substring(i, end);
                sb.append(sum(group));
            }
            s = sb.toString();
            sb.setLength(0);
        }
        return s;
    }

    public int sum(String s) {
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            sum += (s.charAt(i) - '0');
        }
        return sum;
    }
}