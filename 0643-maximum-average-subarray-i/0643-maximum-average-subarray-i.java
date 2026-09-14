class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int i = 0;
        int j = k;
        int sum = 0;
        for(int m = 0;m<k;m++){
           sum+=nums[m];
        }
        int max = sum;
        while(j<nums.length){
            sum+=nums[j]-nums[i];
            max = Math.max(max,sum);
            i++;
            j++;
        }
        double avg = (double)max/k;
        return avg;
    }
}