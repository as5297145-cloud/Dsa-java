class Solution {
    public int missingNumber(int[] nums) {
        int i = 0;
        while(i<nums.length){
            int c = nums[i];
            if(nums[i]<nums.length && nums[c]!=nums[i]){
                swap(nums,i,c);
            }
            else{
                i++;
            }
        }
        for(i = 0;i<nums.length;i++){
            if(nums[i]!=i){
                return i;
            }
        }
        return nums.length;
    }
    public void swap(int[] nums,int f,int s){
        int temp = nums[f];
        nums[f]=nums[s];
        nums[s]=temp;
    }
}