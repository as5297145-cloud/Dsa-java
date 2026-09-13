class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
         int i = m+n-1;
         int j= n-1;
         int a = m-1;
         while(a>=0 && j>=0){
            if(nums1[a]>nums2[j]){
                nums1[i]=nums1[a];
                a--;
                i--;
            }
            else{
                nums1[i]=nums2[j];
                j--;
                i--;
            }
        }
        while(j>=0){
            nums1[i]=nums2[j];
            i--;
            j--;
        }
    }
}