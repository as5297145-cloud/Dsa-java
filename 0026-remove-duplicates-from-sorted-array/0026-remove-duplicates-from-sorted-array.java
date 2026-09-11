class Solution {
    public int removeDuplicates(int[] nums) {
        int start = 0;
        int end = 0;
        while(end<nums.length){
            if(nums[start]!=nums[end]){
                swap(nums,start+1,end);
                start++;
            }
            end++;
        }
        return start+1;
    }
    public void swap(int[] nums,int s,int e){
        int t = nums[s];
        nums[s]=nums[e];
        nums[e]=t;
    }
}