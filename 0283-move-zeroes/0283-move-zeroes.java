class Solution {
    public void moveZeroes(int[] nums) {
       int start = 0;
       int end = 0;
       while(end<nums.length){
        if(nums[end]!=0){
            swap(nums,start,end);
            start++;
        }
        end++;
       }
    }
    public void swap(int[] nums,int s,int e){
        int t = nums[s];
        nums[s]=nums[e];
        nums[e]=t;
    }
}