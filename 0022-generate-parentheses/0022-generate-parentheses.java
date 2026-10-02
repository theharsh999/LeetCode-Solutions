class Solution {
    List<String> result = new ArrayList<>();

    public void solve(StringBuilder sb, int n, int open, int close) {
        if (sb.length() == 2 * n) {
            result.add(sb.toString());
            return;
        }

        if (open < n) {
            sb.append("(");
            solve(sb, n, open+1, close);
            sb.deleteCharAt(sb.length() - 1);
        }

        if (close < open) {
            sb.append(")");
            solve(sb, n, open, close+1);
            sb.deleteCharAt(sb.length() - 1);
        }
    }

    public List<String> generateParenthesis(int n) {
        StringBuilder sb = new StringBuilder("");
        int open = 0;
        int close = 0;
        solve(sb, n, open, close);
        return result;
    }
}