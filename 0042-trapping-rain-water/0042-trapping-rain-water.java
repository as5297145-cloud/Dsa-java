 class Solution {
    public int trap(int[] height) {
        int start = 0;
        int end = height.length-1;
        int left=0;
        int right=0;
        int water=0;
        while(start<end){
            if(height[start]<height[end]){
               if(height[start]>=left){
                left=height[start];
               }
               else{
                water+=left-height[start];
               }
               start++;
            }
            else{
                if(height[end]>=right){
                    right=height[end];
                }
                else{
                    water+=right-height[end];
                }
                end--;
            }
        }
        return water;
    }
}