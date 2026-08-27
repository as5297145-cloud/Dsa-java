class Solution {
    public boolean search(int[] nums, int target) {
        int p = pivot(nums);
        if(p == -1){
            return bs(nums,0,nums.length-1,target);
        }
        if(nums[p] == target){
            return true;
        }
        if(target>=nums[0] && target<nums[p]){
           return bs(nums,0,p,target);
        }
        else{
            return bs(nums,p+1,nums.length-1,target);
        }
    }
    public int pivot(int[] nums){
        int start = 0;
        int end = nums.length - 1;
        while(start<end){
            int mid = start + ( end - start )/2;
            if(mid>0 && nums[mid-1]>nums[mid]){
                return mid-1;
            }
            if(mid<nums.length && nums[mid]> nums[mid+1]){
                return mid;
            }
            if(nums[start]==nums[mid] && nums[mid]==nums[end]){
                if(nums[start]>nums[start+1]){
                    return start;
                }
                start++;
                if(end<=nums.length-1 && nums[end]<nums[end-1]){
                   return end-1;
                }
            }
            else if(nums[start]<nums[mid] || nums[start]==nums[mid] && nums[mid]>nums[end]){
                start = mid +1;
            }
            else{
                end = mid-1;
            }
        }
        return -1;
    }
    public boolean bs(int[] nums,int start,int end,int target){
        while(start<=end){
            int mid = start + (end-start)/2;
            if(nums[mid]==target){
                return true;
            }
            if(nums[mid]>target){
                end = mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return false;
    }
}