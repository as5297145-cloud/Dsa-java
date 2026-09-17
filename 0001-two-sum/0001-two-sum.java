class Solution {
    public int[] twoSum(int[] nums, int target) {
       int i = 0;
       int j = 1;
       int sum = 0;
       while(j<nums.length && i<nums.length ){
            sum = nums[i]+nums[j];
            if(sum==target){
                return new int[]{i,j};
            }
            if(j==nums.length-1){
                i++;
                j=i+1;
            }
            else{
                j++;
            }
       }
       return new int[]{-1,-1};
    }
}