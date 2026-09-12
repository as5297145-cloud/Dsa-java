class Solution {
    public int[] sortedSquares(int[] nums) {
        int start = 0;
        int end = nums.length-1;
        int[] ans = new int[nums.length];
        int index = nums.length-1;
        while(start<=end){
            if(Math.abs(nums[start])>=Math.abs(nums[end])){
                ans[index]=nums[start]*nums[start];
                index--;
                start++;
            }
            else{
                ans[index]=nums[end]*nums[end];
                index--;
                end--;
            }
        }
        return ans;
    }
    public void swap(int[] nums,int f,int s){
        int t = f;
        f=nums[s];
        nums[s]=t;
    }
}