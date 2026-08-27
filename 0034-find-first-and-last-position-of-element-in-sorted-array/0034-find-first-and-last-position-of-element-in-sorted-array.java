class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans = {-1,-1};
        int start = bs(nums,target,0,nums.length-1,true);
        int end = bs(nums,target,0,nums.length-1,false);
        ans[0] = start;
        ans[1] =end;
        return ans;
    }
    public int bs(int[] nums,int target,int start,int end,Boolean index){
        int ans = -1;
        while(start<=end){
            int mid = start + (end - start)/2;
            if(target<nums[mid]){
                end = mid -1;
            }
            else if(target>nums[mid]){
                start = mid +1;
            }
            else{
                ans = mid;
                 if(index==true){
                   end = mid-1;
                  }
                 else{
                   start=mid+1;
            
                  }
            }
           
        }
        return ans;
    }
}