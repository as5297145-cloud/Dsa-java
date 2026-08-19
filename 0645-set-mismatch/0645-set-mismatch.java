class Solution {
    public int[] findErrorNums(int[] nums) {
        int i = 0;
        while(i<nums.length){
            int c = nums[i]-1;
            if(nums[i]!=nums[c]){
                swap(nums,i,c);
            }
            else{
                i++;
            }
        }
        for(i = 0;i<nums.length;i++){
            if(nums[i]!=i+1){
                return new int[]{nums[i],i+1};
            }
        }
        return new int[]{-1,-1};
    }
    public void swap(int[] nums,int f,int s){
        int t =nums[f];
        nums[f]=nums[s];
        nums[s]=t;
    }
}