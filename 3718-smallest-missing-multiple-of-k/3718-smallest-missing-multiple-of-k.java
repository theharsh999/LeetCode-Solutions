class Solution {
    public int missingMultiple(int[] nums, int k) {
        for(int i=k; ;i+=k){
            if(!search(nums,i) && i%k==0){
                return i;
            }
        }
    }

    public boolean search(int arr[], int n){
        for(int i=0; i<arr.length; i++){
            if(arr[i] == n){
                return true;
            }
        }
        return false;
    }
}