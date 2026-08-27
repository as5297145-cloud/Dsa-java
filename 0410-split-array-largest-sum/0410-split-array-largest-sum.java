class Solution {
    public int splitArray(int[] nums, int k) {
        int start = 0;
        int end = 0;
        for(int i = 0;i<nums.length;i++){
            start = Math.max(nums[i],start);
            end +=nums[i];
        }
        while(start<end){
            int mid = start + (end - start)/2;
            int sum=0;
            int p =1;
            for(int i = 0;i<nums.length;i++){
                if((sum+nums[i])>mid){
                    sum = nums[i];
                    p++;
                }
                else{
                    sum += nums[i];
                }
            }
            if(p<=k){
                end = mid;
            }
            else{
                start = mid + 1;
            }

        }
        return start;

    }
}