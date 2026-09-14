class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int i = 0;
        int j = 1;
        int sum = nums[i];
        int count = 0;
        int min = nums.length+1;
        if(nums[i]>=target){
           return i+1; 
        }
        while(j<nums.length || sum>=target){
            if(sum<target){
                sum=sum+nums[j];
                j++;
            }
            else{
                count=j-i;
                min =  Math.min(min,count);
                sum=sum-nums[i];
                i++;
            }
        }
        if(min == nums.length + 1){
            return 0;
        }
        return min;
    }
}