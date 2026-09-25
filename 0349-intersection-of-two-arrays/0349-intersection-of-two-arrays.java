class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> s1 = new HashSet<>();
        HashSet<Integer> s2 = new HashSet<>();

        for(int i=0; i<nums1.length; i++){
            s1.add(nums1[i]);
        }
        for(int i=0; i<nums2.length; i++){
            s2.add(nums2[i]);
        }

        s1.retainAll(s2);
        int ans[] = new int[s1.size()];
        int i=0;

        for(int x : s1){
            ans[i++] = x;
        }
        return ans;
    }
}