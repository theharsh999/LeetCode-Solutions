class Solution {
    public int[] resultArray(int[] nums) {
        int n = nums.length;
        ArrayList<Integer> arr1 = new ArrayList<>();
        arr1.add(nums[0]);
        ArrayList<Integer> arr2 = new ArrayList<>();
        arr2.add(nums[1]);
        
        for(int i=2; i<n; i++){
            if(arr1.get(arr1.size()-1) > arr2.get(arr2.size()-1)){
                arr1.add(nums[i]);
            }else{
                arr2.add(nums[i]);
            }
        }
        
        int ans[] = new int[n];
        int idx = 0;
        while(!arr1.isEmpty()){
            ans[idx++] = arr1.remove(0);
        }
        while(!arr2.isEmpty()){
            ans[idx++] = arr2.remove(0);
        }
        return ans;
    }
}