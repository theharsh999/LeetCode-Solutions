class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        Arrays.sort(nums);
        int min = nums[0];
        int max = nums[nums.length -1];

        List<Integer> ans = new ArrayList<>();
        while(min <= max){
            if(!search(nums, min)){
                ans.add(min);
            }
            min++;
        }
        return ans;
    }

    public boolean search(int nums[], int target){
        int st = 0;
        int end = nums.length - 1;

        while(st <= end){
            int mid = st + (end - st)/2;
            if(nums[mid] == target){
                return true;
            }else if(nums[mid] < target){
                st = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        return false;
    }
}