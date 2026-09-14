class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int i = 0;
        int j = k;
        int sum = 0;
        int count = 0;
        for(int m = 0;m<k;m++){
           sum+=arr[m];
        }
        while(j<arr.length){
           int avg = sum/k;
           if(avg>=threshold){
                count++;
           }
           sum=sum+arr[j]-arr[i];
           i++;
           j++;
        }
        if(sum / k >= threshold){
           count++;
        }
        return count;
    }
}