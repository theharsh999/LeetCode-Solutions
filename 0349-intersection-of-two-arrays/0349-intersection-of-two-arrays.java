class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> common = new HashSet<>();

        for(int i=0; i<nums1.length; i++){
            set.add(nums1[i]);
        }
        for(int i=0; i<nums2.length; i++){
            if(set.contains(nums2[i])){
                common.add(nums2[i]);
            }
        }

        int ans[] = new int[common.size()];
        int i=0;

        for(int x : common){
            ans[i++] = x;
        }
        return ans;
    }
}