class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int start = 1;
        int end = 0;
        for(int i = 0;i<piles.length;i++){
            end = Math.max(piles[i],end);
        }
        while(start<end){
            int mid = start + (end - start)/2;
            long p = 0L;
            for(int i =0;i<piles.length;i++){
                if(piles[i]<=mid){
                    p=p+1;
                }
                else{
                    p = p + (piles[i]+mid-1)/mid;
                }
            }
            if(p>h){
                start = mid + 1;
            }else{
                end = mid;
            }
        }
        return start;
    }
}