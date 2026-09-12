class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int start = 0;
        int mid = 0;
        int end = nums.length-1;
        while(start<end){
            if(nums[mid]%2==0){
                swap(nums,start,mid);
                start++;
                mid++;
            }
            else{
                swap(nums,mid,end);
                end--;
            }
        }
        return nums;
    }
    public void swap(int[] nums,int f,int s){
        int t = nums[f];
        nums[f]=nums[s];
        nums[s]=t;
    }
}