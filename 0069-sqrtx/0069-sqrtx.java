class Solution {
    public int mySqrt(int x) {
        int s = 0;
        int e = x;
        while(s<=e){
            int m = s + (e - s)/2;
            if((long)m*m==x){
                return m;
            }
            else if((long)m*m<x){
                s=m+1;
            }
            else{
                e=m-1;
            }
        }
        return e;
    }
}