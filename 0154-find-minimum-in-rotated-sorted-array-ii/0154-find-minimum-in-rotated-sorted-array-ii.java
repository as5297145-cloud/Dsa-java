class Solution {
    public int findMin(int[] nums) {
        int s1=0,e1=0,s2=0,e2=0;
        int start =0;
        int end = nums.length-1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(nums.length == 1){
                return nums[start];
            }
            if(mid>0 && nums[mid-1]>nums[mid]){
                return nums[mid];
            }
            if(mid<nums.length-1 && nums[mid]>nums[mid+1]){
                return nums[mid+1];
            }
            if(nums[mid]>nums[end]){
                start =mid;
            }
            else if(nums[mid]<nums[end]){
                end = mid -1;
            }
            else{
                end--;
            }
        }
    return nums[start];
    }
}