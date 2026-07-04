class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int ans[] = new int[nums1.length];
        int helper[] = new int[nums2.length];
        Stack<Integer> s = new Stack<>();

        for(int i=nums2.length-1; i>=0; i--){
            while(!s.isEmpty() && s.peek()<=nums2[i]){
                s.pop();
            }
            if(s.isEmpty()){
                helper[i] = -1;
            }else{
                helper[i] = s.peek();
            }
            s.push(nums2[i]);
        }

        for(int i=0; i<nums1.length; i++){
            int j=0;
            while(nums1[i] != nums2[j]){
                j++;
            }
            ans[i] = helper[j];
        }
        return ans;
    }
}