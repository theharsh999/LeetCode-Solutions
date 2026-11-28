class Solution {
    public List<String> subdomainVisits(String[] cpdomains) {
        HashMap<String, Integer> map = new HashMap<>();

        for (String s : cpdomains) {
            String[] arr = s.split(" ");
            int count = Integer.parseInt(arr[0]);
            String domain = arr[1];

            while (true) {
                map.put(domain, map.getOrDefault(domain, 0) + count);
                int i = domain.indexOf(".");
                if (i == -1)
                    break;
                domain = domain.substring(i + 1);
            }
        }
        List<String> ans = new ArrayList<>();
        for (String key : map.keySet()) {
            ans.add(map.get(key) + " " + key);
        }
        return ans;
    }
}