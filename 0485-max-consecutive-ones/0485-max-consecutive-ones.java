class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int i=0;
        int j=0;
        int count=0;
        int max = 0;
        while(j<nums.length){
            if(nums[j] ==1){
                count=j-i+1;
                max = Math.max(count,max);
                j++;
            }
            else{
                i=j+1;
                j++;
            }
        }
        return max;
    }
}