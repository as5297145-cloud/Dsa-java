class Solution {
    public int firstMissingPositive(int[] nums) {
        int i = 0;
        while(i<nums.length){
            int c = nums[i]-1;
            if(nums[i]>0 && nums[i]<=nums.length && nums[i]!=nums[c]){
                swap(nums,i,c);
            }
            else{
                i++;
            }
        }
        for(i=0;i<nums.length;i++){
            if(nums[i]!=i+1){
                return i+1;
            }
        }
         return nums.length + 1;
    }
    public void swap(int[] nums,int f, int s){
        int t = nums[f];
        nums[f]=nums[s];
        nums[s]=t;
    }
}