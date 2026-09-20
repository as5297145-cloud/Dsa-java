class Solution {
    public int duplicateNumbersXOR(int[] nums) {
        int i = 0;
        int j = 1;
        int count = 0;
        int k = 0;
        int unique = 0;
        while(j<nums.length && i<nums.length){
           if(nums[i]==nums[j]){
            unique=(unique^nums[j]);
           }
           if(j==nums.length-1){
            i++;
            j=i;
           }
           j++;
        }
        return unique;
    }
}