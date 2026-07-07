class Solution {
    public String simplifyPath(String path) {
        Stack<String> s = new Stack<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < path.length(); i++) {
            char ch = path.charAt(i);
            String curr = sb.toString();
            if (ch == '/') {
                if (curr.equals("..") && !s.isEmpty()) {
                    s.pop();
                } else if (!curr.equals("") && !curr.equals(".") && !curr.equals("..")) {
                    s.push(curr);
                }
                sb = new StringBuilder();
            } else {
                sb.append(ch);
            }
        }
        if (!sb.toString().equals("")) {
            if(sb.toString().equals("..")){
                if(!s.isEmpty()){
                    s.pop();
                }
            }else if(!sb.toString().equals(".")){
                s.push(sb.toString());
            }
            sb = new StringBuilder();
        }

        for(String dir: s){
            sb.append("/");
            sb.append(dir);
        }

        if(sb.toString().equals("")){
            return "/";
        }
        return sb.toString();
    }
}